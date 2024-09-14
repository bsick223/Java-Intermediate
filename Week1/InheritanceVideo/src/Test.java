public class Test {
    public static void main(String[] args) {

        // instances of objects
        Company oCompany1 = new Company();
        Company oCompany2 = new Company();

        oCompany1.name = "IBM";
        oCompany2.name = "Apple";

        PublicCompany oPubCo1 = new PublicCompany();
        PublicCompany oPubCo2 = new PublicCompany();

        oPubCo1.name = "Google";
        oPubCo1.stockSymbol = "GOOG";

        PublicCompany[] aPublicCos = new PublicCompany[3];
        aPublicCos[0] = oPubCo1;
        aPublicCos[1] = oPubCo2;


    }
}
