package condorcet.lib

import org.junit.Assert
import org.junit.Test

class CondorcetTest {

    @Test
    fun testWinner() {
        val vote = Condorcet(setOf("A", "B", "C"))

        IntRange
        vote.vote(Ballot.of("A", "C", "B"), 23)
        vote.vote(Ballot.of("B", "C", "A"), 19)
        vote.vote(Ballot.of("C", "B", "A"), 16)
        vote.vote(Ballot.of("C", "A", "B"), 2)

        val winner = vote.winner()
        Assert.assertNotNull(winner)
        Assert.assertEquals("C", winner)
    }
}