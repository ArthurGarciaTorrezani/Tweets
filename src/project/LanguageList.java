package project;

public class LanguageList {
    private Language first;

    public LanguageList() {
        this.first = null;
    }

    public void addLanguage(Language lang) {
        if (first == null) {
            first = lang;
        } else {
            Language current = first;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(lang);
        }
    }

    public void volumeTweets() {
        Language current = first;

        System.out.println("----------------------------------------------------");
        System.out.println("----------------- Volume of Tweets -----------------");
        while (current != null) {
            System.out.println("----------------------------------------------------");
            System.out.printf("%s: %d\n", current.getName(), current.getTweets().getAmount());
            current = current.getNext();
        }
        System.out.println("----------------------------------------------------");
    }

    public void positiveFeelings() {
        Language current = first;
        int amount = 0;

        System.out.println("----------------------------------------------------");
        System.out.println("----------------- Positive Feelings ----------------");
        System.out.println("----------------------------------------------------");
        while (current != null) {
            amount += current.getTweets().getPositiveTweets();
            current = current.getNext();
        }
        System.out.printf("Positive: %d\n", amount);
        System.out.println("----------------------------------------------------");
    }

    public void negativeFeelings() {
        Language current = first;
        int amount = 0;

        System.out.println("----------------------------------------------------");
        System.out.println("----------------- Negative Feelings ----------------");
        System.out.println("----------------------------------------------------");
        while (current != null) {
            amount += current.getTweets().getNegativeTweets();
            current = current.getNext();
        }
        System.out.printf("Negative: %d\n", amount);
        System.out.println("----------------------------------------------------");
    }    

    public Language getLanguageWithMostNegativeTweets() {
        if (first == null) {
            return null;
        }

        Language current = first;
        Language maxNegativesLanguage = first;
        int maxNegatives = first.getTweets().getNegativeTweets();

        while (current != null) {
            int currentNegatives = current.getTweets().getNegativeTweets();
            if (currentNegatives > maxNegatives) {
                maxNegatives = currentNegatives;
                maxNegativesLanguage = current;
            }
            current = current.getNext();
        }

        return maxNegativesLanguage;
    }

    public Language getLanguageWithMostPositiveTweets() {
        if (first == null) {
            return null;
        }

        Language current = first;
        Language maxPositivesLanguage = first;
        int maxPositives = first.getTweets().getPositiveTweets();

        while (current != null) {
            int currentPositives = current.getTweets().getPositiveTweets();
            if (currentPositives > maxPositives) {
                maxPositives = currentPositives;
                maxPositivesLanguage = current;
            }
            current = current.getNext();
        }

        return maxPositivesLanguage;
    }

    public String rankLanguagesByNegativeTweets() {
        if (first == null) {
            return "No languages found.";
        }

        String rankedLanguages = "";
        String processedLanguages = "";

        while (true) {
            Language current = first;
            Language maxNegativesLanguage = null;
            int maxNegatives = -1;

            while (current != null) {
                if (!processedLanguages.contains(current.getName())) {
                    int NegativeTweets = current.getTweets().getNegativeTweets();
                    if (NegativeTweets > maxNegatives) {
                        maxNegatives = NegativeTweets;
                        maxNegativesLanguage = current;
                    }
                }
                current = current.getNext();
            }

            if (maxNegativesLanguage == null) {
                break;
            }

            rankedLanguages += maxNegativesLanguage.getName() + ": " + maxNegativesLanguage.getTweets().getNegativeTweets() + " negative tweets\n";
            processedLanguages += maxNegativesLanguage.getName() + ";";
        }

        return rankedLanguages;
    }

    public String rankLanguagesByPositiveTweets() {
        if (first == null) {
            return "No languages found.";
        }

        String rankedLanguages = "";
        String processedLanguages = "";

        while (true) {
            Language current = first;
            Language maxPositivesLanguage = null;
            int maxPositives = -1;

            while (current != null) {
                if (!processedLanguages.contains(current.getName())) {
                    int positiveTweets = current.getTweets().getPositiveTweets();
                    if (positiveTweets > maxPositives) {
                        maxPositives = positiveTweets;
                        maxPositivesLanguage = current;
                    }
                }
                current = current.getNext();
            }

            if (maxPositivesLanguage == null) {
                break;
            }

            rankedLanguages += maxPositivesLanguage.getName() + ": " + maxPositivesLanguage.getTweets().getPositiveTweets() + " positive tweets\n";
            processedLanguages += maxPositivesLanguage.getName() + ";";
        }

        return rankedLanguages;
    }
}