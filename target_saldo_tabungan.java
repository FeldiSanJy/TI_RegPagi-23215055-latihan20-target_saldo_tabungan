public class target_saldo_tabungan {
    public static void main(String[] args) {
        double saldoAwal = 3500000;
        double bungaPerBulan = 0.08;
        double saldoTarget = 6000000;
        int bulan = 0;

        while (saldoAwal < saldoTarget) {
            saldoAwal += saldoAwal * bungaPerBulan;
            bulan++;
        }

        System.out.println("Lama tabungan mencapai saldo target: " + bulan + " bulan");
    }
}