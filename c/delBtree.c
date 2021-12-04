// Deleting a key from a B-tree in C

#include <stdio.h>
#include <stdlib.h>

#define MAX 3
#define MIN 2

struct BTreeNode
{
    int item[MAX + 1], count;
    struct BTreeNode *linker[MAX + 1];
};

struct BTreeNode *root;

// Node creation
struct BTreeNode *createNode(int item, struct BTreeNode *child)
{
    struct BTreeNode *newNode;
    newNode = (struct BTreeNode *)malloc(sizeof(struct BTreeNode));
    newNode->item[1] = item;
    newNode->count = 1;
    newNode->linker[0] = root;
    newNode->linker[1] = child;
    return newNode;
}

// Add value to the node
void addValToNode(int item, int pos, struct BTreeNode *node,
                  struct BTreeNode *child)
{
    int j = node->count;
    while (j > pos)
    {
        node->item[j + 1] = node->item[j];
        node->linker[j + 1] = node->linker[j];
        j--;
    }
    node->item[j + 1] = item;
    node->linker[j + 1] = child;
    node->count++;
}

// Split the node
void splitNode(int item, int *pval, int pos, struct BTreeNode *node,
               struct BTreeNode *child, struct BTreeNode **newNode)
{
    int median, j;

    if (pos > MIN)
        median = MIN + 1;
    else
        median = MIN;

    *newNode = (struct BTreeNode *)malloc(sizeof(struct BTreeNode));
    j = median + 1;
    while (j <= MAX)
    {
        (*newNode)->item[j - median] = node->item[j];
        (*newNode)->linker[j - median] = node->linker[j];
        j++;
    }
    node->count = median;
    (*newNode)->count = MAX - median;

    if (pos <= MIN)
    {
        addValToNode(item, pos, node, child);
    }
    else
    {
        addValToNode(item, pos - median, *newNode, child);
    }
    *pval = node->item[node->count];
    (*newNode)->linker[0] = node->linker[node->count];
    node->count--;
}

// Set the value in the node
int setValueInNode(int item, int *pval,
                   struct BTreeNode *node, struct BTreeNode **child)
{
    int pos;
    if (!node)
    {
        *pval = item;
        *child = NULL;
        return 1;
    }

    if (item < node->item[1])
    {
        pos = 0;
    }
    else
    {
        for (pos = node->count;
             (item < node->item[pos] && pos > 1); pos--)
            ;
        if (item == node->item[pos])
        {
            printf("Duplicates not allowed\n");
            return 0;
        }
    }
    if (setValueInNode(item, pval, node->linker[pos], child))
    {
        if (node->count < MAX)
        {
            addValToNode(*pval, pos, node, *child);
        }
        else
        {
            splitNode(*pval, pval, pos, node, *child, child);
            return 1;
        }
    }
    return 0;
}

// Insertion operation
void insertion(int item)
{
    int flag, i;
    struct BTreeNode *child;

    flag = setValueInNode(item, &i, root, &child);
    if (flag)
        root = createNode(i, child);
}

// Copy the successor
void copySuccessor(struct BTreeNode *myNode, int pos)
{
    struct BTreeNode *dummy;
    dummy = myNode->linker[pos];

    for (; dummy->linker[0] != NULL;)
        dummy = dummy->linker[0];
    myNode->item[pos] = dummy->item[1];
}

// Remove the value
void removeVal(struct BTreeNode *myNode, int pos)
{
    int i = pos + 1;
    while (i <= myNode->count)
    {
        myNode->item[i - 1] = myNode->item[i];
        myNode->linker[i - 1] = myNode->linker[i];
        i++;
    }
    myNode->count--;
}

// Do right shift
void rightShift(struct BTreeNode *myNode, int pos)
{
    struct BTreeNode *x = myNode->linker[pos];
    int j = x->count;

    while (j > 0)
    {
        x->item[j + 1] = x->item[j];
        x->linker[j + 1] = x->linker[j];
    }
    x->item[1] = myNode->item[pos];
    x->linker[1] = x->linker[0];
    x->count++;

    x = myNode->linker[pos - 1];
    myNode->item[pos] = x->item[x->count];
    myNode->linker[pos] = x->linker[x->count];
    x->count--;
    return;
}

// Do left shift
void leftShift(struct BTreeNode *myNode, int pos)
{
    int j = 1;
    struct BTreeNode *x = myNode->linker[pos - 1];

    x->count++;
    x->item[x->count] = myNode->item[pos];
    x->linker[x->count] = myNode->linker[pos]->linker[0];

    x = myNode->linker[pos];
    myNode->item[pos] = x->item[1];
    x->linker[0] = x->linker[1];
    x->count--;

    while (j <= x->count)
    {
        x->item[j] = x->item[j + 1];
        x->linker[j] = x->linker[j + 1];
        j++;
    }
    return;
}

