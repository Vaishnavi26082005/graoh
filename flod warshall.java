geeksforgeeks
Courses
Tutorials
Jobs
Practice
Contests
V
33



Refresh

Time (IST)	Status	Marks	Lang	Test Cases	Code
2024-11-18 00:45:17	Correct	
4
java	90 / 90	View
Output Window
Problem Solved Successfully
Suggest Feedback
Test Cases Passed
90 / 90
Attempts : Correct / Total
1 / 1
Accuracy :
100%
Points Scored 
4 / 4
Your Total Score:
55 
Time Taken
0.91
Solve Next

Minimum Spanning Tree
Possible paths between 2 vertices
Bellman-Ford
Kick start your career with GfG 160!
arrow
Java (1.8)
Average Time: 15m



                }


 

Custom Input


// User function template for JAVA

class Solution {
    public void shortestDistance(int[][] mat) {
        // Code here
        int n=mat.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==-1){
                    mat[i][j]=1001;
                }
            }
        }
        
        
        for(int k=0;k<n;k++){
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
             mat[i][j] = Math.min(mat[i][j], mat[i][k] + mat[k][j]);

                }
            }
        }
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1001){
                    mat[i][j]=-1;
                }
            }
        }
    } 
       
    
}
Quick actions for selected text. Click  to disable if not needed.
Got it
