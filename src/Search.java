public class Search {

    public Brand binarySearchByValidYears(
            Brand[] brands,
            int validYears,
            boolean isAscending
    ) {
        int left = 0;
        int right = brands.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int midValue = brands[mid].getTotalValidYears();

            if (midValue == validYears) {
                return brands[mid];
            }

            if (isAscending) {
                if (validYears < midValue) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // DESCENDENTE
                if (validYears > midValue) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return null;
    }
}