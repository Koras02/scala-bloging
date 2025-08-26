file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/6.Collection-Data/IteratorsData.scala
### scala.reflect.internal.FatalError: no context found for source-file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/6.Collection-Data/IteratorsData.scala,line-4,offset=9

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.12
Classpath:
<WORKSPACE>\.bloop\scala-bloging\bloop-bsp-clients-classes\classes-Metals-eB1a5NL-SOelN74Ah7QL9A== [exists ], <HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.11.0\semanticdb-javac-0.11.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-parser-combinators_2.13\2.3.0\scala-parser-combinators_2.13-2.3.0.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
offset: 9
uri: file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/6.Collection-Data/IteratorsData.scala
text:
```scala



// @@collection (컬렉션 기반)
object Collection {
  def main(args: Array[String]) : Unit = {
    val nums = List(1,2,3,4)
    for(n <- nums) println(n) 
  }
}

// for-yield (컬렉션 변환)
object Yield {
    def main(args: Array[String]): Unit = {
        val nums = List(1,2,3,4)
        val doubled = for(n <- nums) yield n * 2
        println(doubled) // List(2,4,6,8)
        val triple = for(n <- nums) yield n * 3
        println(triple) // List(3,6,9,12)
    }
}
```



#### Error stacktrace:

```
scala.tools.nsc.interactive.CompilerControl.$anonfun$doLocateContext$1(CompilerControl.scala:100)
	scala.tools.nsc.interactive.CompilerControl.doLocateContext(CompilerControl.scala:100)
	scala.tools.nsc.interactive.CompilerControl.doLocateContext$(CompilerControl.scala:99)
	scala.tools.nsc.interactive.Global.doLocateContext(Global.scala:114)
	scala.meta.internal.pc.PcDefinitionProvider.definitionTypedTreeAt(PcDefinitionProvider.scala:155)
	scala.meta.internal.pc.PcDefinitionProvider.definition(PcDefinitionProvider.scala:68)
	scala.meta.internal.pc.PcDefinitionProvider.definition(PcDefinitionProvider.scala:16)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$definition$1(ScalaPresentationCompiler.scala:471)
```
#### Short summary: 

scala.reflect.internal.FatalError: no context found for source-file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/6.Collection-Data/IteratorsData.scala,line-4,offset=9