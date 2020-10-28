package ro.uvt;

public class Paragraf implements Element{
    private String text;
    private AlignStrategy align;

    public Paragraf(String text) {
        this.text=text;
        this.align= new AlignLeft();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        align.render(this);
        //System.out.print(this.text);
    }

    public void setAlignStrategy(AlignStrategy align){
    this.align=align;
    }
}
