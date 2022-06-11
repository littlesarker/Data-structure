#include <stdio.h>
#define SIZE 10

void enQueue(int);
void deQueue();
void show();

int Q_ar[SIZE];
int front = -1;
int  rear = -1;

int main()
{


    int c,data;
    while(1)
    {
        printf("\n 1. EnQueue \n");
        printf("\n 2. DeQueue \n");
        printf("\n 3. Show Data \n");

        printf("\n Choose Action  \n");
        scanf("%d",&c);

        switch(c)
        {
        case 1:

            scanf("%d",&data);
            enQueue(data);
            break;

        case 2:
            deQueue();
            break;
        case 3:
            show();
            break;
        default :
            printf("\nInvalid\n");

        }


    }


    return 0;
}

void enQueue(int value)
{
    if (rear == SIZE - 1)
    {

        printf("\nQueue is Full!!");
    }
    else
    {
        if (front == -1)
            front = 0;
        rear++;
        Q_ar[rear] = value;
        printf("\nInserted -> %d", value);
    }
}

void deQueue()
{
    if (front == -1)
    {

        printf("\nQueue is Empty!!");
    }
    else
    {
        printf("\nDeleted : %d", Q_ar[front]);
        front++;
        if (front > rear)
            front = rear = -1;
    }
}

// Showing data in Queue
void show()
{
    if (rear == -1)
        printf("\nQueue is Empty!!!");
    else
    {
        int i;
        printf("\nQueue elements are:\n");
        for (i = front; i <= rear; i++)
            printf("%d  ", Q_ar[i]);
    }
    printf("\n");
}

