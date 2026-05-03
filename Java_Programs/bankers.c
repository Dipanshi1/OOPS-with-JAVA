#include <stdio.h>

int main() {
    int n, m, i, j, k;

    printf("Enter number of processes: ");
    scanf("%d", &n);

    printf("Enter number of resource types: ");
    scanf("%d", &m);

    int alloc[n][m], max[n][m], need[n][m];
    int avail[m];

    printf("\nEnter Allocation Matrix:\n");
    for(i = 0; i < n; i++) {
        printf("P%d: ", i);
        for(j = 0; j < m; j++) {
            scanf("%d", &alloc[i][j]);
        }
    }

    printf("\nEnter Max Matrix:\n");
    for(i = 0; i < n; i++) {
        printf("P%d: ", i);
        for(j = 0; j < m; j++) {
            scanf("%d", &max[i][j]);
        }
    }

    printf("\nEnter Available Resources:\n");
    for(i = 0; i < m; i++) {
        printf("Resource %d: ", i);
        scanf("%d", &avail[i]);
    }

    for(i = 0; i < n; i++) {
        for(j = 0; j < m; j++) {
            need[i][j] = max[i][j] - alloc[i][j];
        }
    }

    printf("\n\nPROCESS\tALLOCATION\tMAX\t\tNEED\n");

    for(i = 0; i < n; i++) {
        printf("P%d\t", i);

        for(j = 0; j < m; j++) {
            printf("%d ", alloc[i][j]);
        }

        printf("\t\t");

        for(j = 0; j < m; j++) {
            printf("%d ", max[i][j]);
        }

        printf("\t\t");

        for(j = 0; j < m; j++) {
            printf("%d ", need[i][j]);
        }

        printf("\n");
    }

    int finish[n], safeSeq[n];
    for(i = 0; i < n; i++) {
        finish[i] = 0;
    }

    int count = 0;

    while(count < n) {
        int found = 0;

        for(i = 0; i < n; i++) {
            if(finish[i] == 0) {
                int safe = 1;

                for(j = 0; j < m; j++) {
                    if(need[i][j] > avail[j]) {
                        safe = 0;
                        break;
                    }
                }

                if(safe) {
                    for(k = 0; k < m; k++) {
                        avail[k] += alloc[i][k];
                    }

                    safeSeq[count++] = i;
                    finish[i] = 1;
                    found = 1;
                }
            }
        }

        if(found == 0) {
            printf("\n\nSystem is NOT in safe state!\n");
            return 0;
        }
    }

    printf("\n\nSystem is in SAFE state.\nSafe Sequence: ");
    for(i = 0; i < n; i++) {
        printf("P%d ", safeSeq[i]);
    }

    return 0;
}