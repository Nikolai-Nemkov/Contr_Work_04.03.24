package View;


import Operations.Model;
import Presentation.Presenter;

public class Program {

    public static void main(String[] args) {

        Presenter presenter = new Presenter(new UI(), new Model());

        presenter.runOperation();

    }
}