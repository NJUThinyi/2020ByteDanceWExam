public class Resort {
    public int[] resort(int[] input){
        int size=input.length;
        int index=0;
        for(int i=0;i<size;i++){
            if(input[i]<0){
                if(i==index){
                    index++;
                }else{
                    for(int j=i;j>index;j--){
                        int temp=input[j];
                        input[j]=input[j-1];
                        input[j-1]=temp;
                    }
                    index++;
                }
            }
        }
        return input;
    }
}
