package util.convert.swagger.swaggerfactory.parser

/**
 * Parse json to class meta data
 *
 * @author roach
 */
interface Parser {
    fun parse(json: String): Metadata
}
