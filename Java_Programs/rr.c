#include <stdio.h>

int main() {
    int n, tq, i, time = 0, remain;

    printf("Enter number of processes: ");
    scanf("%d", &n);

    int bt[n], rt[n], wt[n], tat[n], ct[n];

    for(i = 0; i < n; i++) {
        printf("Enter Burst Time for P%d: ", i + 1);
        scanf("%d", &bt[i]);
        rt[i] = bt[i];  
    }

    printf("Enter Time Quantum: ");
    scanf("%d", &tq);

    remain = n;

    while(remain != 0) {
        for(i = 0; i < n; i++) {
            if(rt[i] > 0) {
                if(rt[i] <= tq) {
                    time += rt[i];
                    ct[i] = time;   // completion time
                    rt[i] = 0;
                    remain--;
                }
                else {
                    rt[i] -= tq;
                    time += tq;
                }
            }
        }
    }

    for(i = 0; i < n; i++) {
        tat[i] = ct[i];          
        wt[i] = tat[i] - bt[i];
    }

    printf("\n\nProcess\tBT\tCT\tTAT\tWT\n");
    for(i = 0; i < n; i++) {
        printf("P%d\t%d\t%d\t%d\t%d\n", i+1, bt[i], ct[i], tat[i], wt[i]);
    }

    float total_wt = 0, total_tat = 0;
    for(i = 0; i < n; i++) {
        total_wt += wt[i];
        total_tat += tat[i];
    }

    printf("\nAverage Waiting Time = %.2f", total_wt / n);
    printf("\nAverage Turnaround Time = %.2f\n", total_tat / n);

    return 0;
}