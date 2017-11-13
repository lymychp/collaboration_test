/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime

case class CreateRequest (
  sender: Sender182,
  /* **Required if is not specified by the owner of the page** Payment amount. Format: `d+.dd` */
  amount: Option[Double],
  /* Payment description. Used when description is not specified by the owner of the page */
  description: Option[String],
  /* Client external id. Will be used in webhooks */
  externalId: Option[String]
) extends ApiModel

