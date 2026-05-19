package B;


public class bai3 {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        String input="English = 78 Science = 83 Math = 68 History = 65";
        String mang []=input.split(" ");
        for(int i=0;i<mang.length;i++){
            System.out.println(mang[i]);
            try{
                    int num=Integer.parseInt(mang[i]);
                      sum+=num;
                    count++;
            }
            catch(NumberFormatException e) {

            }
        }
        double average=(double) sum/count;
    System.out.println("Trung binh cong cua cac so trong chuoi la"+average);          
            
        }
        

    }

