import org.jetbrains.spek.api.Spek
import kotlin.test.assertEquals

class SpecTests : Spek({

  val result = 10

  it("result equals 10") {
    assertEquals(result, 10)
  }
})