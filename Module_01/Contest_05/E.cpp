#include<bits/stdc++.h>
using namespace std;
int main(){
    int n,day;
    cin>>n>>day;
    char s[100][100];
    for(int i=0;i<n;i++){
        for(int j=0;j<day;j++){
            cin>>s[i][j];
        }
    }
    int max_free=0;
    int curr_free=0;
    for(int j=0;j<day;j++){
        int all_free=true;
        for(int i=0;i<n;i++){
            if(s[i][j]!='o'){
              all_free=false;
              break;
            }
        }
        if(all_free){
            curr_free++;
            max_free= max(max_free,curr_free);
        }else{
            curr_free=0;
        }
    }
    cout<<max_free<<endl;
}
