/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime

case class Recipient (
  /*  */
  cardNumber: Option[String],
  /*  */
  cardId: Option[String],
  /*  */
  email: Option[String],
  /*  */
  name: Option[String]
) extends ApiModel


