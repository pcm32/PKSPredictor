package uk.ac.ebi.cheminformatics.pks.generator;

/**
 * Created with IntelliJ IDEA.
 * User: pmoreno
 * Date: 4/7/13
 * Time: 11:09
 * To change this template use File | Settings | File Templates.
 */
public class DomainSeqFeature extends AbstractSeqFeature implements SequenceFeature {

    public DomainSeqFeature(Integer start, Integer stop, String name, String evalue) {
        super(start,stop,name);
        this.monomer = new PKMonomer(name);
    }

}
