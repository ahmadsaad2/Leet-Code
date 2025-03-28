class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] sbs = new StringBuilder[numRows];

        for (int i=0;i<numRows;i++){
            sbs[i]= new StringBuilder();

        }
        char []arr=s.toCharArray();
        int n=arr.length;
        int index=0;

        while(index <n){

            for(int j=0;index<n && j<numRows; j++){
                sbs[j].append(arr[index++]);

            }

            for(int j=numRows-2;index<n && j>0 ;j--){
                sbs[j].append(arr[index++]);
            
            }
        }
        
         StringBuilder res=sbs[0];
         for(int i=1;i<numRows;i++){
            res.append(sbs[i].toString());
         }
            return res.toString ();
        

        }
}

