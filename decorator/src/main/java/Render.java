public abstract class Render {
    Element element;

    public Render() {
    }

    public Render(Element element) {
        this.element = element;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    abstract String  draw();
}
