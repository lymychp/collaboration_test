/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime

case class Page (
  /* MongoID */
  id: Option[String],
  /* Short page id */
  shortId: Option[String],
  /* Page title */
  title: Option[String],
  /* Page description */
  description: Option[String],
  /* Link for page logo */
  logo: Option[String],
  /* Page amount */
  amount: Option[Double],
  /* Count of payments at the current page */
  paymentsCount: Option[Double],
  /* is the page active */
  isActive: Option[Double],
  /* is the page default for current user */
  isDefault: Option[Double],
  /* 04-03T19:44:27+09:00 (date) - Page was updated at */
  updatedAt: Option[String],
  /* 04-03T19:44:27+09:00 (date) - Page was created at */
  createdAt: Option[String],
  /*  */
  limits: Option[Seq[Limits]]
) extends ApiModel