// Merge the nodes
void mergeNodes(struct BTreeNode *myNode, int pos)
{
    int j = 1;
    struct BTreeNode *x1 = myNode->linker[pos], *x2 = myNode->linker[pos - 1];

    x2->count++;
    x2->item[x2->count] = myNode->item[pos];
    x2->linker[x2->count] = myNode->linker[0];

    while (j <= x1->count)
    {
        x2->count++;
        x2->item[x2->count] = x1->item[j];
        x2->linker[x2->count] = x1->linker[j];
        j++;
    }

    j = pos;
    while (j < myNode->count)
    {
        myNode->item[j] = myNode->item[j + 1];
        myNode->linker[j] = myNode->linker[j + 1];
        j++;
    }
    myNode->count--;
    free(x1);
}

// Adjust the node
void adjustNode(struct BTreeNode *myNode, int pos)
{
    if (!pos)
    {
        if (myNode->linker[1]->count > MIN)
        {
            leftShift(myNode, 1);
        }
        else
        {
            mergeNodes(myNode, 1);
        }
    }
    else
    {
        if (myNode->count != pos)
        {
            if (myNode->linker[pos - 1]->count > MIN)
            {
                rightShift(myNode, pos);
            }
            else
            {
                if (myNode->linker[pos + 1]->count > MIN)
                {
                    leftShift(myNode, pos + 1);
                }
                else
                {
                    mergeNodes(myNode, pos);
                }
            }
        }
        else
        {
            if (myNode->linker[pos - 1]->count > MIN)
                rightShift(myNode, pos);
            else
                mergeNodes(myNode, pos);
        }
    }
}

// Delete a value from the node
int delValFromNode(int item, struct BTreeNode *myNode)
{
    int pos, flag = 0;
    if (myNode)
    {
        if (item < myNode->item[1])
        {
            pos = 0;
            flag = 0;
        }
        else
        {
            for (pos = myNode->count; (item < myNode->item[pos] && pos > 1); pos--)
                ;
            if (item == myNode->item[pos])
            {
                flag = 1;
            }
            else
            {
                flag = 0;
            }
        }
        if (flag)
        {
            if (myNode->linker[pos - 1])
            {
                copySuccessor(myNode, pos);
                flag = delValFromNode(myNode->item[pos], myNode->linker[pos]);
                if (flag == 0)
                {
                    printf("Given data is not present in B-Tree\n");
                }
            }
            else
            {
                removeVal(myNode, pos);
            }
        }
        else
        {
            flag = delValFromNode(item, myNode->linker[pos]);
        }
        if (myNode->linker[pos])
        {
            if (myNode->linker[pos]->count < MIN)
                adjustNode(myNode, pos);
        }
    }
    return flag;
}

// Delete operaiton
void delete (int item, struct BTreeNode *myNode)
{
    struct BTreeNode *tmp;
    if (!delValFromNode(item, myNode))
    {
        printf("Not present\n");
        return;
    }
    else
    {
        if (myNode->count == 0)
        {
            tmp = myNode;
            myNode = myNode->linker[0];
            free(tmp);
        }
    }
    root = myNode;
    return;
}

void searching(int item, int *pos, struct BTreeNode *myNode)
{
    if (!myNode)
    {
        return;
    }

    if (item < myNode->item[1])
    {
        *pos = 0;
    }
    else
    {
        for (*pos = myNode->count;
             (item < myNode->item[*pos] && *pos > 1); (*pos)--)
            ;
        if (item == myNode->item[*pos])
        {
            printf("%d present in B-tree", item);
            return;
        }
    }
    searching(item, pos, myNode->linker[*pos]);
    return;
}

void traversal(struct BTreeNode *myNode)
{
    int i;
    if (myNode)
    {
        for (i = 0; i < myNode->count; i++)
        {
            traversal(myNode->linker[i]);
            printf("%d ", myNode->item[i + 1]);
        }
        traversal(myNode->linker[i]);
    }
}

int main()
{
    int item, ch;

    insertion(8);
    insertion(9);
    insertion(10);
    insertion(11);
    insertion(15);
    insertion(16);
    insertion(17);
    insertion(18);
    insertion(20);
    insertion(23);

    traversal(root);

    delete (20, root);
    printf("\n");
    traversal(root);
}
