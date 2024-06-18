package lesson11;

import java.util.*;

public class QA27_11_Lugovskiy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String document;
        Set<String> documents = new HashSet<>();
        System.out.println("Enter document number: ");
        do {
            document = scanner.nextLine();
            documents.add(document);
        } while (!document.equals("Ready"));

        Map<String, String> additionalDocuments = new HashMap<>();

        for (String doc : documents)
            additionalDocuments.put(doc, validateDocument(doc));
        for (Map.Entry<String, String> entry : additionalDocuments.entrySet())
            System.out.println("Document number:  " + entry.getKey() + " " + entry.getValue());
    }
    private static String validateDocument(String document) {
        if (document.length() != 15)
            return " - Invalid document length, the document number must contain 15 characters ";
        if (!(document.startsWith("docnum") || document.startsWith("kontract")))
            return " - Incorrect sequence at the beginning of the document number: the number must begin with “docnam” or “contract” ";
        return " - document is valid";
    }
}

