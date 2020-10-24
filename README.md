# Adapter Design Pattern (Java)

**Adapter** convert interface of a class into another interface that clients expect.
![](https://github.com/shamy1st/design-pattern-adapter/blob/main/uml.png)
### Problem:
You have **Image** class with **Filter** interface and you got an external library which include **Caramel** filter and you want to filter your image using this filter but **Caramel** doesn't implement your interface.

    public class Main {
        public static void main(String[] args) {
            ImageView imageView = new ImageView(new Image());
            imageView.apply(new Caramel()); //you can't do that compilation error
        }
    }
    
    public class Image {

    }

    public class ImageView {
        private Image image;

        public ImageView(Image image) {
            this.image = image;
        }
        
        public void apply(Filter filter) {
            filter.apply(image);
        }
    }

    public interface Filter {
        void apply(Image image);
    }

    public class VividFilter implements Filter {
        @Override
        public void apply(Image image) {
            System.out.println("Applying Vivid Filter.");
        }
    }

    public class Caramel {
        public void init() {
            System.out.println("Init Caramel.");
        }
        
        public void render(Image image) {
            System.out.println("Applying Caramel Filter.");
        }
    }
### Solution:
![](https://github.com/shamy1st/design-pattern-adapter/blob/main/uml-solution.png)
