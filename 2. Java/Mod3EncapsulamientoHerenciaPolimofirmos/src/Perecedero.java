public class Perecedero {
    int diasPorCaducar;

    public void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    public int getDiasPorCaducar() {
        return diasPorCaducar;
    }

    @Override
    public String toString() {
        return "Perecedero{" +
                "diasPorCaducar=" + diasPorCaducar +
                '}';
    }


    @Override
    double calcular(int cantidadDeProductos);

    double precioFinal = super.calcular(cantidadDeProductos);

        switch(diasPorCaducar)

    {
        case 1:
            precioFinal /= 4;
            break;
        case 2:
            precioFinal /= 3;
            break;
        case 3:
            precioFinal /= 2;
            break;
    }

        return precioFinal;
}
}

}
