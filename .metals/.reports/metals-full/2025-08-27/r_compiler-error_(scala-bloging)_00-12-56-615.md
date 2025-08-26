file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/6.Collection-Data/for.scala
### java.lang.IndexOutOfBoundsException: 7

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.12
Classpath:
<WORKSPACE>\.bloop\scala-bloging\bloop-bsp-clients-classes\classes-Metals-eB1a5NL-SOelN74Ah7QL9A== [exists ], <HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.11.0\semanticdb-javac-0.11.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-parser-combinators_2.13\2.3.0\scala-parser-combinators_2.13-2.3.0.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
offset: 3
uri: file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/6.Collection-Data/for.scala
text:
```scala
rfa@@
```



#### Error stacktrace:

```
scala.reflect.internal.util.BatchSourceFile.offsetToLine(SourceFile.scala:201)
	scala.meta.internal.pc.MetalsGlobal$XtensionPositionMetals.toPos(MetalsGlobal.scala:727)
	scala.meta.internal.pc.MetalsGlobal$XtensionPositionMetals.toLsp(MetalsGlobal.scala:740)
	scala.meta.internal.pc.PcDocumentHighlightProvider.collect(PcDocumentHighlightProvider.scala:21)
	scala.meta.internal.pc.PcDocumentHighlightProvider.collect(PcDocumentHighlightProvider.scala:9)
	scala.meta.internal.pc.PcCollector.scala$meta$internal$pc$PcCollector$$collect$1(PcCollector.scala:108)
	scala.meta.internal.pc.PcCollector.traverseWithParent$1(PcCollector.scala:177)
	scala.meta.internal.pc.PcCollector.traverseSought(PcCollector.scala:314)
	scala.meta.internal.pc.PcCollector.traverseSought$(PcCollector.scala:95)
	scala.meta.internal.pc.WithSymbolSearchCollector.traverseSought(PcCollector.scala:345)
	scala.meta.internal.pc.PcCollector.resultWithSought(PcCollector.scala:82)
	scala.meta.internal.pc.PcCollector.resultWithSought$(PcCollector.scala:17)
	scala.meta.internal.pc.WithSymbolSearchCollector.resultWithSought(PcCollector.scala:345)
	scala.meta.internal.pc.WithSymbolSearchCollector.$anonfun$result$1(PcCollector.scala:352)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.pc.WithSymbolSearchCollector.result(PcCollector.scala:352)
	scala.meta.internal.pc.PcDocumentHighlightProvider.highlights(PcDocumentHighlightProvider.scala:30)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$documentHighlight$1(ScalaPresentationCompiler.scala:510)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: 7