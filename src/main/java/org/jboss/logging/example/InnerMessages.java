/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

/**
 *
 */
package org.jboss.logging.example;


import org.jboss.logging.Cause;
import org.jboss.logging.Message;
import org.jboss.logging.Message.Format;
import org.jboss.logging.MessageBundle;
import org.jboss.logging.Messages;

/**
 * @author James R. Perkins Jr. (jrp)
 *
 */
class InnerMessages {
    /**
     * The messages.
     */
    static final ErrorMessages MESSAGES = Messages.getBundle(ErrorMessages.class);

    @MessageBundle(projectCode="LOGB")
    interface ErrorMessages {

        @Message(id = 20, value = "ERROR: {0} Root cause: {1}",
                 format = Format.MESSAGE_FORMAT)
        String errorMessage(@Cause Throwable cause, String message);
    }
}