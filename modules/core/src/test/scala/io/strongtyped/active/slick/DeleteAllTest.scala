package io.strongtyped.active.slick

import io.strongtyped.active.slick.test.{H2Suite, DbSuite}
import org.scalatest.{TryValues, OptionValues, FlatSpec}
import shapeless._
import slick.dbio._

class DeleteAllTest  extends FlatSpec with H2Suite with OptionValues with TryValues {

//  implicit val cake = new  ActiveTestCake with QueryCapabilities {
//
//    import driver.api._
//
//    class EntryTable(tag: Tag) extends EntityTable[Entry](tag, "ENTRIES_DELETE_ALL") {
//      def name = column[String]("NAME")
//      def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)
//      def * = (name, id.?) <>(Entry.tupled, Entry.unapply)
//    }
//
//    object Entries extends EntityTableQuery[Entry, EntryTable](
//      cons = tag => new EntryTable(tag),
//      idLens = lens[Entry] >> 'id
//    ) with DeleteAll
//
//    def createSchema(implicit sess: Session): Unit = Entries.ddl.create
//
//    implicit class EntryExtensions(val model: Entry) extends ActiveRecord[Entry]  {
//      override def table = Entries
//    }
//  }
//
//
//  import cake._
//
//  "A TableQuery with DeleteAll" should "be able to delete all entities" in {
//    db { implicit sess =>
//
//      val initialCount = Entries.count
//
//      // test add
//      Entry("Foo").save
//      Entry("Bar").save
//
//      Entries.count shouldBe(initialCount + 2)
//
//      Entries.deleteAll
//
//      Entries.count shouldBe 0
//    }
//  }

  def createSchema: DBIO[Unit] = ???

}
