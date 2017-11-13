/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime

case class PaymentComplete (
  /* Payment ID, MongoId */
  id: Option[String],
  /* Client external key */
  externalId: Option[String],
  /*  */
  amount: Option[Double],
  /*  */
  fee: Option[Double],
  /*  */
  status: Option[String],
  /*  */
  declineReason: Option[String],
  /*  */
  updatedAt: Option[String],
  /*  */
  createdAt: Option[String],
  sender: Option[Sender],
  recipient: Option[Recipient],
  meta: Option[Meta],
  /* Transaction ID */
  transactionId: Option[String],
  /*  */
  transactionToken: Option[String]
) extends ApiModel


