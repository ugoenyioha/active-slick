package io.strongtyped.active.slick.components

import io.strongtyped.active.slick.ActiveSlick
import io.strongtyped.active.slick.models.{Supplier, Beer}
import scala.slick.jdbc.JdbcBackend


trait BeerExtensions  {
  this: ActiveSlick with ModelExtensions =>

  implicit class BeerExtensions(coffee:Beer) {

    def save(implicit session: JdbcBackend#Session): Beer = Beers.save(coffee)
    def delete(implicit session: JdbcBackend#Session): Boolean = Beers.delete(coffee)

    def supplier(implicit session: JdbcBackend#Session) : Option[Supplier] = {
      coffee.id.flatMap(Suppliers.findOptionById)
    }
  }

}
