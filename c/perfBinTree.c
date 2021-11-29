// Checking if a binary tree is a perfect binary tree in C

#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *left;
    struct node *right;
};

// Creating a new node
struct node *newnode(int data)
{
    struct node *node = (struct node *)malloc(sizeof(struct node));
    node->data = data;
    node->left = NULL;
    node->right = NULL;

    return (node);
}

// Calculate the depth
int depth(struct node *node)
{
    int d = 0;
    while (node != NULL)
    {
        d++;
        node = node->left;
    }
    return d;
}

// Check if the tree is perfect
bool is_perfect(struct node *root, int d, int level)
{
    // Check if the tree is empty
    if (root == NULL)
        return true;

    // Check the presence of children
    if (root->left == NULL && root->right == NULL)
        return (d == level + 1);

    if (root->left == NULL || root->right == NULL)
        return false;

    return is_perfect(root->left, d, level + 1) &&
           is_perfect(root->right, d, level + 1);
}

// Wrapper function
bool is_Perfect(struct node *root)
{
    int d = depth(root);
    return is_perfect(root, d, 0);
}

int main()
{
    struct node *root = NULL;
    root = newnode(1);
    root->left = newnode(2);
    root->right = newnode(3);
    root->left->left = newnode(4);
    root->left->right = newnode(5);
    root->right->left = newnode(6);

    if (is_Perfect(root))
        printf("The tree is a perfect binary tree\n");
    else
        printf("The tree is not a perfect binary tree\n");
}
