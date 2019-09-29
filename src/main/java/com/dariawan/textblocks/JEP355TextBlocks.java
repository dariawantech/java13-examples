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
package com.dariawan.textblocks;

public class JEP355TextBlocks {

    public static void main(String[] args) {

        // text blocks for html
        String html = """
                      <html>
                          <body>
                              <p>Hello, fellow programmers</p>
                          </body>
                      </html>
                      """;
        System.out.println(html);
        
        // text blocks for json
        String json = """
            {
                "firstName": "Regina",
                "lastName": "Poetri",
                "age": 20
            }
            """;
        System.out.println(json);
        
        // text blocks for sql
        String sql = """
               SELECT FIRST_NAME, LAST_NAME, BIRTH_DATE
               FROM CUSTOMER
               WHERE CUSTOMER_ID = ?
               """;
        System.out.println(sql);
        
        // Non text blocks String
        sql = "SELECT FIRST_NAME, LAST_NAME, BIRTH_DATE\n" +
               "FROM CUSTOMER\n" +
               "WHERE CUSTOMER_ID = ?\n";
        System.out.println(sql);
    }
}
