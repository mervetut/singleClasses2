package com.company;

    public class User {
        String title;
        String[] authors;
        int publicationYear;

        public User(String title, String[] authors, int publicationYear) {
            this.title = title;
            this.authors = authors;
            this.publicationYear = publicationYear;
        }

        public String toString() {
            StringBuffer strBuffer = new StringBuffer();
            int numAuth = authors.length;
            for (int i = 0; i < numAuth; i = i + 1) {
                strBuffer.append(authors[i]);
                if (i != numAuth - 1)
                    strBuffer.append(" & ");
            }
            strBuffer.append(": " + title + " ");
            strBuffer.append("(" + publicationYear + ")");

            return strBuffer.toString();
        }

    }
