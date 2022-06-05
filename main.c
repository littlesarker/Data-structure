#include<stdio.h>
#include<stdlib.h>


#define Size 10

int top =-1;
int  stack_array[Size];
void Push();
void Pop();
void show();

main()
{
    int choice;

    while(1)
    {
        printf("\nStack");
        printf("\n1.Push the element\n2.Pop the element\n3.Show\n4.End");
        printf("\n\nChoose an Action :");
        scanf("%d",&choice);

        switch(choice)
        {
        case 1:
            Push();

            break;
        case 2:
            Pop();

            break;
        case 3:
            show();

            break;
        case 4:
            exit(0);

        default:
            printf("\nInvalid ");
        }
    }
}

void Push()
{
    int data;

    if(top==Size-1)
    {
        printf("\nOverflow!!");
    }
    else
    {
        printf("\nEnter Element For Push :");
        scanf("%d",&data);
        top=top+1;
        stack_array[top]=data;
    }
}

void Pop()
{
    if(top==-1)
    {
        printf("\nUnderflow!!");
    }
    else
    {
        printf("\nPopped element:  %d",stack_array[top]);
        top=top-1;
    }
}

void show()
{
    if(top==-1)
    {
        printf("\nStack is Empty");
    }
    else
    {
        printf("\nElements  in the stack: \n");
        for(int i=top; i>=0;i--)
            printf("%d\n",stack_array[i]);
    }
}
