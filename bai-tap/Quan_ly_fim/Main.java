import java.util.Scanner;


  public class Main{
    public static void main(String[] args) {
         
    //  Tạo 2 mảng để quản lý Movie và Series
        Movie[] movie = new Movie[5];
        Series[] series = new Series[5];
        
        movie[0] = new Movie("MV01", "Minions: The Rise Of Gru",
                             TYPE.COMEDY, 8.0, 88);
        movie[1] = new Movie("MV02", "Spider-Man: No Way Home",
                             TYPE.ACTION, 7.0, 148);                   
        movie[2] = new Movie("MV03", "The Black Phone",
                             TYPE.HORROR, 6.3, 102);
        movie[3] = new Movie("MV04", "Free Guy",
                             TYPE.COMEDY, 6.5, 120);
        movie[4] = new Movie("MV05", "Through My Window",
                             TYPE.ROMANTIC, 7.3, 106);

        series[0] = new Series("SR01", "Adamas", TYPE.ACTION
                              , 6.8, 12, 70);
        series[1] = new Series("SR02", "Peacemaker", TYPE.COMEDY
                              , 7.8, 8, 50);
        series[2] = new Series("SR03", "Bad Romeo", TYPE.ROMANTIC
                              , 7.2, 50, 85);
        series[3] = new Series("SR04", "Dumbbell Nan-Kilo Moteru?", TYPE.COMEDY
                              , 7.4, 5, 24);
        series[4] = new Series("SR05", "The boy", TYPE.ACTION
                              , 8.7, 8, 60);


    //  In thông tin phim ra màn hình
        System.out.println("Movies: ");
        for(Movie mv : movie){
            mv.printMV();
        }
        System.out.println("Series: ");
        for(Series seri : series){
            seri.printSeri();
        }


    // Nhập vào từ khoá tiêu đề film và tìm phim theo tiêu đề ( tìm cả movie và series, tìm theo từ khoá)
       Scanner scanner = new Scanner(System.in);
       System.out.print("\nNhap ten phim: ");
       String titleFind = scanner.nextLine();
       System.out.println("Ket qua tim kiem: ");
       for(Movie mv : movie){
        if(mv.hasKeyword(titleFind)){
            mv.printMV();
        }
       }
       for(Series seri : series){
        if(seri.hasKeyword(titleFind)){
            seri.printSeri();
        }
       }

    
    // In ra thông tin film có ranking thấp nhất (kiểm tra cả movie và series)
       System.out.println("\nPhim co ranking thap nhat: ");
       double worstRanking = movie[0].getRanking();
       // Tim gia tri ranking thap nhat
       for(Movie mv : movie){
        if(worstRanking > mv.getRanking()){
            worstRanking = mv.getRanking();
        }
       }
       for(Series seri : series){
        if(worstRanking > seri.getRanking()){
            worstRanking = seri.getRanking();
        }
       }
       // In thong tin film co ranking thap nhat
       for(Movie mv : movie){
        if(worstRanking == mv.getRanking()){
           mv.printMV();
        }
       }
       for(Series seri : series){
        if(worstRanking == seri.getRanking()){
            seri.printSeri();
        }
       }

    
    //    In ra tên đạo diễn của thể loại COMEDY có ranking thấp nhất
    movie[0].setDirector("Brad Ableson");
    movie[1].setDirector("Jon Watts");
    movie[2].setDirector("Scott Derrickson");
    movie[3].setDirector("Shawn Levy");
    movie[4].setDirector("Marçal Forés");

    series[0].setDirector("Park Seung-woo");
    series[1].setDirector("James Gunn");
    series[2].setDirector("Ampaiporn Jitmaingong");
    series[3].setDirector("Yamazaki Mitsue");
    series[4].setDirector("William Brent Bell");
    
    System.out.println("\nDao dien Comedy co ranking thap nhat: ");
    double worstComedy = 10;
    for(Movie mv : movie){
        if(mv.isComedy()){
           if(worstComedy > mv.getRanking()){
            worstComedy = mv.getRanking();
           }
        }
    }
    for(Series seri : series){
        if(seri.isComedy()){
            if(worstComedy > seri.getRanking()){
             worstComedy = seri.getRanking();
            }
         }
    }

    for(Movie mv : movie){
        if(mv.isComedy()){
           if(worstComedy == mv.getRanking()){
            System.out.println(mv.getDirector());
           }
        }
    }
    for(Series seri : series){
        if(seri.isComedy()){
            if(worstComedy == seri.getRanking()){
             System.out.println(seri.getDirector());
            }
         }
    }

    scanner.close();


    }
    
}
