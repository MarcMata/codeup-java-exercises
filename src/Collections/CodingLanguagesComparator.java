package Collections;

import java.util.Comparator;

class languageComparator implements Comparator<CodingLanguage> {
    @Override
    public int compare(CodingLanguage c1, CodingLanguage c2) {
        return c1.getName().compareTo(c2.getName());
    }
}
//other way to do it
//codingLanguages.sort(Comparator.comparing(CodingLanguage::getName));
//ListName.sort(Comparator.comparing(ListName::getProperty));

class yearComparator implements Comparator<CodingLanguage>{
    public int compare(CodingLanguage c1, CodingLanguage c2) {
        return c1.getCreatedDate().compareTo(c2.getCreatedDate());
    }
}