public class Sorter {

    public Brand[] sortSelectionDesc(Brand[] brands) {
        if (brands == null) return null;

        for (int i = 0; i < brands.length - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < brands.length; j++) {
                if (brands[j].getTotalValidYears() > brands[maxIndex].getTotalValidYears()) {
                    maxIndex = j;
                }
            }

            Brand temp = brands[i];
            brands[i] = brands[maxIndex];
            brands[maxIndex] = temp;
        }

        return brands;
    }
}