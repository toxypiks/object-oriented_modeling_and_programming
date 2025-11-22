package project;

public class GeometrischeObjekteMain
{
    public static void main (String[] args)
    {
        GeometrischeObjekte geometrischeObjekte = new GeometrischeObjekte();

        double[][] cuboidData = {{3, 4, 5}, {16, -1, 15}, {200, 200, 200}};

        for(double[] data: cuboidData) {
            try {
                GeometrischesObjekt cuboid = new Quader(data[0], data[1], data[2]);
                geometrischeObjekte.add(cuboid);
            } catch (GeometrischesObjektException e) {
                System.err.println(e.getMessage());
            }
        }

        double[] cubeData = {-207, 15, 4};

        for(double data: cubeData) {
            try {
                GeometrischesObjekt cube = new Wuerfel(data);
                geometrischeObjekte.add(cube);
            } catch (GeometrischesObjektException e) {
                System.err.println(e.getMessage());
            }
        }
        geometrischeObjekte.ausgeben();
    }
}
