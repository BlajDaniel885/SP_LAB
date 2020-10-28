package ro.uvt;

public class AlignLeft implements AlignStrategy{
    @Override
    public void render(Paragraf p) {
        System.out.println(p.getText());
    }
}
