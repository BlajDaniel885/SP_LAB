package ro.uvt;

public class AlignRight implements AlignStrategy{
    @Override
    public void render(Paragraf p) {
        System.out.println("           "+p.getText());

    }
}
