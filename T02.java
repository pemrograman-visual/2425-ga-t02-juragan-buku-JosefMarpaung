// 12S24005-MIA NATHANIA SIBUEA
// 12S24036-JOSEF CHRISTIAN MARPAUNG
import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, formatbuku, ket;
        int tahunterbit, stok;
        double hargapembelian, minimummargin, rating, bestPick, mustRead, recommended, average, lowRating;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        formatbuku = input.nextLine();
        hargapembelian = Double.parseDouble(input.nextLine());
        minimummargin = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        if (rating >= 4.7) {
            ket = "bestpick";
        } else {
            if (rating >= 4.5) {
                ket = "mustread";
            } else {
                if (rating >= 4.0) {
                    ket = "recommended";
                } else {
                    if (rating >= 3.0) {
                        ket = "average";
                    } else {
                        if (rating >= 3.0) {
                            ket = "low";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + ket + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + rating);
    }
}

