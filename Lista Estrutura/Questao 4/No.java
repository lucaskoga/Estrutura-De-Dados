public class No {

    Object obj;
    No proximo;
    No anterior;

    public No(Object obj) {
        this.obj = obj;
    }
    public String toString(){
        return obj.toString();
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

}
