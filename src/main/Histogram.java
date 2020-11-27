
package main;


/**
 *
 * @author FernandoSanfielReyes
 */
public interface Histogram {

    public int size();

    public Integer get(String item);

    public Integer put(String item, Integer value);
}
