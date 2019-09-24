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

import java.time.LocalDate;

public class JEP354 {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        final int day = now.getDayOfWeek().getValue();

        // traditional switch
        switch (day) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("weekday");
                break;
            case 7:
            case 1:
                System.out.println("weekend");
                break;
            default:
                System.out.println("invalid");
        }

        // case L -> syntax
        // no break necessary, only code next to -> runs
        switch (day) {
            case 2, 3, 4, 5, 6 -> System.out.println("weekday");
            case 7, 1 -> System.out.println("weekend");
            default -> System.out.println("invalid");
        }

        // switch expression
        // then switch should be exhaustive if used as expression
        // using yield for yielding a value from a switch expression
        final String attr = switch (day) {
            case 2, 3, 4, 5, 6: yield "weekday";
            case 7, 1: yield "weekend";
            default: yield "invalid";
        };
    
        System.out.println(attr);
    }
}
