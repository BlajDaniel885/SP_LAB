package ro.uvt;

public class AlignCenter implements AlignStrategy {
    @Override
    public  void render(Paragraf p){
        System.out.println("   "+p.getText());

    }


}
