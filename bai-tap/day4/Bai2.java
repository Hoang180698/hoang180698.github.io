public class Bai2 {
    public static void main(String[] args){
        
        String text = "You only live once, but if you do it right, once is enough";
        System.out.println(text); 
        // Khai báo biến đếm  
        int count = 0;  
        System.out.print("Ký tự \"o\" xuất hiện ở vị trí: ");
        // Dùng vòng lặp for để duyệt các phần tử trong câu
        for (int index = 0; index <= text.length() - 1; index++){
            char character = text.charAt(index);
            if (character == 'o'){
                System.out.print(index +"   ");
                count++;
            }
        }
        System.out.println("\nSố ký tự \"o\" trong câu trên: "+count);

    }
}
 