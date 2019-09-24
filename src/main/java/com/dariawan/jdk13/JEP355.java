/**
 * Java 13 Code Examples v1 (https://www.dariawan.com)
 * Copyright (C) 2019 Dariawan <hello@dariawan.com>
 *
 * Creative Commons Attribution-ShareAlike 4.0 International License
 *
 * Under this license, you are free to:
 * # Share - copy and redistribute the material in any medium or format
 * # Adapt - remix, transform, and build upon the material for any purpose,
 *   even commercially.
 *
 * The licensor cannot revoke these freedoms
 * as long as you follow the license terms.
 *
 * License terms:
 * # Attribution - You must give appropriate credit, provide a link to the
 *   license, and indicate if changes were made. You may do so in any
 *   reasonable manner, but not in any way that suggests the licensor
 *   endorses you or your use.
 * # ShareAlike - If you remix, transform, or build upon the material, you must
 *   distribute your contributions under the same license as the original.
 * # No additional restrictions - You may not apply legal terms or
 *   technological measures that legally restrict others from doing anything the
 *   license permits.
 *
 * Notices:
 * # You do not have to comply with the license for elements of the material in
 *   the public domain or where your use is permitted by an applicable exception
 *   or limitation.
 * # No warranties are given. The license may not give you all of
 *   the permissions necessary for your intended use. For example, other rights
 *   such as publicity, privacy, or moral rights may limit how you use
 *   the material.
 *
 * You may obtain a copy of the License at
 *   https://creativecommons.org/licenses/by-sa/4.0/
 *   https://creativecommons.org/licenses/by-sa/4.0/legalcode
 */
package com.dariawan.jdk13;

public class JEP355 {

    public static void main(String[] args) {

        // normal String concat
        String html1 = "<html>\n" +
              "    <body>\n" +
              "        <p>Hello, <strong>concatenated string</strong></p>\n" +
              "    </body>\n" +
              "</html>\n";
        System.out.println(html1);
        
        // Using text blocks
        String html2 = """
                      <html>
                          <body>
                              <p>Hello, <strong>text blocks</strong></p>
                          </body>
                      </html>
                      """;
        System.out.println(html2);
        
        // normal String concat
        String sql1 = "SELECT STREET_NAME, BUILDING_NAME \n" +
               "FROM TBL_POSTAL_CODE \n" +
               "WHERE POSTAL_CODE = ?\n";
        System.out.println(sql1);

        // Using text blocks
        String sql2 = """
               SELECT STREET_NAME, BUILDING_NAME
               FROM TBL_POSTAL_CODE
               WHERE POSTAL_CODE = ?
               """;
        System.out.println(sql2);
    }
}
