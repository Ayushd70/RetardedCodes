// program to check if a variable is undefined or null

function checkVariable(variable) {

    if(variable  == null) {
        console.log('The variable is undefined or null');
    } else {
        console.log('The variable is neither undefined or null');
    }
}

let newVariable;

checkVariable(5);
checkVariable('ayush');
checkVariable(null);
checkVariable(newVariable);
