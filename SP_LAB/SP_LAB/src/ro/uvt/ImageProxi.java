package ro.uvt;

public class ImageProxi implements Element {
    String imgname;
     Imagine realImage;

    @Override
    public void print() {
        if (realImage == null){
            realImage = new Imagine(imgname);
        }
        realImage.print();
    }
    public ImageProxi(String imgname){
        this.imgname = imgname;
        this.realImage = null;
    }
}
