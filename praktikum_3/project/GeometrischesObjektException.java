package project;

public class GeometrischesObjektException extends Exception {

    public GeometrischesObjektException()
    {
        super();
    }

    public GeometrischesObjektException(String message)
    {
        super("GeometrischesObjekt: " + message + "\n");
    }
}
