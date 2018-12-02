package com.example.lenovo.iciba.gson;

import com.google.gson.annotations.SerializedName;

import org.litepal.crud.DataSupport;

import java.io.Serializable;
import java.util.List;

public class Paraphrase extends DataSupport implements Serializable {


    /**
     * auth_sents_part : {"more":"auth_sents","sent":[{"foreign":"This purchase will <b>account<\/b> for 39.5% of the outstanding shares of the brokerage following the issuance. ","score":0.9831430912017822,"source":"FORBES: <i>JP Morgan Sweetens Deal That Is Still Sour For Bear Investors<\/i>","speech":"This+purchase+will+account+for+39.5%25+of+the+outstanding+shares+of+the+brokerage+following+the+issuance.+","speech-size":"30kb","url":"http://www.forbes.com/2008/03/24/bear-stearns-jpmorgan-markets-equity-cx_po_0324markets06.html"},{"foreign":"Spouse heirs, of course, can still claim the <b>account<\/b> as their own and name new heirs. ","score":0.9831407070159912,"source":"FORBES: <i>IRA Tips and Traps<\/i>","speech":"Spouse+heirs%2C+of+course%2C+can+still+claim+the+account+as+their+own+and+name+new+heirs.+","speech-size":"25kb","url":"http://www.forbes.com/forbes/2001/0611/216.html"},{"foreign":"Best for having your frequent flier <b>account<\/b> balances within easy reach for spontaneous upgrades. ","score":0.9831383228302002,"source":"BBC: <i>Five best air travel apps<\/i>","speech":"Best+for+having+your+frequent+flier+account+balances+within+easy+reach+for+spontaneous+upgrades.+","speech-size":"28kb","url":"http://www.bbc.com/travel/story/20120619-five-best-air-travel-apps"}],"sentence-count":6}
     * blng_sents_part : {"more":"blng_sents","sentence-count":6,"sentence-pair":[{"aligned-words":{"src":{"chars":[{"@e":"4","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"12","@id":"1","@s":"5","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]},"q":[{"@e":"12","@s":"5"}]},{"@e":"32","@id":"2","@s":"13","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"2"}]}}]},"tran":{"chars":[{"@e":"2","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"5","@id":"1","@s":"3","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]}},{"@e":"9","@id":"2","@s":"5","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"2"}]}}]}},"sentence":"His account contradicted itself.","sentence-eng":"His <b>account<\/b> contradicted itself.","sentence-speech":"His+account+contradicted+itself.&le=eng","sentence-translation":"他的解释自相矛盾。","source":"《21世纪大英汉词典》","speech-size":"9kb","url":"http://《21世纪大英汉词典》/"},{"aligned-words":{"src":{"chars":[{"@e":"6","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"14","@id":"1","@s":"7","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]}},{"@e":"23","@id":"2","@s":"15","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"5"}]}},{"@e":"28","@id":"3","@s":"24","aligns":{"sc":[{"@id":"3"}],"tc":[{"@id":"2"}]}},{"@e":"32","@id":"4","@s":"29","aligns":{"sc":[{"@id":"4"}],"tc":[{"@id":"3"}]}},{"@e":"40","@id":"5","@s":"33","aligns":{"sc":[{"@id":"5"}],"tc":[{"@id":"4"}]},"q":[{"@e":"40","@s":"33"}]}]},"tran":{"chars":[{"@e":"3","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"5","@id":"1","@s":"3","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]}},{"@e":"6","@id":"2","@s":"5","aligns":{"sc":[{"@id":"3"}],"tc":[{"@id":"2"}]}},{"@e":"8","@id":"3","@s":"6","aligns":{"sc":[{"@id":"4"}],"tc":[{"@id":"3"}]}},{"@e":"11","@id":"4","@s":"9","aligns":{"sc":[{"@id":"5"}],"tc":[{"@id":"4"}]}},{"@e":"13","@id":"5","@s":"11","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"5"}]}}]}},"sentence":"These figures disagree with our account.","sentence-eng":"These figures disagree with our <b>account<\/b>.","sentence-speech":"These+figures+disagree+with+our+account.&le=eng","sentence-translation":"这些数字与我们的账单不符。","source":"《21世纪大英汉词典》","speech-size":"11kb","url":"http://《21世纪大英汉词典》/"},{"aligned-words":{"src":{"chars":[{"@e":"4","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"},{"@id":"3"}]}},{"@e":"9","@id":"1","@s":"5","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"2"}]}},{"@e":"17","@id":"2","@s":"10","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"8"}]},"q":[{"@e":"17","@s":"10"}]},{"@e":"20","@id":"3","@s":"18","aligns":{"sc":[{"@id":"3"}],"tc":[{"@id":"6"}]}},{"@e":"27","@id":"4","@s":"21","aligns":{"sc":[{"@id":"4"}],"tc":[{"@id":"7"}]}},{"@e":"46","@id":"6","@s":"42","aligns":{"sc":[{"@id":"6"}],"tc":[{"@id":"5"}]}}]},"tran":{"chars":[{"@e":"2","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"},{"@id":"3"}]}},{"@e":"4","@id":"2","@s":"2","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"2"}]}},{"@e":"6","@id":"3","@s":"5","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"},{"@id":"3"}]}},{"@e":"11","@id":"5","@s":"7","aligns":{"sc":[{"@id":"6"}],"tc":[{"@id":"5"}]}},{"@e":"12","@id":"6","@s":"11","aligns":{"sc":[{"@id":"3"}],"tc":[{"@id":"6"}]}},{"@e":"14","@id":"7","@s":"12","aligns":{"sc":[{"@id":"4"}],"tc":[{"@id":"7"}]}},{"@e":"16","@id":"8","@s":"14","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"8"}]}}]}},"sentence":"You must account to father what you have done.","sentence-eng":"You must <b>account<\/b> to father what you have done.","sentence-speech":"You+must+account+to+father+what+you+have+done.&le=eng","sentence-translation":"你必须把你的所作所为对父亲解释清楚。","source":"《21世纪大英汉词典》","speech-size":"13kb","url":"http://《21世纪大英汉词典》/"}]}
     * collins : {"collins_entries":[{"basic_entries":{"basic_entry":[{"cet":"CET4 TEM4","headword":"account","wordforms":{"wordform":[{"word":"accounting"},{"word":"accounted"},{"word":"accounts"}]}}]},"entries":{"entry":[{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"有些银行使开一个账户困难重重。","eng_sent":"Some banks make it difficult to open an account."}]},"pos_entry":{"pos":"N-COUNT","pos_tips":"可数名词"},"tran":"If you have an <b>account<\/b> with a bank or a similar organization, you have an arrangement to leave your money there and take some out when you need it. 账户"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"所有的三家网络代理公司都夸口说他们已赢得了大客户。","eng_sent":"All three Internet agencies boast they've won major accounts."}]},"pos_entry":{"pos":"N-COUNT","pos_tips":"可数名词"},"prof":"商业","tran":"In business, a regular customer of a company can be referred to as an <b>account<\/b>, especially when the customer is another company. 客户"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"他保存了详细的账目。","eng_sent":"He kept detailed accounts."}]},"pos_entry":{"pos":"N-COUNT","pos_tips":"可数名词"},"prof":"商业","tran":"<b>Accounts<\/b> are detailed records of all the money that a person or business receives and spends. 账目"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"他对那个决定命运的夜晚所发生的事情做了一个详细的报道。","eng_sent":"He gave a detailed account of what happened on the fateful night."}]},"pos_entry":{"pos":"N-COUNT","pos_tips":"可数名词"},"tran":"An <b>account<\/b> is a written or spoken report of something that has happened. 报道"}]},{"tran_entry":[{"seeAlsos":{"seeAlso":[{"seeword":"accounting"},{"seeword":"bank account"},{"seeword":"checking account"},{"seeword":"deposit account"}],"seealso":"see also"}}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"据说，他是一名优秀的教师。","eng_sent":"He is, by all accounts, a superb teacher."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you say that something is true <b>by all accounts<\/b> or <b>from all accounts<\/b>, you believe it is true because other people say so. 据说"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"这些无名的组织在国内或国际政治中都是无足轻重的。","eng_sent":"These obscure groups were of little account in either national or international politics."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"registr":"正式","tran":"If you say that something is <b>of no account<\/b> or <b>of little account<\/b>, you mean that it is very unimportant and is not worth considering. 无足轻重的"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"在对他的债务做最后的评估期间，他被命令先付这家公司50万美元。","eng_sent":"He was ordered to pay the company $500,000 on account pending a final assessment of his liability."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you buy or pay for something <b>on account<\/b>, you pay nothing or only part of the cost at first, and pay the rest later. 以赊账方式"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"那位总统由于嗓子疼拒绝亲自发表演讲。","eng_sent":"The president declined to deliver the speech himself, on account of a sore throat."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"You use <b>on account of<\/b> to introduce the reason or explanation for something. 由于"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"莫丽告诉了我她做过的事情，我真为她感到害怕。","eng_sent":"Mollie told me what she'd done and I was really scared on her account."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"Your feelings <b>on<\/b> someone's <b>account<\/b> are the feelings you have about what they have experienced or might experience, especially when you imagine yourself to be in their situation. 为 (某人的) 缘故 (而感到\u2026)"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"不要因为我而离开。","eng_sent":"Don't leave on my account."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"registr":"口语","tran":"If you tell someone not to do something <b>on<\/b> your <b>account<\/b>, you mean that they should do it only if they want to, and not because they think it will please you. (不) 为 (某人的) 缘故 (而做某事)"}]},{"tran_entry":[{"box_extra":"强调","exam_sents":{"sent":[{"chn_sent":"这种混合物绝对不应当接近沸点。","eng_sent":"On no account should the mixture come near boiling."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you say that something should <b>on no account<\/b> be done, you are emphasizing that it should not be done under any circumstances. 绝对不"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"我告诉他，如果他退出那么他要自负其则。","eng_sent":"I told him if he withdrew it was on his own account."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you do something <b>on<\/b> your <b>own account<\/b>, you do it because you want to and without being asked, and you take responsibility for your own action. 随 (某人) 自己"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"该被告请求将21项相似的犯罪罪行考虑在内。","eng_sent":"The defendant asked for 21 similar offences to be taken into account."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you <b>take<\/b> something <b>into account<\/b>, or <b>take account of<\/b> something, you consider it when you are thinking about a situation or deciding what to do. 考虑到"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"反复提供虚假情报的人应为其行为而受到追究。","eng_sent":"Individuals who repeatedly provide false information should be called to account for their actions."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If someone <b>is called, held,<\/b> or <b>brought to account<\/b> for something they have done wrong, they are made to explain why they did it, and are often criticized or punished for it. 追究"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"我们曾经为缺乏准备所阻，但我肯定我们会表现很好的。","eng_sent":"We have been hindered by our lack of preparation, but I'm sure we will give a good account of ourselves."}]},"loc":"英国英语","pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you say that someone <b>gave a good account of<\/b> themselves in a particular situation, you mean that they performed well, although they may not have been completely successful. 表现很好"}]}]},"headword":"account","phonetic":"əˈkaʊnt","star":"5"}]}
     * ec : {"exam_type":["TOEFL","高中","IELTS","CET6","CET4","商务英语","考研"],"source":{"name":"有道词典","url":"http://dict.youdao.com"},"word":[{"return-phrase":{"l":{"i":"account"}},"trs":[{"tr":[{"l":{"i":["n. 账户；解释；账目，账单；理由；描述"]}}]},{"tr":[{"l":{"i":["vi. 解释；导致；报账"]}}]},{"tr":[{"l":{"i":["vt. 认为；把\u2026视为"]}}]}],"ukphone":"ə'kaʊnt","ukspeech":"account&type=1","usphone":"ə'kaʊnt","usspeech":"account&type=2"}]}
     * ee : {"source":{"name":"WordNet","url":"http://wordnet.princeton.edu"},"word":{"phone":"","return-phrase":{"l":{"i":"account"}},"speech":"account","trs":[{"pos":"n.","tr":[{"exam":{"i":{"f":{"l":[{"i":"he asked to see the executive who handled his account"}]}}},"l":{"i":"a formal contractual relationship established to provide for regular banking or brokerage or business services"},"similar-words":[{"similar":"business relationship"}]},{"exam":{"i":{"f":{"l":[{"i":"by all accounts they were a happy couple"}]}}},"l":{"i":"the act of informing by verbal report"},"similar-words":[{"similar":"report"}]},{"exam":{"i":{"f":{"l":[{"i":"he gave an inaccurate account of the plot to kill the president"}]}}},"l":{"i":"a record or narrative description of past events"},"similar-words":[{"similar":"history"},{"similar":"chronicle"},{"similar":"story"}]},{"exam":{"i":{"f":{"l":[{"i":"the account of his speech that was given on the evening news made the governor furious"}]}}},"l":{"i":"a short account of the news"},"similar-words":[{"similar":"report"},{"similar":"news report"},{"similar":"story"},{"similar":"write up"}]},{"exam":{"i":{"f":{"l":[{"i":"they send me an accounting every month"}]}}},"l":{"i":"a statement of recent transactions and the resulting balance"},"similar-words":[{"similar":"accounting"},{"similar":"account statement"}]},{"exam":{"i":{"f":{"l":[{"i":"I expected a brief account"}]}}},"l":{"i":"a statement that makes something comprehensible by describing the relevant structure or operation or circumstances etc."},"similar-words":[{"similar":"explanation"}]},{"exam":{"i":{"f":{"l":[{"i":"send me an account of what I owe"}]}}},"l":{"i":"an itemized statement of money owed for goods shipped or services rendered"},"similar-words":[{"similar":"bill"},{"similar":"invoice"}]},{"exam":{"i":{"f":{"l":[{"i":"don't do it on my account"},{"i":"the paper was rejected on account of its length"}]}}},"l":{"i":"grounds"},"similar-words":[{"similar":"score"}]},{"exam":{"i":{"f":{"l":[{"i":"a person of considerable account"},{"i":"he predicted that although it is of small account now it will rapidly increase in importance"}]}}},"l":{"i":"importance or value"}},{"exam":{"i":{"f":{"l":[{"i":"she turned her writing skills to good account"}]}}},"l":{"i":"the quality of taking advantage"}}]},{"pos":"v.","tr":[{"exam":{"i":{"f":{"l":[{"i":"Passing grades account for half of the grades given in this exam"}]}}},"l":{"i":"be the sole or primary factor in the existence, acquisition, supply, or disposal of something"}},{"l":{"i":"keep an account of"},"similar-words":[{"similar":"calculate"}]},{"l":{"i":"to give an account or representation of in words"},"similar-words":[{"similar":"report"},{"similar":"describe"}]},{"exam":{"i":{"f":{"l":[{"i":"I can't account for the missing money"}]}}},"l":{"i":"furnish a justifying analysis or explanation"},"similar-words":[{"similar":"answer for"}]}]}]}}
     * etym : {"etyms":{"en":[{"desc":"","source":"youdict","url":"http://www.youdict.com/etym/","value":"account: [14] Account is of Old French origin. It was formed from compter, conter \u2018count\u2019 (which derived from Latin computāre) and the prefix a-. Its original meaning in English, too, was \u2018count\u2019 or \u2018count up\u2019; this had disappeared by the end of the 18th century, but its specialized reference to the keeping of financial records is of equal antiquity. Account for, meaning \u2018explain\u2019, arose in the mid 18th century.=> count","word":"account"},{"desc":"(v.)","source":"youdict","url":"http://www.youdict.com/etym/","value":"c. 1300, \"to count, enumerate,\" from Old French aconter \"to count, render account\" (Modern French conter), from a \"to\" (see ad-) + conter \"to count, tell\" (see count (v.)). Meaning \"to reckon for money given or received, render a reckoning,\" is from late 14c.; sense of \"to explain\" (c. 1710) is from notion of \"answer for money held in trust.\" Transferred sense of \"value\" is from late 14c. Related: Accounted; accounting.","word":"account"}],"zh":[{"desc":"帐目","source":"童理民","url":"","value":"来自法语，来自于拉丁语compute,来自于词根put,思考，计算。","word":"account"},{"desc":"账目，账户；说明，叙述","source":"童理民","url":"","value":"词根词缀：ac-加强意义 + -count-计算,讲故事 →账目/说明","word":"account"}]},"word":"account"}
     * exam_dict : {"exam_type":["TOEFL","高中","IELTS","CET6","CET4","商务英语","考研"],"exams":[{"books":[{"book_name":"新东方·TOEFL词汇词根+联想记忆法","content":{"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[],"phonetic":"[ə'kaunt]","phrases":[{"content":[{"phrase":"take...into <b>account<\/b> 考虑， 重视； <b>account<\/b> for说明； 占"}],"name":"词组搭配"}],"regular":false,"related":[{"content":[{"text":"accounting(n. 会计学)； accountant(n. 会计师)； accountable(a. 应作解释的； 应负责的)"}],"name":"派生词"}],"remember":[{"content":" ac(表加强) + count(数) → 账目需要一数再数 → 账目","name":"词根记忆"}],"sentences":[{"content":[{"eng":"The three main television networks in the United States <b>account<\/b> for more advertising dollars than any other medium. 美国三大电视网络占有的广告费比其他任何媒体都要多。"}],"name":"例句"}],"star":false,"translation":[{"examples":[],"occured":false,"tran":"v. 说明， 解释； (在数量上)占 n. 解释， 描述， 叙述(interpretation)； 账目； 账户(record)"}],"word":"account"}}],"category":"TOEFL"},{"books":[{"book_name":"新东方·高中英语词汇词根＋联想记忆法","content":{"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[],"phonetic":"/ ə'kaunt /","phrases":[{"content":[{"phrase":"<b>account<\/b> for(在数量、 比例方面)占： Travel and tourism <b>account<\/b> for 11.4 percent of employment in the United States. 旅游业的就业机会占美国全部就业机会的11.4%。"}],"name":"常考词组"}],"regular":false,"related":[],"remember":[{"content":" ac+count(计算)→账目","name":"词根记忆"}],"sentences":[],"star":false,"translation":[{"examples":[],"occured":false,"tran":"n. 账目； 描述 v. 总计有； 认为"}],"word":"account"}}],"category":"高中"},{"books":[{"book_name":"雅思核心词汇4K","content":{"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[],"phonetic":"英 [əˈkaʊnt] 美 [əˈkaʊnt]","phrases":[],"regular":false,"related":[],"remember":[],"sentences":[{"content":[{"chn":"(译文：这或许算得上是首份英文国际科学期刊。该期刊鼓励新的科学写作风格：简洁、重点地描述某一特定实验。)","eng":"Perhaps the first international English-language scientific journal, it encouraged a new genre of scientific writing, that of short, focused <b>accounts<\/b> of particular experiments.","source":"(例句出处)出自《剑桥雅思真题集5》 page49  第九段"}],"name":"真题例句"}],"star":false,"translation":[{"examples":[],"occured":false,"tran":"n.账，账目； 存款； 记述，报告； 理由"},{"examples":[],"occured":false,"tran":"vi.解释； 导致； 报账"},{"examples":[],"occured":false,"tran":"vt.认为； 把\u2026视作"}],"word":"account"}},{"book_name":"新东方·雅思词汇词根+联想记忆法","content":{"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[],"phonetic":"[ə'kaunt]","phrases":[{"content":[{"phrase":"take... into <b>account<\/b> 考虑\u2026； <b>account<\/b> for解释， 说明(原因等)； (数量等)占； on <b>account<\/b> of 因为， 由于； give sb. an <b>account<\/b> of 给某人说明或解释(理由)； not on any <b>account<\/b> 绝对不"}],"name":"词组搭配"}],"regular":true,"related":[],"remember":[{"content":" ac(表加强) + count(数) → 账目需要一数再数 → 账","name":"联想记忆"}],"sentences":[{"content":[{"eng":"Coal is expected to <b>account<\/b> for almost 27 percent of the world's energy needs. 预计对煤炭的需求将几乎占世界能源需求的27%。"}],"name":"例句"}],"star":false,"translation":[{"examples":[],"occured":false,"tran":"v. 说明， 解释； (在数量、 比例方面)占； 导致n. 账， 账户； 叙述， 说明"}],"word":"account"}}],"category":"IELTS"},{"books":[{"book_name":"新东方·六级词汇词根+联想记忆法","content":{"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[],"phonetic":"[ə'kaunt]","phrases":[{"content":[{"phrase":"<b>account<\/b> for 解释， 说明； 占有； on <b>account<\/b> of 由于， 为了\u2026； on no <b>account<\/b> 决不可以， 无论如何也不"}],"name":"常考词组"}],"regular":false,"related":[],"remember":[{"content":" ac(表加强) ＋ count(数) → 账目需要一数再数， 保证正确 → 账目","name":"联想记忆"}],"sentences":[{"content":[{"eng":"Foreign sales <b>accounted<\/b> for 65 percent of Coke\u2019s beverage business. (2008. 6) 可口可乐公司在海外的销售量占饮料业务总量的65%。"}],"name":"例句"}],"star":false,"translation":[{"examples":[],"occured":false,"tran":"n. 记述； 解释； 账目 vi. 说明\u2026的原因； (在数量、 比例方面)占\u2026"}],"word":"account"}}],"category":"CET6"},{"books":[{"book_name":"新东方·四级词汇词根+联想记忆法","content":{"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[{"content":[{"analysis":"选A。句意： 我想先考虑他与社区其他农民和商人交往的信誉， 之后再决定是否同意为他提供贷款。account for： 解释； make up for： 补偿； make out： 开出， 写出。","problem":"I\u2019d ______ his reputation with other farmers and business people in the community, and then make a decision about whether or not to approve a loan. (2000.1)\r\nA) take into account   B) account for\r\nC) make up for             D) make out"}],"name":"真题解析"}],"phonetic":"[ə'kaunt]","phrases":[{"content":[{"phrase":"<b>account<\/b> for 解释， 说明； 占有； on <b>account<\/b> of 由于， 为了\u2026； on no <b>account<\/b> 决不可以， 无论如何也不； take <b>account<\/b> of 考虑到， 顾及， 体谅； take into <b>account<\/b> 考虑到； 注意， 重视； of no <b>account<\/b> 不重要的"}],"name":"常考词组"}],"regular":false,"related":[],"remember":[{"content":" ac(表加强) ＋ count(数) → 账目需要一数再数， 保证正确 → 账目","name":"联想记忆"}],"sentences":[],"star":false,"translation":[{"examples":[],"occured":false,"tran":"n. 记述； 解释； 账目 vi. 说明原因； (在数量、 比例方面)占"}],"word":"account"}}],"category":"CET4"},{"books":[{"book_name":"新东方·BEC词汇词根+联想记忆法","content":{"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[],"phonetic":"[ə'kaunt]","phrases":[{"content":[{"phrase":"a first-hand <b>account<\/b> 第一手报道； keep <b>accounts<\/b> 记账"}],"name":"商务短语"},{"content":[{"phrase":"<b>account<\/b> for 是\u2026的原因； (在数量、 比例等方面)占； take into <b>account<\/b> 考虑； of no <b>account<\/b> 不重要的； on no <b>account<\/b> 决不"}],"name":"词组搭配"}],"regular":false,"related":[{"content":[{"text":"accountable(a. 应负责的)； accountancy(n. 会计工作， 会计职位)； accounting(n. 会计学)"}],"name":"派生词"}],"remember":[{"content":" ac(表加强) + count(数) → 账目需要一数再数 → 账， 账户","name":"联想记忆"}],"sentences":[],"star":false,"translation":[{"examples":[],"occured":false,"tran":"n. 记述， 报告； 账， 账户； 解释 vi. 说明\u2026的原因； (在数量、 比例方面)占"}],"word":"account"}}],"category":"商务英语"},{"books":[{"book_name":"新东方·考研英语词汇词根+联想记忆法","content":{"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[],"phonetic":"[ə'kaunt]","phrases":[{"content":[{"phrase":"on <b>account<\/b> 赊账; on one\u2019s own <b>account<\/b> 依靠自己I have had everything ready for starting business on my own <b>account<\/b>. 我已为自己独立经营作好了一切准备。"}],"name":"常考词组"},{"content":[{"phrase":"give sb. an <b>account<\/b> of 说明， 解释(理由)； on <b>account<\/b> of 因为， 由于 Harry got angry on <b>account<\/b> of my self-indulgence. 哈里被我的任性和放纵惹怒了。// take...into <b>account<\/b> 考虑 You should take Bob\u2019s inexperience into <b>account<\/b> and forgive him. 考虑到鲍勃没有经验， 你应该原谅他。// on any <b>account<\/b> 无论如何 Emily won\u2019t marry the rich old man on any <b>account<\/b>. 埃米莉无论如何也不会嫁给那个有钱的老头。"}],"name":"常考词组"},{"content":[{"phrase":"<b>account<\/b> for 说明(原因等) Nick <b>accounted<\/b> for his not having come as usual to see his grandpa. 尼克说明了为什么没有像往常一样来看爷爷。"}],"name":"常考词组"}],"regular":false,"related":[{"content":[{"text":"accountability(n. 可说明性； 有责任)"}],"name":"派生词"}],"remember":[{"content":" ac(表加强)+count(计算)→算账→账目","name":"联想记忆"}],"sentences":[],"star":true,"translation":[{"examples":[],"occured":false,"tran":"n. ① 账目； 账户 keep <b>accounts<\/b> 记账 // I have made several withdrawals from my bank <b>account<\/b>. 我从银行账户上提了几次款。"},{"examples":[],"occured":false,"tran":"n. ② 叙述， 说明 a first-hand <b>account<\/b> 第一手报道"},{"examples":[],"occured":false,"tran":"vi. ① 说明， 解释 How do you <b>account<\/b> for losing five games in a row? 你怎么解释一连输了五场比赛呢？"},{"examples":[],"occured":false,"tran":"vi. ② (for) (在数量、 比例方面)占 Multinational cor-porations <b>accounted<\/b> for less than 20% of international trade in 1982. 1982年跨国公司在国际贸易中所占的比重低于20％。"},{"examples":[],"occured":false,"tran":"vi. ③ (for)导致， 引起 The drought <b>accounted<\/b> for the poor harvest. 干旱导致歉收。"}],"word":"account"}}],"category":"考研"}]}
     * input : account
     * lang : eng
     * le : en
     * longman : {"isGood":"true","wordList":[{"Entry":{"Head":[{"FREQ":["S1","W1"],"GRAM":["C"],"HOMNUM":["1"],"HWD":["account"],"HYPHENATION":["ac\u2027count"],"POS":["n"],"PronCodes":[{"PRON":["əˈkaʊnt"],"PRONKK":["əˋka u nt"]}],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}],"Sense":[{"DEF":["a written or spoken description that says what happens in an event or process"],"EXAMPLE":["Chomsky\u2019s account of how children learn their first language"],"EXAMPLETRAN":["乔姆斯基关于儿童如何学习第一语言的描述"],"GramExa":[{"EXAMPLE":["He was too shocked to <i>give an account<\/i> of what had happened."],"EXAMPLETRAN":["他因受惊过度而无法描述所发生的事情。"],"PROPFORMPREP":["of"]},{"COLLOTRAN":["一五一十的叙述"],"EXAMPLE":["a blow-by-blow account of how England lost to Portugal"],"EXAMPLETRAN":["英格兰队如何负于葡萄牙队的详细报道"],"GLOSS":["a description of all the details of an event in the order that they happened"],"PROPFORM":["blow-by-blow account"]},{"COLLOTRAN":["目击者的/第一手的描述"],"EXAMPLE":["Eye-witness accounts told of the unprovoked shooting of civilians.","This gives a first-hand account of the war."],"EXAMPLETRAN":["目击者讲到平民无故被枪击。","这是关于这场战争的第一手报道。"],"GLOSS":["a description of events by someone who saw them"],"PROPFORM":["eye-witness/first-hand account"]}],"SIGNPOST":["description"],"SIGNTRAN":["描述"],"TRAN":["叙述，描写，报道"]},{"Crossref":[{"Crossrefto":[{"REFHWD":["bank account"]},{"REFHWD":["checking account"]},{"REFHWD":["current account"]},{"REFHWD":["deposit account"]},{"REFHWD":["profit and loss account"]},{"REFHWD":["savings account"]}]}],"DEF":["an arrangement in which a bank keeps your money safe so that you can pay more in or take money out"],"EXAMPLE":["My salary is paid into my bank account.","I\u2019ve <i>opened an account<\/i> with Barclay\u2019s Bank.","My husband and I have a <i>joint account<\/i> (= <em> one that is shared between two people <\/em> ) ."],"EXAMPLETRAN":["我的工资直接存入我的银行账户。","我在巴克莱银行开了一个账户。","我和丈夫有个联名账户。"],"SIGNPOST":["at a bank"],"SIGNTRAN":["在银行"],"TRAN":["账户"],"Variant":[{"ABBR":["a/c","acct."],"LINKWORD":["written abbreviation <i>书面缩写为<\/i>","or"]}]},{"DEF":["to consider or include particular facts or details when making a decision or judgment about something"],"EXAMPLE":["These figures do not take account of changes in the rate of inflation."],"EXAMPLETRAN":["这些数字没有把通货膨胀率的变化考虑进去。"],"LEXUNIT":["take account of sth"],"TRAN":["考虑到某事，把某事考虑进去"],"Variant":[{"LEXVAR":["take sth into account"],"LINKWORD":["also <i>又作<\/i>"]}]},{"DEF":["because of something else, especially a problem or difficulty"],"EXAMPLE":["She was told to wear flat shoes, on account of her back problem."],"EXAMPLETRAN":["因为背部有问题，她被建议穿平底鞋。"],"LEXUNIT":["on account of sth"],"TRAN":["因为某事，由于某事"]},{"LEXUNIT":["accounts"],"Subsense":[{"DEF":["an exact record of the money that a company has received and the money it has spent"],"EXAMPLE":["The accounts for last year showed a profit of $2 million."],"EXAMPLETRAN":["去年的账目显示利润为200万美元。"],"GRAM":["plural"],"GRAMTRAN":["复数"],"TRAN":["账目"]},{"DEF":["a department in a company that is responsible for keeping records of the amount of money spent and received"],"EXAMPLE":["Eileen works in accounts."],"EXAMPLETRAN":["艾琳在财务部工作。"],"GRAM":["U"],"TRAN":["〔公司的〕财务部"]}]},{"DEF":["if you buy goods on account, you take them away with you and pay for them later"],"LEXUNIT":["on account"],"TRAN":["赊账"]},{"DEF":["an arrangement that you have with a shop or company, which allows you to buy goods or use a service now and pay for them later"],"EXAMPLE":["Can you charge this to my account please?","an unlimited-use Internet account"],"EXAMPLETRAN":["你能把这记在我的（赊欠）账上吗？","一个能无限使用的因特网后付费账户"],"SIGNPOST":["with a shop/company"],"SIGNTRAN":["商店/公司"],"SYN":["credit account"],"TRAN":["〔可先使用后付款的〕赊欠账户"]},{"DEF":["a statement that shows how much money you owe for things you have bought from a shop"],"GramExa":[{"COLLOTRAN":["付账/结账"],"EXAMPLE":["James left the restaurant, settling his account by credit card."],"EXAMPLETRAN":["詹姆斯用信用卡结完账离开餐厅。"],"GLOSS":["pay what you owe"],"PROPFORM":["pay/settle your account"]}],"SIGNPOST":["bill"],"SIGNTRAN":["账单"],"SYN":["bill"],"TRAN":["账单"]},{"DEF":["an arrangement to sell goods and services to another company over a period of time"],"EXAMPLE":["Our sales manager has secured several big accounts recently."],"EXAMPLETRAN":["我们的销售部经理最近拉到了好几笔大生意。"],"SIGNPOST":["arrangement to sell goods"],"SIGNTRAN":["售货安排"],"TRAN":["〔一段时间内的〕交易安排"]},{"DEF":["according to what a lot of people say"],"EXAMPLE":["It has, from all accounts, been a successful marriage."],"EXAMPLETRAN":["谁都说这是一桩美满的婚姻。"],"LEXUNIT":["by/from all accounts"],"TRAN":["根据各方面所说"]},{"DEF":["if you do something on someone\u2019s account, you do it because you think they want you to"],"EXAMPLE":["Please don\u2019t change your plans on my account."],"EXAMPLETRAN":["请不要为了我而改变你的计划。"],"LEXUNIT":["on sb\u2019s account"],"TRAN":["为了某人的缘故"]},{"DEF":["by yourself or for yourself"],"EXAMPLE":["Carrie decided to do a little research on her own account."],"EXAMPLETRAN":["卡丽决定自己做点研究。"],"LEXUNIT":["on your own account"],"TRAN":["靠自己；为自己"]},{"DEF":["used when saying that someone must not, for any reason, do something"],"EXAMPLE":["On no account must you disturb me."],"EXAMPLETRAN":["你千万不要打扰我。"],"LEXUNIT":["on no account/not on any account"],"TRAN":["决不，绝对不"]},{"DEF":["according to what you have said, especially when you have admitted doing something wrong"],"EXAMPLE":["Bentley was, by his own account, over-sensitive to criticism."],"EXAMPLETRAN":["据本特利自己说，他对批评过于敏感。"],"LEXUNIT":["by sb\u2019s own account"],"TRAN":["据某人自己所说"]},{"DEF":["concerning a particular situation"],"EXAMPLE":["There needn\u2019t be any more worries on that account."],"EXAMPLETRAN":["没有必要再为那事担心了。"],"LEXUNIT":["on that account/on this account"],"TRAN":["由于那个/这个缘故"]},{"DEF":["to do something or perform very well or very badly"],"EXAMPLE":["Kevin gave a good account of himself in today\u2019s game."],"EXAMPLETRAN":["凯文在今天的比赛中表现出色。"],"LEXUNIT":["give a good/poor account of yourself"],"TRAN":["表现好/表现差"]},{"DEF":["to force someone who is responsible for a mistake or a crime to explain publicly why they did it and punish them for it if necessary"],"EXAMPLE":["The people responsible for the accident have never been brought to account."],"EXAMPLETRAN":["这起事故的责任人一直没有被追究责任。"],"LABELTRAN":["【正式】"],"LEXUNIT":["bring/call sb to account"],"REGISTERLAB":["formal"],"TRAN":["追究某人的责任"]},{"DEF":["to use something for a good purpose"],"EXAMPLE":["Perhaps she could put some of her talents to good account by helping us."],"EXAMPLETRAN":["通过帮助我们，也许她可以把自己的某些才能充分发挥出来。"],"LABELTRAN":["【正式】"],"LEXUNIT":["put/turn sth to good account"],"REGISTERLAB":["formal"],"TRAN":["善用某物，充分利用某物"]},{"DEF":["not important"],"EXAMPLE":["As she grew up, her father was of no account to her."],"EXAMPLETRAN":["她渐渐长大，父亲对她也不重要了。"],"LABELTRAN":["【正式】"],"LEXUNIT":["of no/little account"],"REGISTERLAB":["formal"],"TRAN":["不重要，没关系"]}]}},{"Entry":{"Head":[{"FREQ":["S3","W2"],"HOMNUM":["2"],"HWD":["account"],"HYPHENATION":["account"],"POS":["v"],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}],"PhrVbEntry":[{"Head":[{"PHRVBHWD":["account for <i>sth<\/i>"],"POS":["phr v"]}],"Sense":[{"DEF":["to form a particular amount or part of something"],"EXAMPLE":["Afro-Americans account for 12% of the US population."],"EXAMPLETRAN":["非裔美国人占美国人口的12%。"],"TRAN":["占〔一定数量或比例〕"]},{"DEF":["to be the reason why something happens"],"EXAMPLE":["Recent pressure at work may account for his behavior."],"EXAMPLETRAN":["他的行为也许是最近的工作压力导致的。"],"SYN":["explain"],"TRAN":["是\u2026的原因"]},{"DEF":["to give a satisfactory explanation of why something has happened or why you did something"],"EXAMPLE":["Can you account for your movements on that night?"],"EXAMPLETRAN":["你能说明一下你那天晚上的行踪吗？"],"SYN":["explain"],"TRAN":["解释，说明"]},{"DEF":["to say where all the members of a group of people or things are, especially because you are worried that some of them may be lost"],"EXAMPLE":["Three days after the earthquake, more than 150 people had still to be accounted for."],"EXAMPLETRAN":["地震发生3天后，仍有150多人下落不明。"],"TRAN":["说明\u2026在何处"]}]}]}}]}
     * media_sents_part : {"more":"media_sents","query":"account","sent":[{"@mediatype":"audio","eng":"\" ...on <b>account<\/b> of the number of pine trees that grow in the gorge of the mountain in which it is situated.","snippets":{"snippet":[{"duration":"11300","name":"special.2010.04.26","source":"VOA","streamUrl":"https://dict.youdao.com/pureaudio?docid=-139385106736947527","swf":"","win8":"https://dict.youdao.com/pureaudio?docid=-139385106736947527&dist=win8"}]},"speech-size":"33kb"},{"@mediatype":"video","chn":"我们还应该注意第一个创世故事中的描述，说他们在上帝面前有不平等的关系。<br>","eng":"It should further be noted that in the first creation <b>account<\/b>, in any kind of unequal relationship before God.<br>","snippets":{"snippet":[{"imageUrl":"http://dict.youdao.com/pureimage?docid=6315912264594031708","name":"耶鲁公开课","source":"旧约导论课程节选","sourceUrl":"http://v.163.com/special/sp/introductiontotheoldtestament.html","streamUrl":"movie=http://dict.youdao.com/purevideo?docid=6315912264594031708&auto=true","swf":"http://shared.ydstatic.com/dict/4.0/simplayer.swf"}]}},{"@mediatype":"video","chn":"通常经过文学分析，会发现,最终版本都经过艺术加工。<br>","eng":"Literary analysis that is sensitive to the larger contours of the <b>account<\/b> will reveal the artistic hand of the final editor.<br>","snippets":{"snippet":[{"imageUrl":"http://dict.youdao.com/pureimage?docid=1354883003772870612","name":"耶鲁公开课","source":"旧约导论课程节选","sourceUrl":"http://v.163.com/special/sp/introductiontotheoldtestament.html","streamUrl":"movie=http://dict.youdao.com/purevideo?docid=1354883003772870612&auto=true","swf":"http://shared.ydstatic.com/dict/4.0/simplayer.swf"}]}},{"@mediatype":"audio","eng":"But users are charged if they try to spend more than the amount available in their <b>account<\/b>.","snippets":{"snippet":[{"duration":"9500","name":"special.2009.05.21","source":"VOA","streamUrl":"https://dict.youdao.com/pureaudio?docid=3489381727482543878","swf":"","win8":"https://dict.youdao.com/pureaudio?docid=3489381727482543878&dist=win8"}]},"speech-size":"28kb"},{"@mediatype":"audio","eng":"He also wanted her to repay the two thousand dollars that was put into her bank <b>account<\/b>.","snippets":{"snippet":[{"duration":"8200","name":"special.2010.04.24","source":"VOA","streamUrl":"https://dict.youdao.com/pureaudio?docid=8361486732036605144","swf":"","win8":"https://dict.youdao.com/pureaudio?docid=8361486732036605144&dist=win8"}]},"speech-size":"27kb"}],"sentence-count":6}
     * meta : {"dicts":["ee","web_trans","blng_sents_part","exam_dict","auth_sents_part","rel_word","media_sents_part","simple","splongman","etym","phrs","oxford","special","syno","collins","meta","longman","webster","wikipedia_digest","ec","oxfordAdvance"],"guessLanguage":"eng","input":"account","lang":"eng","le":"en"}
     * oxford : {"encryptedData":"TNvL5RvzrtPgEpLHE_NgThWwwkxquWqw-vfSABjPoFNyL3_S4K0m21IsczBUYE3Ukt-FiVGKQypHwLkUAzoIWeFEkTDRjFdRKhzCVwelaWii-o2uk65pOT2eRfQ8Mr4zxzolxNcOIQC-VhzC4ykUDj6eGS1x3OfN3mN1DzTXg_52iWoZsRBhstm09kSW_pb4jsc-UzVgASFgWRuitbZKn252KYFWOLLWuV8l3xnVCJTqzxRUZlPE_hvw2_L0jcUktmuPwU4t7bYvqzjPuXVJ5qu9T2W-rTHC8fhM_00CpkBp7TiKH5apQUOQ04YS-S3iRqYRi-L225937pf7Jeau4fWXK1JWv7A-cKg_IEc8hVe27csfOyg2Hl2fFhitvoqjwtIPfdCQvFpBtockRLRgMERRp24D5acCbhXukCT97k7jxTO07ALjbUC55WZCQUDa38r9B2YyFcOx1-LNY0_rDgr8ry3WpFcT9q_CuIhwSjYi7Vurc8ynCEukQQYRwyP4G6jpqfRG9fLN57axlunamEbtNNsMkqjxYNddBSaCKkV89-cfGtfexjVPbkGLMIu4aXVlFN-Sn9UIo-AoL6g-QRyUNxjJblDa2wpRiZv4wp5iKvdPFEGWTWsRQOCH4OE2fjtv3wq811vZr_ntww807A-oK-FJL7J5ZnKb1w0sbG6hRTJkscLjtmfZGPEc6BCooQEQD0SBJYqDAYSFCwTJMi5ZfipTonPKjsTUqrEbLwRtOIwtYa9TqWnThVVdBmvDF18Z1Az4X-bcaKvgQ7gQz6iRHtNt_Ksq9r4v5QXXV-V444A9sILLEeuEgxIy_dN6OSEfqv8DivJePN2CgUVZ9s6S6ZBh5jfzkrZzq433UMCWwV1xrtwzFm8qVESWiIC4e_F123dtyumliUGTuCVaRNWyU-ZeRE17KYqx4qo6t_aJ3YvOis5SDxK_J-otr0sbx6m3OtiShmc_MXS2n3xelggw02tfW6uQvcybGCnc9Zt9B3zd0o9qCyh5wvgcHv4RBLKrpJl9LvFARN8Gg4B_NAcYmX2wXQFGObKvNXatTzWHDBtu0t9DIunQO9Z0KNGKpMCsZASz0W1D6UlPC16IyNWqT4fW9azZKCX-DX4a0aNyNpPrQipmyYrYiISoGZ9Cs9JgQzyio5ej-D_1UvRMnzq9RsCMRFknfURnruwD_CYunhzb-jxwY1SzfhgSU9zeq-vzR2ye7dUAAqrPLN1gKb57OyoqbvpClmXerwE3OtFxu97BTeR_Jb_U-_V-FcTIjxA-lm2btGEDjuAHbGUsdEsUzCvI04u3hqR9-vnPfDqUk7tzKiiRBHUojMLWr6g8l51Eot2cOJra-XODabkvMyhtZ1H7TzFOq8s8TBw6do5lRtca4SIdigVbv96J9ZoVDTrC304XXV_-WVA4J02ZEsihYoQL_Y4z_CMPKbbqIdaWuXDoxeU_Y3UQ3QBiA0Qtvj6HNFMkhLlXplB4PnT9Z-rjd6XR6GON0bCf1LgsvwfoAUt_hvUd6ezb2MSjetyQprTfXARXmRltn7n3SF1L-2EgocfGW_a5ugZj3-aNnKQkOpeH3k6VkCcohcwVqiUpXApepoA9s2BsRB5W-dTnDTCPaqnwS8WrXLo4Urpx0WVODEbKBODlRUxuJUPm1SPGfFmIyvZCC4K_Jb9haELxilYedZGk3M__cfBt_BjCHuKr1hLyvWDFZjgg1ZZ4Y1VVaOqWSZFu1kXjwUtWLsBxqCEn_BSgbQKyohBaaeLONO9i0n4snFIZV45-a8Jps64ob5fJG-HL9iAhdx6_yhSw80UPmVSzRaDOfFAaUAnxNsr9pFfhDONnpWePnlwU25N9duz20V6dJaurtVVsTkmYj3w2C9Bl01toVzOCTe29fO0sRjLVdFQ1SWDQkfQJxgrb56IpigAy0acuApddkyNRs7xl8JpEJzu7NvAyucScIGMwkJRw7Fxo1wsjPVZNIGPV1HQFxHpcYRp6E4ZzC2_wvknJl2reQ7oVoPGFH4S8ccIxzCH-2cwcSDm0ud-Nsc3hdGM9280UaTIS_j707_Nj3xMSt0aIFG2QoJ7hnRI9YwkFvRzeoKQ-UcL4TAch0wzjRPABeREcG7mo8RTiWB1U-0IupmXUVHTsV2xHxOZRJfVMzrehmAwyH5HLCbKywsGTgVXDaMVlaxWAdJsDqe8Xw81If09_j3cPCi1CX8RjLbXBZ8UXgutQZDZTAbYtjTFvEdmHaavcgE3qMoJtAX_v1l3F7kVSkpDmykU7yH5wgs6K1D-__QIdECQSJg8Dvw1heJnUvwWQmyiG55c78TQtUkAe6eHVZ7gMO4NoeW9RQpFFSf-TGL-t9jcsdGvgn-qerunDJhhYFlsFvLh9rnN4BFqUcJkChkxiX7gBxy4w1eiD7PucTHA5LD0hgiFcBsBuJCRm_j7HFuPdAQLCzHcn3v9xKCsbao7T1BDpFvwyIgEXmFfXjHsq3I5Avj0CZFxFRb2YfMnevkz5NaxtLbMfv-8GDLUF3dOf-oazEHGGCvrQW2CFupM-soLEbaEszOnJHfD580K3kvsYrRh9ythQvqt_gWPZnfPlp5Kd71Am1qUEWw3QMAS_p567dTAbr8e0o_vZFlxi12f1x6pDcWqgxFyM5xwLblu6i6EHZaZdAf_-0W_IWjYlkthiSQ2be43B4zWPe1gPlL8zvlztRPZE_U7AddDVITb3MOmrU_nk7CgO8G9gsBMzi8mAdqGkOZ3A-0SNi2abnFHhjpcZHuxRCVXsyXrkQa7xSv9fku0rXoAEhT7S1QVCwwW-mhAPjVoECLFdob8vECpbEoSaoIDnqhNJnfLDHEILEvrTrtim6yjI1hnnLM86ou6-P1waNA0QIGxCwMe4ANP11_QFg18LDLZRV5rkso43xa7Q3hsQBa2CSHS7emGMKvdeGXxa4rC_okhAOKCpP7hadLwaE3bNRWusKstkowC-eQXo5wcBXS3YvLVOsfkYv5-jJyU1AXceg9Fi8PuuVxhslLv759jesL82kuhptzZk2NlJOqe-AwWbdLlK4aAutzeXPD5-nvH5oxal8RxlTz6yU2KfJ10dgvnjRrhjzVGrQ0kTzVZaPnQFajKY8oQoSD_RoiPua2a3zgPN-P2cfIp6dDNtcweN5QT4HZ6VSnCS5EaRHUklf_RAHBajRvhctIb4r5_M_VubFwtg4usJMlUkgodyMVN2e7dXYO9WeB42sKgAA_GVJWsNuag9fawc3fZzIdWr7YipQ9ZZpvb_RObV7oKPapJtwv073qVM4bSOXZ7K8Q2gbLhY_CF_C7jhrWf-fFa7MOSI3k1C6cRe_30M4kW6XU9k95GbW-Ap42rMJ2u6YGdMLE4zZBbw-HjnjwUgAHaSSm6-XLzGkZf_lVQIHnCt-MUKagcw0eWysifNr1Alagkr5pA9VY6P8YZxFpmKFx7lxy_-bsCbjRJCIKiW8KsG_t3MSjuBb4VLEE49kiNrJBQ-s6m9ddueObRVKnz_zhfMBfZ4si6tHJpBHf29m8ppuq0EoBMFR4iPJ5-Y8jOqBLrtsTv3hBCT_wZKctcjzhZ3OIGYwf_tufP1tC9_EG1v__x-sA5-fyZzkac7WWUF8qvFGdcCesk_ZNOdzsRVMRBd_8zD2IPyqayb2q91JzLJcYw2L33ilNvQDZkPVhNjCVAf0O5sb8hSl5d9-X745doVX1TJci8XfiZpwuiOkZDiU3azW5ndaS4XgyR_BkRFzaVj4GbXWXa9NWVrsYLmVYSt7k_pYH-cSepMQU_Ca1E9MuXLiyuV88J1Z53v5j6wdSmbfPa83QWJcXbJpX2upL9lyqVnjwht5YqAVZ8Ap8pbiPi8gvnEPhGC-pcKnIpeQ-BObltn2mT0sLKOPGnSb4WBQE36Gd3flPPv3EhkvieNsQuysxevvCGQabbFFMQp00oSIfUccRawL4Rzw4v9URM5hywWgsMevkwYiqcrJxRZuts_L-ABL_a2fxE3OgJWQomD9l-8in9iQATR8_s9xczoVgVov7WUZtaDcuhARHLogSLojh7CryD932bHI0R8smeMFXGkpb4_azrQ2qv-btI1OBWR09_uqdr-GIENyI506fVZeozwZMdloPVd6ffeaauHCHlZPZzoEnV4aF7NsiTsN3CR_AE17whNn6y1GqfvO8CMJDME1Ly-WKBuQ0lda1A_efhS0nqebincT-qHs5WMz9Flk1UM-CAlRxxmejNgLET51kZeZy8e9n4jofbEL_tThwmEP_QSyEKr1BlaC6a3Ia4VaaQ0VV6NvuSQ8hSqN5HXi1--W6M0csR4ufsBIx5aOXh6_omtLO0-uBkkbpndLDz5XqHr1N3KsG3ZhA-tltXhIWu2v-l7tj0GF_kgvAYdPULNgPUbQcvAXt5MG86rhMKIxNsrV15KeCfqiTfsciK4n64h7ttYwreseIe5Oj1jSZELYGHo-WeLL06Etv3J83Q87IdXNML0T33amTmb6RRSrobjzh0BdE07d9o8yPoOD5Yz2x31S2iU0ogUkjOqluyyo3lWMy-cyxkLl689MylgaTPUfMNRctCcEByGbHbRCdRNG-KYAaEej82UnQp-A6G5zVwdb0tRV60uqOwn6U7C-j3Lus7g9UVuhV1RQCKMg70Y9Oob9JtcLXxBwuqnFj4eBew2Pyt0KK1esMqBSKl0xhvGs_RKFiKV2vmiz1NIpOVhj6bCgdNfgp7yG97fAIlLRNdSQCy827k1tqdspgEPFGk83Y6qakkvUG70QOmnrQ-CR5AGX3_WsrVbSrQ_g99bd9suofb4ebv5hRgsC5lSCXiliuc9syMWLEo7lY0qfAIz0WspQ_tLU-k9U11HGKRoDFdmFmvyQ3l3CroWap1lzhmRGHmXlUkIUzZH5jfEBcrlxnC39KySfxupz5AORA5WCCaZOp5_cR5rlmRt2sg6PjG0Bj-r8fWCJH8jOhpuplvWQ5CQCtjg6zkOzJqOK3dF0EYfHLclu1wmHBDJLGd2fnUK5NP-ssBguxdANFi0f9KcNxTe2827t_xqNdpN1FGugPMGlbL4xKvfEiDmPi-1Euz7_1j9bqftXZbg4ZgyNW8rZoCvgGNsfmzuR4nrmbRYA7n5LhRh2Eczr25TFWrNShXUBjWJItPKg4vgr-42gFweyGyjzTbmL5X026ZrIsGUzMFmL4pvLlM2crHv_WFwtpXwZXTgqVcjvaj57Ucq_PafUDbYCitouh_wVWXynhFqIvNxlQpkkS8syl6geYybivBQBqPnaWoej36SAA-lRuydDqMIMMpMFyt-0T4s66C5_7ttbRVagBlGnFnYsmjn26OOSgp8VIYIBIIJPnXFMjnYhVlE-YlQUz8-KApmCfo6rX_SJNldBztocBS3w1jZxRCR1_ZcITA7RPbap-xUsNy-uVfUwnXrHj-9mv6gYBojrEELC0OdHvk-a2PJYPsJ9AvGx8D0JY-RsfM-LJw5QhKCLmShUBt6qwUQzGNEQpzSoOtw73CEYj3DKIUwdb6vrdFomD7_HDD1pPp3kOM1RjlCPyvxuNROLjFNyiQPPPoVYUwX_llz_H_gx8Bf8vUTOFxb47b3ZWA_lAIj30A_TrO8fful870VTtog0qKdL_7eE3iAn52bbljN7vbGlSp3t5JoiHoh6zJXMrIRuEUe6tz-_fKeRQL9TzR_pJr50WI4C2HQplVw1LFlLLIID39pxyaZ7XrzkHpeeoHfhCtnYbvImEchi1Wx8s59ZGjGPDUkUvzgfUMGXGQnCvRSlB9_A4o0mMCyhRb0Yhg0L_tzXg9z8zB5QcRakGaxwXvrXZbutRRASu2itwWCJHi4ryIMqOdus2yNMYZ-8tJB2kgD38brgvBrMbGlpRyLJOKjOqXqMJZB23g9Mh_Kp6zU-djS6UhisAi6YpynY6k6reUa0HV9Q5XaNk5dGk6PU9LfPO9jIBUnBsRY3UGQtTpdtY3S9ZHMlWkA2WEU3-H4Kgi5QTaYYIYJBRhqKHIXI1YdBFO4TuL_FFZvKv8jt4so_MQTUIu7xuyjnkHON8lYV-BGHSXO4Xd4C9wz09gAaTDq_OYC5RW3XmNiVkZ4i85rRLozzReIo1wRMn1Lk2VbUDWVnf32zZDugy761jltqp_3H2Ahl92MqnpfAh4zH2mCnqwOw5RluIR4FCb3Cxn9y05wQmIALM_n2aFI1eoQPi8hLFqa3EiR0SFa6WLm-Go2VQL3wkAmARiND7bPzs3NFTFPvV0W2d8uRoqt-xTA8bnMt60fBByVuMmxqQ9-Ephl3VhKqJdbtxHdk7HUqgdgLGpQxZhFzcfmf8LRDdgnxJMu14FRnD0vJ0JKg7kkxjMbylKWcbS0v3pngoiBdT-ZnDNCeZcNbJp-7VFUmaPwR8TQJT1qpcfdYLAQA_5WjiU3GYdBfJo4USvtLpF9fPcD3VeelZbKxb0nZL-KFNvoi-Og91_nllM3fmkOuydIMGIMsY8kskUJMpBhrun_tU6UbFhX7z43ZI6alDAHR-9kAqYJNmbpSzSEy4G2-wt1Lr6ak_6X3sNdSJciW3KeKnX1nnerkYOz9jmGpDd0Fc0cbtrqtogtPpxNvWqIWEqUBVPX_IzG7BrxfoYvCtYGzyBRM4OYCjY9VnGzGZfAaRJZbi-rxrZ7uJxu5bZJcegwNN4GqsydUEgAwPdTsbd3OEYbTB5SDFsIsWUxviHHuavHYhjZQSxK2vSIn8Se5Syce2G45jXljk87pR9x0bdYm89mt6uiFw3kcebfFvScaelvpxCffcR4AhIGLRPTGtxfGMU7s5V0M4M0F0c4VgsUVby6SdN-hBTxxQjmxY21x8ev6J2Pi4jpPwE-vboQe0PkNSNCg8kl0-6SgwbWgUlgUtYEyx8_jvTaNuV3rXBiZ3ioF-Fw2vidXyXOX-12ffqjTgNh2uisFJRxD6gi_BKxDMdaDlKTY_xLLGlxCEhyBQWsMPOHX2srqg9A8c0WOsd_dKM6LICgb2UPQK_yscbuCK9iWOUqLH0IXw-M5G6ZhQWmZptuY-uUQT-rSvAb-XH7FXq5pTrKFe9DaoW-JKSg2oT2R7rDFYpd2BapcfiD3CwKwaQF-ZP4YUIZcY-u8g76YX9j5VIrXus_z9-3J8cjeU3SDU309um-MEAwXd70QeORqIhqwLR0N7JFQki2lxCKYofYUquvkgw0FHdA-2N4njjIKommLeDkcsYk7UJb0--VkAndyQPwh_ouQFBDd3d0HEeyuVyby2EMFvXlIwTOh7AyxU-_D_1TDL_AKw0YZTR1yjpNNwF2vlj8mTKBj10wljUsG98BlWRz-b4Eorosorvsum_Wd7mh7McvPxZubkRDgBmjx0IlQTTobwKvsyikvq-8BtLYsqoJ88YpYFpY1mWINIkMrkYI3h8nsrQ-90p1U9cD-Zs8I5q0Rmk9euS9-_QS8pue1BfnB7puF3VYf_7jdbiuGbIRv1O3h_aSIwsHq3qN3xVZo_G6IjHrtalC228Su3dIabla1guZNnCycBPLcztbzRyxkADu2ZnRfSUXlDsZPiS-2afWIUzTBawlT9bbUNU4zzQ6MVtyzW16v35uappxr2Z5YsglXGNk2GkQEIjH-WqlqRY0oofVNjMGojv0xf1X_QSftIlqUS8JiVf2yZphrZtZ9y-T_b1-R_T2esqL_RJQtfuxrNR_biuyQnjt9tluzbmY2qlsjnoPYIKEMbwlF63lC1UipLW0Jdrpa1BcZiYAsmhrxRhfRzj7aiBX4knfpfdENsibJBmFtAamlWmYeakF6lknn4oZMRBi6uMhkrs5leXKLFYozn0OCAiM3kQhwkAngH0fqf4R7snW_h8VSDwdD-xxBYq0cEkgAJpnYGtF9TkVyb2Z-VsfQETqRo9uiXTLYmMlXJ_Xmy8R5lTfGIqg91-M3u6lrVsmhL7xaIBKzWBwkhrPOG8331Sy95ml_05KvBF0KhH1ogSQDzztzqyWkwedh2a_XuccfjjsKHJhR533SgYTaDRtpbmdiD0S-gSB4tgBvoelBfcZgzUzwrBTFZXudYFstREjFMwsCTVym74MvNZ6fEG-QnjVPe_2tkaNJzYSUXL7qf7q9JLVFX1bA5qUNrUCLnMkcG2FB--SugZZbZSrdFEGdL58h2LxTNj5h3I_NlNZ3fOlglbUy_f8No7aro-rQbXzXzJiJ6v9hFB3jBn9EI5yVkYoKl8XgQJ9oELpzcSJCNAYOjOhm9wV3-kL3HQrozDCYAiJ6PkvhnTcPnNh0-i9zBgjzm5ASmwzGaAFjsf7rBuQrPllztIg6xXMH7-8yDA7P3M8Uyzv3dN0KUrrq9cnS4mMxGOAsEzimdidZC5zWVlIAqQ8Ku-QyTmylHJuRvzzg83IG2R8cM7tmmqMJi59_4Nb1z_Cm_y2eZm04Ma20krsoMa4KRSulRrGiUm2cdXTg06RSTUQv3dpiBvr-OJD-uF3Kb24SODGd6ojOC-fZt264aojEyDfCFuRWRCXsYDIYSxsOZSuWmpcjkyrTWkdQ8WnmuHQgf0qKK763pAV4Xlse7K7EyG9o-b2k5jeYraGPeEwpQJCzfZxIxcpFyXJymuMwgHznRbia9uHOqh0WCbpOb6MPkSvL3Qo6Lpcvz0ibyb4Vn5_ddYEEucGKRwOAZcqFd4yPC1l3pC29K_PxeG-fU3rO9jeza3JP5teC5i_Q1D9PdaY4ji8AvGdZaqsgfWxKXN0JXS-9sFOW6OeQZ7hmgHtVP5FuLsl31p1WJzo2_YqP4tg6hurjP3XkRhkpq3SNHZt7XfUK4jJTQVZxnonXgfBmsNBLsTozs47sZSqpioPcNxWRbZYm5BwgGv0a4ANMh8w5Wc1FmADwL3O1KCeIYfrej9r_b14HL5M9A3GR5ZQsEMFht5GS1Uye3huVV0wTy5VdfvyZ5wLG8N0xT5bnMOMt_K_ioKXKp1X0mXjasQG4HUudLz6DPJCdP1ZzlJMRRocHyyv_PletB5NAQdi7Ra1BxdN9IUNZp0gW0YMG5zY3j3ziwkyw0CvodQDA2yX6LDkx_8WocGWxro2hR5RdWrJDfsWtAyGn4fU1pNa3pUMYXrqmdFCHM3zLSxCn3ScUnaJTkwTFPkMRE_vtqwbcXMa_0MDgvCGGePDSiCCASm1mSYt8vz5KQ-D2vNURBip2LktfeOnwgfYmGeEi5zxbxa90WfoiqGDsrnBb8XIwyzyRHMB"}
     * oxfordAdvance : {"encryptedData":"rKj0by9ucBtV2wn4uQ2U-XeeJvpfajjvoGj1G5uD7G__Nzm3iWNI47CjF16r7AWXeOyYlqMJs4o3v5k0MYN2JVN0btA5NeUvDw9a3eq0zzT7URgvLWuDgF-yMndodAhvVPB_T7fafU5DlkE6qGvpPTkem5f9OTyIBhp9JvkWPLRBhDUixdE6RJ_aQTAbXSOysifNm9jepaJUAPSS3n7vXZIAzXgtrDwz7r6jUysRnyFaXiF_81fo9l87_Q-bZYDdhSlLiLWjZhTbyf967C3Aw4N3qqiR8-zkjl1Y7JOgAIegkb9Wn4OOdU1dUJ2NoN9QTU8psHsfian3MVw4Y1DQ_n1HOe8S8lRdvA9i1VKCVsiL8vJiDbkZ1CzCffePuODjBMclTAy2EPXelHQuVRQj3-E5LvcoE-XonVTLLcgZel6P9MhONGizfB9U2oeeIiMTUdvjiQ8cjcwaRZOwJf95JEz2Gxc99tRdvgH5lTYXEVPZGiICGNfV_XMC19lJusLbMN5im2CdvCFNE4BbEEj9YvR-s38kmmJm5l2W0mXvSG07I99MumEza-PZKR0KKMi6TIHV9EWnfGMIOVLugAW7rUxEkmuZ_S8KDx8NDDHS6RBOSGjyYFh5DeLFbciF-CcyrJdJp-4_6JnR5HJvmgTfx94YV5QUM-64I-tGpWBESrO_wuHglIxcNTXn2ba22IPEQzW-ShDoQS6SgXSaBYt9pn1JM-CxvO65bgtEkK7ECi-Z8f-FFk5NFK3VgnT_1A6ZnYTZrOydXob7mkc2zB5tbExkWmKVrWaOKKNlmjU-9KBNcNzqz1LIjKK-ArQ6VUXtVHrKYjzANr2vMNTfkUUrfxKDxY5MAMtTRtt0K1NZjhHSESODuNyGGHI-ZElX3w08KIiycXQIg3Fs3DJ2cinXt-9lRiM6PMKy6JdH3hipKT3L_KILybOpOr11Rh94n_FnVLE7dAye1kncFJxcNXDVUXaTqiOVE6PzvdNDpESwVeS6ZCNfIG1p3BJi3y7BnFzQkd-0apAaO3AhNi6HEu4XjxFbnfwyteC1aMQGTV0lyMrMsqBKTdfWfswShEWcsXMnsSUOJiJCE1-U6SOFyroz2f9ktkbSF3-Bmt6zqWC6tl3I_ku3R9nJErZoxeBfScMXL-OrJR_HiCbOPrJ0BDXrECjdVWRRlZRhadUCa1vvB9Uv3l9yW8LhnklE91gv2eel3_x7VUcyo3W1lYEA_puizEDaFY2oDPfidhcJ8yM7UI7vndR5NJpf2nywH3-Q1gepqqEGCKYVB2P7v72MJSKApBpTg7o7r_sOElwnZZcLAuB1AzdPrTnMPsV4hItOYI7-LWj3g8k6_jvflFk3Hy1wEnXyy5mLUU8ScaHSpqwKuDskCVZvBF3NjzFvamYsUshTwL-kEDWmQZ7djCVEhGQJoBAW8xr1Dkmjq-ueUaoy-LvNqq0F6akGPwEpJ2LLnSKZsd3DiZRXNjvd-xFi6bgwtDxYkLofk4ZpLH7_aUatxkLw_Z0DWgKdgnpYPWIyHJ8aKxE1TecFYPkR3doL9WCGZKWKT0xoXw1xksLarbKA9Cm3fNTagA28HcvI7X_Y1yVsiqa39_a4CqeAiw4pppn8mQ_cGTqfw5R3X2-y_J0V1YhIKkm5_VRLEj9xhg5KK2MNIIzyCpIOx7sUx1TUsjjvSFImf6-Pb-bxcAUVAFrPEDedd3hGW8Ham-cim8TDAE0BI9ozkeaMd-Li4peduHAFG2xY9iv-xtA2phjhPkWBQCztpZtYJ0udwNE8mgveEyh1apzW9EhUv4c87NJWvowTnNfp_i-jVCAyENDgVSzgug3IgnwN3WBXCiB8gO0Ea_tVV5dv9ywwfkgZHKswowD9D2wqCgJdXPN9_sM9rbKUcqCDzTy3YSkBTAky3Jivyd3Ef60HFaQJg8WPICSrF4aEJJkO6-Gan8QA460vy3-ir11FJ4HQapvGkG0SgvpvziZrV1DgO-NzwO-lYMsAEo_4wubNqJnpp_cOSOdU9uzaW7dKuPitKYKfgc-BkwhjVJTSU9D3CjlTyJcvGSjpJ6X365efLX6AJbGqcJzvDzDdtJoHq9i4qzzi3nQL3mDAqEJ8Z2y6-ktIPfLU45uddehaJ_Cx8ipAa7DJq1zuIH9MPpZMuktcqmQcNOG7Y8sGWyJITyiyNk-EekVeICCZynt1kFEH6ndrorBlzqKeQl_R64QvBvn9nKWVpNu7pDHN_w4nce8E2NVZzEQFwxy5OKbu_tdp7QNO74aqsqG8qTgPbsrWy8bfirrbH3zpth6NXiBlXFNKJQ7l6U8EYGb3g4un8q6gWjACf8ksx6808FmPo2oFrQ8DBBED46Sad6keh3PL4bLFKDVYZYibZu0PYkkvJ9QZbjWZXz4URKrp04PoMy9aK6uLhOA4Uu0xrUmTukXz8zmrQBLwVqwVM3K7eRZEJL9o1Hmp83g6tTuNlLde5KwXeICnAlC2SRvkcMBpUBd8Xl859g2SghB4z-3BsaFHUoq41-zjetMUYbG1ILDGzcMe_BBvImbtNGxc08pgDd_qOUGMFO7vrJa1ymKQrIrfzV4vqGxmQMZ58x6coPkKiMO2ZewcNJhBK-UpW0hUGE0rH9evm1sUpEGttW5aj5hVOj-5JKcdOs41rzaje9d2T4y9hweXZnk9Wi982pqN_FHXujTsLwAqsTv4mmOI8C4z1Q2qqDX_c5LdsFdmaxsl-mePsQ2htWucZoo0ELa8M0jkUJXWILtlm6uxURkiO9V4D2J9LNp7xRWQtT4RNY0XJlSkGKuCYBvQSRaceh_vvRnK59rVhDK_rkTaPFrnvfUzjP10mU3jYwGn8PD7wbdUWg6ym7bfDmBJacZdwHpKfMGotM7f9yFjESH1gzRePS2W82vkU0du_2JfrsM3IBNaIxpD0MpjcyaAJO0QGvNLEjLpgqzawzX9mzkDkPk58XEfn2Gg0Gvx8wDKD_d6woz8I9he71En7fyKvtYDORL0VMn2wlLkcOxkFhz769wwXCToUpI3CK5-uvKwHgjs1mCsJKzO63EfY1sxUX-SE1S8C6MG3SWEic4-CLggoGk1GGsqxBLQ5ceo3MHzXpTEAysLtu-BRpKozV2fqrVzG8mUsOmU6TK6M5Xqt_LF4eJEtznrxm-AO_X5ge_86_W-vC4ZRnNfzTMx4GOTerefxWqje5B6_C-WM_tbInsG-AFpyH3bQ2Ng_KewHOWhLZd_fzXKHJi2JctjmoiXGvNZ4GOFoPvYqVFGMPOJPu8-9b0ZW46I0cYDvG0UakcpnjNTxmEH7w9UJ520-kQe2vIEC3kRwe3GgHGfHrrHJZKc14sitFtlL2v8r89bENmL4nVI_4QomLzvZbUYLbLpG1G4EF0UoyoIP5dnxC7H-DaLwLW3HnkEUAFqj2MnXrX-6PwhsquDKpV7-PmOSsEtLR9g3yoF_jobW1N_0mQcOZngAr-r0oOOpEXm5L9fhYyI9gn7L77GI2hbdI9wtzn3n4hlBke3heHuSX6MsdroVLfsw0uDLCgTuBo3JNvwzBm5-3wtAQguEynG6Il9-wPLql2PC2lXAj6okrAr2TLrqGHpoeXOATX-aPEy36zrjO5Z4u_1IDb33wjp77y1TjkQCt7cPGvZFYHRjDVR_dcDW5lnFI7-QVaLXsTg28SHPUMgwNx6VTwoRblIFECf5Ss9GcdUu1EmLUu3T-Rs37Kpf1-d_IKIkvDus5XT2XxXlrYod7lua_EP2auNtCIrq31tVYlnkUPhxhjADa4TkXkWrQvcqiRoqA3p7PKRTEGlqQ2scFxTVZP_mK6zblTpI9i0_wYLvx47MnaahP4ctPbKzBmQF5E2oA9CFvRwyUSZqhemiAEQ-CBRsNj76JH0BmSz1GgoE5z_bUTqAB8f8zeQQH7mvyI2eM1qkV5WW4ZYcIMt9Y8y4mmJvh-ee6XAceitTKRZHGI-EHDZGleC7OC8FjUlZkZI_H1SSjvTC3b_ecPCk1FaFF8GG-PEpBoRo79GT-Gi7Yztr4vDHHJEJsSzY4A6se6qvHfiw0VcWXpys6k4tOkB966S7mO_UbjgolEJDKTsC1G2P2Hq_8v1I3Nndjb1jpmJrJWbqQc2apzZV1eNStiKHuSWbnaILE5GuGSvbyZJ7SfIyM2X6MOKfHRh5Mim-TtTJ4pWReS7zhC1h0VS5OYiWNvOKFP7GRKm-bviq9giX71iOjctKNKeR4sDnYRzY25QhvETBb_jlzQqHITnpx9Q64ybwKZe7UhdSwZ_BgfTqljEQkYJsC2W3sHehHbJP0FU9U0xaKN2ZoNhFDLqR9p41_0iNplBHTf4CJdSlarfAlDxMi9leanZyZKEWi01wgNmUW1wcX42rxdyOiiag50vkpC7dkIcXISO8yz-zTLXWEIT_fuwBqGb2M3f7YjxKxycyMZdcm6F1AP-hx1UIxtJnN0ovrUirx8MD2bZcY4RiVoqZ48Y3vDD3l3NMqbEXEHI-_otktWSZGbc0ieH1iD70V0RSZg8KdFTNo0VVMSlaSOGqJ_XpCGMn6sQxFRel6wDVgbXEj10PTom9NeAiDKYvuPANg6FpnRyzbOdOraT2Ol3scdER-G8HAoF9QQpHgQtiEOvD-4az4t5x5NF36POX0QBoVge2A9ae6Z_fjZm3ZnmVVWjojdRVR-eggm8zwduQdXNQy-0w-l9moQuUK7gON_Yeuc6-3bhbPpZ-CtzXI7R6TLy8vzXvvlpoWypZ9TJfi1l0LHD89vr7_UPZiAx8ZNMUw1dvrBFnY-_oibD4IfbbbGfjrarXXjqP3lseAP950Fx-TfY6EHXjG9gpbsSQOI7-4WXKSIdR2u4ZfCAynEKGZAO_mPSb1EMm6aMr9pBjvcmapDNYZ_5_p2QitQbxe_79kOl3tKrc0q-_CR4gnNM3CoVGB1FJhYiFzVpUDlQQJbC0qfS545HWab58l7OgJNLXcWV4Qs44BzSOjgcIqqZxsLtnJCJ2jK67N9SGkvImuV3KRtddtfxrb_GnsHO9JmVvYAxJ0l9EAfX_eDptDp4NriFGas26DLDKSCB9l8YV3GoUi8cSR4yfD99AAxLc76-V-fJXVuKSNdbts6VRGgBNbFfv_vJvyqmwAH8DV07cul5zGIcdn9jPvLK4rOs3LxT_-de9DmH3a2ejVTWuUwZurDJ6OhAHbf1ZovaqNQTGnWrDa2euFzgHisSGZeL6xtHfIqCWuiBSuevjNiGOTnT1LIaMNqzLkysPCMGT0K9yno1yF52l2OnJOr4v-1rKA8f8ozeBWPv8k0ozqGobQ3-WvMfgUMgMAbMydBeo-gVukMYt_E2nnMEQXMfo7BA2s9fQEcKwzO4vdhgvTZ2fTtWyT8qoB5ws1TgtWJPENlzue1FcfzBx5AXs7HlO_pTrMTaWZk9yliiKaXzY_Hopz-iCj-ta_HTqYyWCWxzG9qK69JWo2GIHiiNBsv6dISFZ-OvmOPDGKy0xMCH0ty94B4JFAt3S7TtXka62S3CuvgNUpsG1hAfSbgAFWPU4m0W1OFV8XLBhEEnB_4_oDTImtUtiAoHTSNmrwv9-OxuutGHVhYMfWVAyxeNNGtzHG3RqOBWBg9qTQEfUqdsZxJ1xNcSus4fdbjyKfxTBlvWu8mOjyRdLZXjsXOZZ9Uoo4Tbtm4_j1cfVI2rsM1mH9ABSsG6kthCrnSgabRVWQvV71RggzKqgN-VdgpNNwUEu8HImxZDKqcYDEvvOb1EgRKFg3E4PoV2eWwNRCST3tWNbD9SysYyC_5gx1U81TqdNh7ALMOKOt5ZdV_4VkWN8APDfCyEY236LFP3rCNQW9eVWAXE8Z9DP6KPrZYahaXKVhGzkku3bXqocLkYLaHFtSITMXdypU2MBygPQaAmahurlB36V7oS098DOLa1W50M0jRRXMh0_8fPzlqr78hhVDKWec_bGw-extn9WbAg6MfxmHH4tN2OuyeEO_c259MmIi7CFU3DOW7ncCN0GxbrrKrZk8m-roEoRtGKUjQI_96Oi1xwcItCXMsiEeljKLRY1uGutqx2cBMEUX4H9m12iQTPJGF3EHcmgCeoyi_MSzNq7hXJcmUO0y9Ez3cCpAuhPFV2VFIl67Txd8-swSoccbFSLCIYuJppc04pZZgG7mBvceGjvhsqPmNW1bhJh0sWAISWf91HocwNGwmos4YTkBKPO8P3Sm5ZsTS8p312oJc2To9x1n2JIZZooSnS34ZMPm4oBaDpdKhAnQsTyKJKDa7Ym356hy56X-KkYJNEGB2tvZyiVE6Q1uCwatryh-5Jiyc_vNfPepA__62cXsTvMiRG5Mraky4aO3OpnBYc_6YYCvyaGQiZyIFcuHsu1zODZc8Wtoos5aHLpDsex9irR2siK6O50fzqgPIJ-u-T8TNFixzOWB8PUuWrSTfvw8KV56iJ5qddlQO7UBo8V32OR2N-G1ij87fXwWYp_cNb8iDUkXiguhR9Jj0HqazzY0Rknas2A3_oOF5AybJpnMgaxQDypw8dedUTIpJJW6ePwy0JhE16bVSBC156Ktd6nKfO_lrFFz8hbZnugJ4WIFNOaplDdZ1G1y_Xt9dZFGIoIG1QfWimwtTDeU3janN18AJVgNSBh8AziSjqEpEK2qkeepsAyPiegmwjCvRSWCVvrxwJtF-UdLXu-frHj17lQi3hRWeIlxPsWrQQOrlKFdPEnTxTOHruZstlgci9mcz2AS8WTnPQ-1Z2w9nRZ5gVHNzSlNgPKEpTvOgz54fDWqJdw3d8ycX3zfy6xlo3Z6lmOO9u1-u4mac47jgLyCpfGx8Y39J-iKzj7f7aOwNH7xceiXyrMhqonAvFa7ST0GsRj3rhKfSAH-9F2NZI1RvCH2GDw2T7bSaZncSzwJE50wvLQX1PgmCj3ebjCGMFIPt40FvznuJGFpgauex8tJJDQbo2EVcCdYjTediLGw2kFB4vgnfLHZESHekJ9h-fCF3y-JPHYjiuDim9U5WibXP78icP9o6kQkAe8hmEmTvY2rRgfAp5lUjPok2aZJvV91qGUMvAwE4ZMisiEe0295KuQgYzel_9PVk4wuPL-eNtrXHsLDzaLEAU-CwLMMQerhAiWKpqGu8jvEPAHokeQCSVCBfzvHpi4e6eP34AHTixwkASQQEJsMqQ2__96g8G7I1iBKRi-uHjQf7sNhKAcQkTXArH0cl_L3sd_jsPBN6W2RUg-6KiVrr3ppW68dDAP7dZLkwLovwlkmC9FMH2gGwln_54TE67zome9fdOTr96uCl5_ZmYyTfGeq_KBI_VC_Hm5d07qLbR0e3Y0qyJnhHxU4L99fendMVOiTNwwyJ4zjgA9D68aZj9oMbeCCdfOWz5DXropS-zSdXDpgSSN87AGc6s7KFXKG18MlWLyPxk0QDbqE8EYEcmYNDyb6jkAN7WXfhW3v9iLnJElF1f0lie4wDYaasVG2JGFoZX9y5SLzlmS7xeTqabkzrbjST3_d5jopelf6uQuqFvGaAn-6aYdsbjepINNXoZeIBI_xzSIpbQVIzzM-jlrqkOdc9AlDY7GjXx4vFI0OeaKFbE2pm7WFB5jqFYnxSsTI847ux-OZzKxSAyfvPpzvTt-ESBdzCtP78dMtF0_1aVz8sjbDCy3_icAZaVZZlPk3w-i2rANxobzcSoxGO6C3FVDKDyThfPNvBazk9caFR-JX7vwwwkatuL2qiUT-aPEKAbK8hO2uNalTHnfhnB16FtMfexp8fSn7qiLBeL0XGoc2qbbM-5-ogXm493s-LUZmJgtHk6rpf7TD6gHapJjZbZKY8SqZZ_uYpWUtc2nFvQ2XRgMi4avn96k3JSd6aM2LRN5-JsOyyqPrYo-d2I6Z_wFmE74l7-_Lf5gtXp4_N7j_2wA3vDbTnz1xRoi7_vykg2zlhHkL7jnVCxP3Rqf_lm3-Rxw-9J39WXdmc5mSJRyfKoqRCk2VnkfHGwgu67955iqh8As4MP6V-GoljUHzrA6Ey9JqHtBsYISFQOxrdO-6KsdxU7JpmQ0szmIhXmkoU996Z0WLPt1X6EpVlz5zkiZo4U8SSm-yWFb4CXedy2G33nbpVb3ulANCY8KNFQX-dPJ_8uN4g5empyt-6Y1r-_dm1QrMkUMLu0avqoOmHT69whc0z1FXAMgIfVIpfYhQpHBSxyKjsbuYo7VM9Pt9-zVNY01t-O2f2-k-Nhl-AaMlk5dtqv3LDPkiE_kVOE5p9PleKY5kz9CVp-HLQQeYXLAQC6s-n4VHOzu2bdGaX1AqUV43wPjAQ7PnVp8dPGNKKGYPnVgGW-z-QB1zI7yxQe_K3vuQmIm1zggwFkrJQQOeBx3fQxIJHRDQROTnL0XUjSfoou9fQx2Vz_V3nQX1TLBiGSWBA0eRPUzz6wSdaAF9PrDhcmhM-fhMeSe8fSktZyAFq5YOo_C9D5nH8Du3xlZjkuS8n6WVEhadaWQNQ0sbo7uGMyJ2787daHBVbVYPrMPyYinfFZg-XnY5_PKoaeP3Rj2yA8kMH1HBNtHX0rRvtrEjm17K0fS87_wVLytyhMlfl6yAULCasd6CM6gqUng4w8cO86ir7RywaV8lz-urWkPdhl3nHSqJToHY0STJP3HylEiVih1mPtt62TFX5eLavr_YftQzYLn2g2W8DaBXzPbZNQTQ_HzloNQX7SCI1vSG2N7ZOOiBorxxiIJx_G4HMFjCx19q_nnH6_I9hl7X8ndB6g13fld1pSqYu0iBOa1IO1xrngNlo8GcWSqzqFVKjNeFpRmeDaki0wKSOFDAeTU2mFgNh6CIfcHz_pk0m1tYSeGj9Z5WWperi_wfGO8VwWR4SedKb_UxmLuO7LT5PyJ-xkXckNUseceHLMI-0TB0Le5GtyVqzjghBtJbJn6MFKgKrsGQ2peyIVdCs0FjqLrf5nUIfu5O9OBt9L957rWISNiaTrWigMP8PfeITPWlT6wp1zbFvrcty7ihl3cJkbFYLInQF1BpbbpDQB0Wc9Jx-W66YHGKcoEG38ZMcrtEK0X12qo7v1bOK3Ik6rAf6zaOcMnafCYFLeOvffZH-ysX-GAfo6v1xpvZe_0LqEa5hhg-QxXSsPRN9MCurL7I3EeH3H8Jqt49kuk6XYWzVmbC1jH7hYO7XxjCBtKWVzAPyP_r_lcsUZ_kbTDEU1-MYR1rZBUQh1-uiPxqgXUYWB1sSwO1g2eUaEyoBAIZbL3cv8s-ywJKXusC65MrKttjuTp2IUCJAmyGurf-ZA5w4esxL5zVqHNylJMIogQuP06GiyohRiL88ikq2KO6mgSWTs3PUDsVkZXXsku-Sd76jn-1_Qvat926BfDAct-cJEHS0U8a4SIrE92xsP6pwk44NBn3sIvGyg5R2T1imTO0hkTmfGAfNhMkY2IPGzIlt81_7AuAlC7eLJN0e_sQOSgJq_sWtnqR8y-t2OnLG7LvQ7m4Fswopx_9JH4qhlezKDChQObpYkNokwJu8cARj-uAzNTzrvmQMhjdCxaqZ1WK_YSjEiUmzHMj0sph8VsVZ-8gMznxujWPZV5iL4Y5KLdqHxqgHZvf0ahNYK-kkxivhI3hMwtRMVdVbu_0pOZZj6Y7QOT8VaAvu0vMqJm5FJnOh78xfUt0N4V84fth3U71SG6pDoXKZl3NtnZFqE3ZdlpUg9toUMPNAR5-dvM5w4TgdRyOszpFZs3m9PwUN9dWlU27SPHWlXmJ3m_cy2gyyhfAc7wkLytxnbQVbntONfBGyRSI9Ao9usHRwPJ3VLrCF7rzDi25qwv-eCroDTJhLTS1I_DnPEWMyaHxi25UwnWj2zBalXbdEE-JgDmG6eEyik2mBadmn9SaszVlv3YVRHs5LxZ99O-r_AGE5EDAmrYo7jLPQaetWNJks-xShAjfReZmZKu8uytcpNztb_Xcp9ywVrdCo4i2flI906Qbb1v4d3-BhHEtrCeZItpouyDZK6EfDFmm0INwFV2ZV6iJileCfdc4MlYv45Y4-B8kAmGot7iK2n4Cp7voGSI-c8Ip28cfzV6iKRLEgE_7LM9b1sAJpdOm71BaMbS99TdBwQ4cgDiD9JZAptG2Wys1BYiOqZJDVCqQhYc-PZopq_560cfSj86Hf19p7QEfuZk3FawlxwyDjEhawAzQnBUu5nyA_Gn68paNHdNCabyVg6LqFCnHFfxz0zYEWP-yBpcsOc61R0tMqtM5Pkmv_BDCZRooHV0mehFTl-nyYSrFRJPv--8ptLYTM29qgdSbTo-5Kdam49PonQVEhkeshoxscu74MV57b5-I1k08yeJmw0Bw2fSjSl8zY1bj4CeoqS7NxRYH665iHORJUIiJMrQo5S-IXOlJz1fisXACtD0VhjOEIxfgDjGfKqfMY5V_fwv_xyGjkwelL2Ny1ZipBsUf2073kcHYJHbBvDlFZxHX3dtuapK0o-uui24K-NYsr8NmG9GcS4Gj37VxIkpNCo4aVA6TTPmSv_DUD1d1MBRIRmscdlHU32N9XobdpOMjdgEnyCJ4NO3ldB_iBL9CctumQ_nlVNZtkXjy9u4hV85kc_o_3enfiLNzl2JKfkgerOv4Jjql5Sw9dxH9T4ibisYDBTOnvyQnRzAmjUcVxjvK2aPYPtOp_zw0-mTNcBYRKxnTEaS_Bvhz-m0Zlr1260gW8G6OcaWycx0pKfWFQxpG9UZgPKnyI1nMaHqMl1fZ7dzB9SGWy2-3CaojBjhfBv0-Cz4390aqs2yB9DNSJGEbqOUrCFFI-QlvQY3gYIKZHSx-4YT5JYr6mMyOiZiCBVlgNalSGb-tJzgsNw0nLiBU2IwV-Hta2yeQg225zvE87fAl9SBXrtsshxGttZ2wvlJsPeYaM2v7O7SjPchbayG45pVptW9Gva8wnn2jQ8-3JFPYBwpxw_MUTqT6MxTdqgL6iqrfLHaTa6tHaFjZd6jhY_IUaSJKKGZ8zDmOje28_AZJfiuegRgP8HTBiY3jNYMeeaTUjFNSKmoDD5juLP7BZ8uFajcC2szZug6L5EixQnZcNAFxhTP-MNWbNkIvBXOFdOtLuLSJcWEg0FErj3rPQajm73dvKXnypzDMu12D9rtbrFe0fwdFJswps8PO8l_mtaRvKbmI4XnLLHpdfe6vVUXxQm9xkwnoBsUXcdDYxL2DmZlrLoxcy5JSfJzEEzB0xZIZIFDOSoZp-cuMAoO4I4il-Ows21KmRiuxn4m5ZU3GS0bQM9808yX-GIacZMJCGZqzkXNHC2AD-83vKOzuIzI13bCAPltBIJEh3lpgiGkB54-LpzV67dO9m9cvtMCrhV9WSIUGJZ-dX549aqBulHqMVTGmlNyjkOk3ojTjPsyNxzJ6chCfaE4Gxx-C1U0GGclnR8FLDONX1atePZcVl2Xq-QJhTKcqOZDYWW2MXjADFnp4y5PV8NCJ-hs47eyPQ_0XfnnURw-iTsOeW2UzmePfomawOYGsI7sWv-AVvj5HXe7dmUaWBfiYeB1h22g5eiABe-1hE1tiu-IjNeCWPIkwWD6HezlYg2AFqxR0vBGMQHAIgUqx57RalnPO9ID6C6YUKCeFaJicrxxPM3SURAKZdg6rZxrrG8_yFApXv4R6UfaEC-2eUcGGkhx57VFFcRslRCm9Eyk1i-ETDqOPDWvd2zSuweZ83orP8gBebPCX8V-PUZje-wqQegL1FxZIx8KbNM9tSeULYzImexu5eGzUN1uNWV2t4_ebEvmeDXPMx3DjsaKauy4HX7fWdGATt3B3T6BylxNC1xl8cMIbFfo3rTXMGzJa1-CL6hVgAjf3IKhLB2-HwR_BjNg2v4Hfnfrbe4ppwEyu7BcNbAGMgJpR0q9_G54PSLdxgEHxs39daqcbAR5Xm2ezYGvtZb1no3ongVEDjZhMDGhsDfUaPFLY5a8pJI2koYvpS4KQhBhuReFh52WjplyV15abHAa5GUPmmcXXkpHI-ucMF4sGzasAQ60_2SRLajXoXl23YgiXyfb4XOlj5tag99n0qSlAG11lL0nu8IGIMQqvLAqHlSGruBDzeqeTIM9EL2CtZlU9c36Yvi_WNBZR0AgKS_D8BIaZqxtu7xZxSplDTafOyjI_TJwC4MD3r8P5YtfMJroAQiw_vwK8ox1jaLkjfL4WMVo3_pn7Z8ydUz1njNwlxX-901tMMLOVfDPIQefD6VE_RZujYPDbtqCjhIht93rcpbpPjgT3BZxEKYHjoXzpq_R1gwDSfpZkJEdPAkS2pkicpHsGWpzrVASVLMYOf7dS68WkglP82heIhSGb3nwtAws344RlqrxoG7NELwRqDSb_diDTOhuJuSHPMDTxdx29LEhwN8wAzNncwiaP0Cf2HYTy-LnT95jb7yQEUVt1GiriCaYJqmdI5Lk5wJnEgYYUCiSpE7Uvdv0ZzfhQnhgy63X7KE4SloGqKBYC7eZQBf7Ra6YdrSYPXdkqjzyx2g1E7TlsNio_vXjljYuqsEBPsbjlA6R4mQJZRp9TODr0fY_QY8HDL-EQw9QXaVWSTpMQH79MUJGZn4EeuNTExyBui3H844gs2Fe-JETb3V8-P-QpM5gCX75cfoNQ85ljOrTgw-UJZXj6OpgvSorbAgGnwkjO7cVQP2-Tf70w4PqFmGOmYVOcrkEf-F7TZaFoi_ugu41HW7Vn5mAkCGY0sMYGbiUrvF-o8qMAjaECWiO38XUePKvicvCjUhc_sWPV9xRoyfmsLKJZv35tpBSET5iPdktXjCToWldwMv3cjJwogGp45RYlRbCRiPiLRv9iYcDmDt8W6aCprhuDf7zuF4a3OmF2NcpBmXxPGM9C3-LlUzdDodhxbVEn0zGzmnKvOZMZVZGt2FoHhQENRd_bhraxE_JhLY0GX5PbYybBIImPOUtvFn1aPPFjoJ-fkUuRw4vF6QBU-a1ppudk7-b99Yxj04ihl1DoGBVlIRVph1olz97VW1cySkfSa80Z9JxLobkBZA3g1Mzmts16ZZ4Nkbvf482fOqoWMWFlYoqTifZEMRVA2-EwE_4en-7EYqTMe80cGtgUorEBh3SGH8e5oOTvfh7Ow1M-Lrso3ifLvLwqaoccAG8pu4CwYkcofgFC_Kt18KT-l1GisVf1lvmrFunn4CwLf7aYfeiDdZRv7Js_K2W90dubFDNONAHXFp0kiRcUNoyp4-LKJgg5ZkDkr3tjbG0LI-nca8l2sJdzJCT2jThEouDC6NIFUjbA7VM0Wyina0DamC5-jU0O3LGp6oorw3h7P9ZKWINVMy83Ud4BSUnD6aJHckNACW-rtdUkMjYTLwt7r_EI_ypfPg0LoHlGjmUTJOSrdHHCQrYRZZN0QPrI4IvXOiHiMCy1feyq5la-fbi4Wwix34P_zond9hVIbuuOjKm50yiIfXVOuneQP7fGajSKodBWBd6OoOQ0bmVtvETF5t-x3t07zgJeLSZNuIyp0ndbHbN9HSy8T108cQUUafiCcZpRMjdKfA-cGvDbHyvbq-40pdkVvR445wVZybrOEDQFTiXIu6aWyLzWwQPNB4f8rhBcnbLmM_FtuvXg7YuiOvh2K0JVMESlx-dw91f0vOSxe40ljQDGX26_nl0W6f-Ohr2diFWbTUWpWsFSRYfHeEha-v2Jj0E8U_lczbELO0i454ufPAIsXgG4HVA8_pVnj6pzNfi-YAQ-ClzIGZIFPC3Go7pZ22vplqJPikBdUG8mhSZYCDo_WZq-_EYog2SieBhWyzkCkC3wtYDelA2h1HAJcXgVPVpBT0XBEWg41DRH7R-MPBCQ8d6w6M-X9UC_g7hJp48ErkcQULib-ugOZFtGkT-SOLVDFc7DXx0p85KMgctoVjbvQMbsYc2IO116xDOdXBF0mqJG5Uc3AZ7lBS1Ei5e7cEA0SJiq6crdL03tG1FCaW9ZCxBur-nqoSExMMuKWNzfFggsFZ3vn20upDmSX4efeF_B_mGn8lph2xsW0ltAODoG0mrk266rPqE_jw7HJk4RmH7knf-pBkbWYXdUOC_R9wHcwJKc3juN_mtizFQyXtR_LWW6wOaRe2cUc4mQL0PANUNgN024UtF06JLsL7kpeLBpyUmyXluACBvBJx3v8tIZXtQX4wr_R4tAwuYq50QK1TldKor-fRpgCrgYnrGXRGj-z0ztLS9gaR7xYgUJnFbIXl3ao14DFTpuhKnvaRuo_3URpSiS0KUjokugDZRzbRS1epfzs2J4Z1JBhPfOdY4Ti2uiHl3kUrHAwRa6XPXlm2Y0TUnDzJbAbZcrQSOfSJcyU6nIYO-pFJ3iyS3Jh6BDoMCE7Rs9YIH3qBzixZnv2R_Tg0Urtkb7n9mwNyy0RUJnVdbncjy4S4GWlqlhqnxxWPIKUvCvfAZrziS74BFprPfVKRe4BjenR0f9vr8aJqanNmWUhb06TG1je1jETibWoWiU9wXwxRq-Fshr46HsvnPaEvSAASc8sTBg_hgveh7mBiyDhRIRko5R_XQI8_eKVwbRj8mvNJdOf_Rx16tPYi6qLRXSSoOtDd8_iZHHrDpAkf7hN7uuCBV41wiEzgcKRVXeDs9QL0aGa1_RpyYQ1YQigZ4cxebR8L9sXvk6TJV8wW5F980ZFmefnRKCiztL47isw-_b_91nEb3Em7zwVOT8zR8dZyWvewdE-Y1bPclEjn_p51me1Uq0RcZRerx3dbAYguWBlGCCVeW3_rMPpGXBiYmqfvLp9x8hGp-8Ea-cWb0PpxCAI7wQM3acae6o8L0rTz-QZN8fsLvLkaRi9TOOxwh38IpuqpDozrEbcJmmALfRnusGv3uOpmOt_Rtv9a-T-NM0NSLIy8bucqE9DQuMuWuriQu9uwMmC_DixuekGl-i2p1h70tq7cG5OzvshmXEGulYnM1pYVXy6B7AOHTCJX3XLNvddw8YJ6l8p3F4abY9eVVN4ilPUve2YmZKCZOdlWkbI4AwjiIW06QYXJlCvFE6ZsCELCuar_UnELHzPxzyx9YzSnH6QhXfmvU0O7m-AzreRBGKOQFaSPBrBmxjyFaN-HDPnYR6rWQuKXZIk6yMKUJe12WeZZV_kUDV5dNXoArgXk7XizgAEClyg52_1T18VRWbMF0heVBJrkGrGFs53MkxVV9nwpFSBOKSGY-Cyzwmq9GBvnxiNPPih3fHwT5ZDHTXisuMZlK_H5my9BN9DXq31CciMFhKAO-zPwM23-ZV6q-m-AgLVHmbEpeCHEeQ0uwxBSOL0L9QemIzV0rQ75tKNzLoJ3FmR8aXhGyMvFp4nMEPlHus9qvePw1sPGD75qvuIOFe6h-JcAKi7iutDJVOrYEm2hkq9oxcjyFh0oDCNOaE1hBUFAjzGmZa9XyR-AjPlEn-IPA2GhZ13LUknHXPfInMItSobB_yDq4_pasNDrjtVZ5r7opUh5H5MKbnf-GLJxrNMuSfCAzWgk1MhN9_ErluKN-MOjVcIimXza3tII_5S6mfa-z5tJZ7bp8ocsxojzhmWDoHrpjgI_EGHIW1r-PJoURyu7NyY-qVKWKDYdca0-34dHBCfd1mznORn1nGdLHxF6ZSCNQA1tkGltn9M8qJYNlW9zMbe34B1cG_Cu4ZZTcufJgB2mchPvoqs574Iae7A9CW0uTAv6R4vGdgwTCYH8Ms-82Q1dYng01MCP65GETp-sMQBslD5SOGR1Pui92pCriCQJitXjHwGSr8zPrGVMSiBrgEZf4ng2znauxMQfoDMkoyNxr0Ib2iom6HPxXyA_jwCF2C8Llq8MLcdRji82EBRn5KV1b1KiBqW7tNObkF9VIQGONiLQxN5lhQ8UJCOk9GgApshSDA4l7_WBUVlKxYKh7GDyaaOxvLKYUl13lgoUVFL49Y6qm2kqZGiqJqxPKAivaAdL9FjvJ6iwKR5Bf_PrJ2TeZW27WxwLi_rIHi-XvdKqrki9NlbfFsQqbAvNq8qSSwoRewB0n0jyee47rEr-0TU6GLilHrRSncJd7cFfEMWu1ipyqjryCGWGOpUVC_uUE--c6sLYxbqDmBqyUr0fAx_AGnYuN4M0KVoUGeq_8OA4rEQ4b7Wf6EL_2uzafV0CeGhrJ0ULReyALqEg1xTbwGD-UNiYXLGwo88IANrzWNFShNPv8hnGeMnou2zgSVJ8IJC4VOoEzHB0Lb-RBwPBjtAz6nNTbf1n6bPk5pviWT6-UpaSySZ6h6cpuaxqe1xHRrF8thpwplG4fitaAL5-XamMSRXkIrnOJgZRf7yhsaRj-gmXx1UN7K6qRCayTFhfWuy6MeBuxLNUuy2ciyWXnbAQvyDfMnsbJA6G3wwCevHDe6-PKhqxw5oxwTC-bgLCp9Q1JxrRwrzZ3sQt4uKWb4eoQVglGYMyaWQmorORR6cx8DbZNz4kp4a18cXUsgT1pkU2d2h3C_mThMcpvcJKvffEYiyGH9LW-0U9-7et6q6Xld5WUO3srVbwt1z2-xxhsHdvP_J16aj5F3swyE6Z5BfqsBSCRGd2yU6Gr-_OvDq-qZ2vVPd497TuzdLhEPedQPP5SZG3NLrC-iY7vWftM_4fWUtTWRaTt1r2omiTgDjuHbLarzDoCSt1aomAboPaadP-R8HFfXM3f2C4z0ZNLxhmFkbodhb8NXI7ignVf_MgqE7C34CkkkhcDftHSFX91AgeEqNy6YC_POoAfAO1Pe7OwlZl8uMoeAdHD8hcj6nnVJvg5CsnuyjgIfWll8Xj8jL8a3VOZ58wJNPY4KBA47N9fQ9e8vDKHHZx_LD7fcL2ahx2XwHjF3GtJbB-VC1v_LRPiPEzrMKviCA2bFJcluqeb81yOP73U9nRgmXpmMh7v5L7lId4hg3XE98ZU5NV0ctnG3dOnpYYa1oyeHO3PaJWtnGubd_Nvj_TYlGNB4HfZsigOVIWiZEedajOUAoaV3dSaqzjain9oXfqZNtKQhznhTi7EfiHfAeo6XdEu9sQH2z5hNbAAwAOy8eCdlYbFX9OewTzZypyZEzMZs041-7HoiUNUskf3PwmfQTjsB4HfLNcrHTm7MDtGUULQGH_WnDK4tTOMFkN5iWc2tLnVBnRI_CysT700hmK1TM9qe8Dmrfcaeu-nbhCKbdNlJbESzACKEbeg7Yd3T5QphmJtjTX4NRAh8UCirMpHNvlFAwJQjtMqQ_3PeLC434-1fGvf-ygOp921YFE3u-FL4g0U_AWdqVf3p74g4xq60ks7yUXHSo9KDrMnx0586k_ryCj4MYypUfFkYu_wsQvDHCudvVkrzdCzwz3SVLYSSIK8_gRTpCSgQCYWRNpf3x6GKvYD8KXVKzLk17MyaoLbrdytUhRkuztJiHdHavcG9kCjlJKUxRM4pFLmaA9JoU22kzLSDvk5MQ-6Rq8QhyfdTfI5-kO9ptyiEk_6RR-3iZp_fv2xjihXwLNz52Rwv-TPYcrz2qJcHv_D45wyoRTxsKQwoiWqckkVVRuGMNE9FUHiIau0yd9Uy484sY0mFbo9vKWRgZoW2ihPlC5iuUMikgNcoTR2Uc0zY3VO8yyiFiBlSGYxBAIboxZY0NjKiflVnugfA1-bRypSXIOePyYiiBcn2EwfKxWm2PAGrJBztKtAvGYWV4ME6ZDQ5Y_kwER4By0n4Ok2YpRRhM1PUsuIVY2PnDm9lvGtRYn0r3KVUy5mRow8JPHgclUzQasHwAMSVeeRMrRQoUC-Z6KJvhulTzJNkzpsiT7vqqN8JkwNBRag8plb5LI88GCqyuPVWjvgyhW_vqaQFHrq1Ss6SscfEzWPuxlOr0J9evLTNRMEnOCsbQqftQhDE468SkJ1c_YbTc7ktNt74Ozqb1982SpBhfArLtniPVUVDvk7tlXgqhHZyag8kik_mb7kGHz3A0nbzgH70tyj6pZd4eZZI_auBVHoxYwC9iXKMRD6eLJFNh5zJm0YpH7QAhn4B3f_QDglfoNIefPzEnLf8gC0i-EA4kF10FXul0ZjE_A0dq_kTGSRv6y5iRxfXF1UUQy_5hwLPX4hR5hKjMybdyKwfmkeh8ve5IOylldqmZ4nY0GUoIN8MRkVmKY6q0y69umNmIL-nCWbvT-a-y83q0YLIUNSE15aBX7vtLukHOK47ky3mt4xEinBjNBFN-2gV8Uw5s5aOCYKrXXEGFV2jsYBdkUMEQpyFFHkFxzJ6QOANIjR-2Jm99f7RB_4KFoGRiC3uzXvmEB1F8izwFrdZvqhOlyL45hqu8rb8vRwE1j3TgcSbF2Qi4nwf9jln_g4XVqNcyPrHkjyKFgVCSyhHJU9ta0P2K-29sjCey7-yOj8LN8kFEM2mcK09RNnGWccDMLy9vlksdtEMbwEr0oATY8b0a-Hum6sIm7jqosjSYFqS-CUhhKww6xItSIwFvr0HyaeP31ohK1Fsk76fxqHflnXKhGfGmR0sJJifNmiJ59AmI2ydlqvbqg7oh8bLCDrF6SH2qzRTWKPkrArqUGo3n986kJPzdYTSnlA5IAWFmX_Tj_Bv4OeukTIZQSsocFBynf-fc8y88yq1Srjcm-WY6ZURIjG3x8Nkja-EEZA5BS1Iz29SGKgFR19pxdM2FccUapX3BV70thdPFJ310FJ0dubZMnVZWZcbY_pRW7V3TEGNK0Xzq6lQ1_dWTLedPBPC68mUaxG15M1CocqG0IyqQFhwiqNHoqgLQVekmstno53kVOXjns4GtZ4dwbIkJiqocWXv1KPd_EgFKAJa4u0Qb-yNCG648u0mqqohyeVx2APCpcGFq5pNRsv9r80Z4cF6rwuI63o_ZjB8IGiTGSOPV3RH8Sz2fls4ygP667stCAXe1Ly2-16gith94R87ZRVtlpNf_ZAKRLCQDtr4dG3-gtXXmKGXTubrz52vL53DKJ3Z1KsNXKGX4Lsi8XC43j34ckGkYoBBVi0GTC17gGYZFXJUz8esZEWjtxTO48jOyA6pyvB-vgHVgY-SgQLpZS7b0eokFaOciv_4EvzTvU101UDjAkptK9rY9AlSTclryqJzr0YjriULjhE5bIpWNh_RG_C3JsiQ-xRxNnbHgPzJ9WXjsVB-QzmB6FrtjGnfABPfahcFk-a5RO6Qtu34DX1rvLQAxjbJHKohf7OxA1hXL1H_F8O_1sSsp8u_CcgOJNhg2nVO6QQgZHjVQXORNf9fWAaIj_PrPjQE75Ra_jM9Qr_oz8hpozcAzyeS41r9sLpeXCemAC_D5R140y2kfgoMMgJcD1J-wpTUNXR8-YMQxf9HWjcY0YnQNuN-umlCPwtf9ss34_jwCHf3AQDNC5iBHXZMkXHuWWWfs18ExiirhSSwdrbHWmdI1SRDyLc0tJLIs7CwmrgY1XU9uMiQ6KgT4TUtT-Ns9r6FarpfkUNK-ediUHWjtwl4cSWZTOp50kytZel5Yg0tM6kKCgqS4HTymmi9qW-4e0A_Pr6_PI9vSB-H2v7ESpb4mHOlqqEJeG6eOAwQEoesuFZ__7IQihLoF63bxl8a8XClCsPYEfhF-xRlyPXVfMN1B2mVYCpqsZWzr5dpAVIQrz54pxO2r5Db0w4SDxinlyp2TF4hNqhFbnkEh8cUdxIaxAMimjGB6fCP2pAMnSPH4nhqMVc3HrCHZgCrjzPsENpr0DvfNDSeEL2hVDmv6Ro_Gu8amGb-eaP-HV39eRT_-xxDsfpHtmLy18Vr9zINWjspquoWi2NsAL-GbclzgUfTCMSN96d--Ai_aagFSxTmxrVwVHBpTK0szUXBUiEuCDJQFoJ4Of1yZMgjoWXbz9_lM_X6GRXvZmrBid75nJhoVd23Z7B53ZJGEMv4UZzfBzPBiPJK9wYFXYQBb6q4Dni3r3CvX4-U1x6ZzqoB4tatiGEH1hj1s4r5bISZ3aZWFwS2E9pfZH-FO-bcUW4CPHQsEKh3Bq10T0ckmYO5Nx5Ggvfq1Ybd8DynbgJeqJ9QFP1k_2aAlwpqbFhIRAm9K1Jo5UpL2jv9bf31XnvzAaudBR7ujRy9IElsOPR_oqP9z2cVL_9eBsbgYcPS2NQ4AomQ941FX5p3Xwi2sfunAcQfFRNDP1rxK2hsyi_6Z4Q6RyCCwaVOaIhC1egUSHKKamiid7At0z2hw6NN7LqtK6guWNkR0llK8NyljXjAXhMPxe8UAugxATzBQvr-kcoHSLvUs_aRAGKExoBvuiVbgoPQnm14vuqqptajlnyuAq3n_nJyjPMgyveSFZqGoe92xbuNOoOdR1N6KCa5WQg7zRok51YmWC6MOzYC6A9kV76-ReVziZ4ha2parCKGCevh-hOhp8yxqqXkQM-98aOLT10MxbCRNIVYNI_6IErNnFidzl5m-Oqfky2UA9EvUy2tF9qM73YriDqqST_-_BnjJGyjBasYCsIOnp_HY-uwG-Ju5h0Uc3JtBBxdmiayGCie1KpUxMhBBz44fMQg8BYKz_UQU9xRyzH0TBMdjljlhFlRRfqC_tNDWUnEfwzwLDZYQ4xaiiE6liA47LuWSvQl4V7G1SELYD4P0r5-mRmByDLaCRuRb1MbxuBYm9XRfFnwL90Sr0vZ9kkafnhWdjNCXvsqNCDQWtvCPrtubCNH8dc2Uo-1U1Kh8FqP8x-TyNf6EnLA-VM6pEijKYNH-tuECpyggYdidKhrFucMFbvnfh_2rteH6VDYQ-wybYJXQwCpPZLpguLMHnTPcNW9sFMcksoD3kDtK4uRLJvhyKsDYk1vVVetlWn4R3kMdFn0mav2EnDgPWHnTqTua0Dk6607S-WL3Tqksp_Pr5qYfniTQ1i9kxAD2p72WW8V0cG-8VNbV1LGbyaqkJjzomVik78mTw3kZfvBawPFaA45zgiwGRNpY5kG2F6LGzmnd4GApdwZbq_REEtm4Y5KZEuKpjQo5jzLbIS-UxN-7f9rCDFrR2en15WgPikH9ASLav2cWDLF6psE94QOBUoYexybvIGmkxkWYkI31SLU5hIGdkid4xEkKA-cIiAIQUV2UtfnpZoYYiyEfV4Vxo0KB8m-Qb-K4hNE7MGdeN9KNNNOcXiisjOKF8OsIhJsC3csl0Ru7Tt4CCdXL32JcKDmA56z0SDNAZCalFrr1KDwXC1LwwlMn-tTcItjOOW1lL4-Ox2daT0zvqOBdpoZMqF_ptDNNBWYLZddZESg8A_xnahKHrl-w45Jmqw2MdHH8zKEKtL_ufzOdYGh1I5lYbjqycQ9do1rhgb93TgPG0tk9IOHd9wac75gVX7aH-_9vNs4z-81kkmdXy4BngqaJ6633WIGgOY0ZqlzQo349rf02D1hMWMShdQE1TUWVoSOIUEluPy92CauWjctOqxCuw2RoxqRbzrB23OsudxR1DD2SHGz4pmrNoJpB7xDKseh1a3sfMyEZ-uTjQLcdGE_htwvbOmw=="}
     * phrs : {"phrs":[{"phr":{"headword":{"l":{"i":"account of"}},"source":"","trs":[{"tr":{"l":{"i":"在某人帐上重视，\t记帐"}}}]}},{"phr":{"headword":{"l":{"i":"account for"}},"source":"","trs":[{"tr":{"l":{"i":"对\u2026负有责任；对\u2026做出解释；说明\u2026\u2026的原因"}}}]}},{"phr":{"headword":{"l":{"i":"your account"}},"source":"","trs":[{"tr":{"l":{"i":"您的帐号"}}}]}},{"phr":{"headword":{"l":{"i":"take into account"}},"source":"","trs":[{"tr":{"l":{"i":"考虑；重视；体谅"}}}]}},{"phr":{"headword":{"l":{"i":"on account"}},"source":"","trs":[{"tr":{"l":{"i":"记帐，赊帐；分期付款"}}}]}},{"phr":{"headword":{"l":{"i":"on account of"}},"source":"","trs":[{"tr":{"l":{"i":"由于；因为；为了\u2026的缘故"}}}]}},{"phr":{"headword":{"l":{"i":"bank account"}},"source":"","trs":[{"tr":{"l":{"i":"银行存款；银行往来帐户"}}}]}},{"phr":{"headword":{"l":{"i":"be taken into account"}},"source":"","trs":[{"tr":{"l":{"i":"[俚]被考虑"}}}]}},{"phr":{"headword":{"l":{"i":"current account"}},"source":"","trs":[{"tr":{"l":{"i":"经常帐；活期存款帐户"}}}]}},{"phr":{"headword":{"l":{"i":"account number"}},"source":"","trs":[{"tr":{"l":{"i":"帐号"}}}]}},{"phr":{"headword":{"l":{"i":"of account"}},"source":"","trs":[{"tr":{"l":{"i":"重要的；有价值的"}}}]}},{"phr":{"headword":{"l":{"i":"savings account"}},"source":"","trs":[{"tr":{"l":{"i":"储蓄帐户"}}}]}},{"phr":{"headword":{"l":{"i":"no account"}},"source":"","trs":[{"tr":{"l":{"i":"没用的；无交易；未交帐户；无会计科目"}}}]}},{"phr":{"headword":{"l":{"i":"account management"}},"source":"","trs":[{"tr":{"l":{"i":"账户管理"}}}]}},{"phr":{"headword":{"l":{"i":"capital account"}},"source":"","trs":[{"tr":{"l":{"i":"资本性帐户；固定资产帐户"}}}]}},{"phr":{"headword":{"l":{"i":"open an account"}},"source":"","trs":[{"tr":{"l":{"i":"开立帐户"}}}]}},{"phr":{"headword":{"l":{"i":"take account of"}},"source":"","trs":[{"tr":{"l":{"i":"考虑到；顾及；体谅"}}}]}},{"phr":{"headword":{"l":{"i":"deposit account"}},"source":"","trs":[{"tr":{"l":{"i":"存款帐户；储蓄存款"}}}]}},{"phr":{"headword":{"l":{"i":"new account"}},"source":"","trs":[{"tr":{"l":{"i":"新帐户；新开帐户"}}}]}},{"phr":{"headword":{"l":{"i":"checking account"}},"source":"","trs":[{"tr":{"l":{"i":"活期存款；支票户头；活期存款户头"}}}]}}],"word":"account"}
     * rel_word : {"rels":[{"rel":{"pos":"adj.","words":[{"tran":" 有责任的；有解释义务的；可解释的","word":"accountable"}]}},{"rel":{"pos":"n.","words":[{"tran":" 会计，会计学；帐单","word":"accounting"}]}},{"rel":{"pos":"v.","words":[{"tran":" 解释（account的ing形式）；叙述","word":"accounting"}]}}],"stem":"account","word":"account"}
     * simple : {"query":"account","word":[{"return-phrase":"account","ukphone":"ə'kaʊnt","ukspeech":"account&type=1","usphone":"ə'kaʊnt","usspeech":"account&type=2"}]}
     * special : {"co-add":"http://www.inoteexpress.com","entries":[{"entry":{"major":"经济学","num":4,"trs":[{"tr":{"chnSent":"2006年,美国经常<b>账户<\/b>的逆差占GDP的6.2%,这是史无前例的。","cite":"688","docTitle":"论美国经常账户逆差的成因及不可持续性 （研究生论文）","engSent":"In 2006, the US current <b>account<\/b> deficit amounts to unprecedented 6.2% of its GDP.","nat":"账户","url":"http://www.591-lw.com/article.php?r_id=148017"}},{"tr":{"chnSent":"近几年来,随着江汉油田快速发展,经济规模不断扩大,<b>应收账款<\/b>逐年增多。","cite":"169","docTitle":"浅议应收账款管理 ","engSent":"in recent years,Jianghan Oilfield has made a rapid headway and constantly expanded its economic scale. Its <b>account<\/b> receivable,however,is growing year after year.","nat":"应收账款","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CJFQ&dbname=CJFDLAST2010&filename=jszd201001025"}},{"tr":{"chnSent":"而目前这些巨大的森林环境服务效益在国民<b>经济核算<\/b>中未予考虑,需要采取适当的措施将这些外部效益内部化。","cite":"19","docTitle":"北京山区森林资源价值评价 ","engSent":"However, the benefit of these environmental services is not considered in the system of national economic <b>account<\/b>. The appropriated measures should be taken to internalize these external benefits.","nat":"经济核算","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CDFD&dbname=CDFD2005&filename=2005085003.nh"}},{"tr":{"cite":"0","nat":"帐户"}}]}},{"entry":{"major":"计算机科学技术","num":6,"trs":[{"tr":{"chnSent":"构建了基于远程访问拨号接入用户服务（RADIUS）的认证、授权和<b>计费<\/b>系统。","cite":"157","docTitle":"期刊学术社区","engSent":"A remote access dial in user service(RADIUS) authentication,authorization and <b>account<\/b> system is constructed.","nat":"计费","url":"http://www.magsci.org/SearchArticle?flag=showaticle&id=6975451"}},{"tr":{"chnSent":"宽带接入过程中容易出现<b>账号<\/b>密码被盗用的现象，因而需要使用接入认证技术。","cite":"39","docTitle":"宽带接入中的认证技术分析\u2014《电脑知识与技术》\u20142007年第18期\u2014龙源期刊网","engSent":"s：It is apt to present the phenomenon that the <b>account<\/b> number password is usurped in the course of broadband access, therefore need to use and inserting authentication technology.","nat":"账号","url":"http://cn.qikan.com/Article/zsjs/zsjs200718/zsjs20071833.html"}},{"tr":{"cite":"0","nat":"帐户"}},{"tr":{"cite":"0","nat":"科目"}},{"tr":{"cite":"0","nat":"会计"}},{"tr":{"cite":"0","nat":"帐款"}}]}},{"entry":{"major":"体育","num":1,"trs":[{"tr":{"cite":"0","nat":"(在比赛中)击败；击出场(for)"}}]}},{"entry":{"major":"数学","num":1,"trs":[{"tr":{"cite":"6","docTitle":"\u201c5+3\u201d工程项目管理模式 ","nat":"计算","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CMFD&dbname=CMFD2009&filename=2008186124.nh"}}]}},{"entry":{"major":"交通运输工程","num":1,"trs":[{"tr":{"cite":"0","nat":"帐目"}}]}}],"summary":{"sources":{"source":{"site":"NoteExpress","url":"http://www.inoteexpress.com"}},"text":"以上统计来源于2,447,534篇论文数据，部分数据来源于"},"total":"2,447,543"}
     * splongman : {"isGood":"true","wordList":[{"Entry":{"Head":[{"FREQ":["S1","W1"],"GRAM":["C"],"HOMNUM":["1"],"HWD":["account"],"HYPHENATION":["ac\u2027count"],"POS":["n"],"PronCodes":[{"PRON":["əˈkaʊnt"],"PRONKK":["əˋka u nt"]}],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}],"Sense":[{"DEF":["a written or spoken description that says what happens in an event or process"],"EXAMPLE":["Chomsky\u2019s account of how children learn their first language"],"EXAMPLETRAN":["乔姆斯基关于儿童如何学习第一语言的描述"],"SIGNPOST":["description"],"SIGNTRAN":["描述"],"TRAN":["叙述，描写，报道"]},{"DEF":["an arrangement in which a bank keeps your money safe so that you can pay more in or take money out"],"EXAMPLE":["My salary is paid into my bank account.","I\u2019ve <i>opened an account<\/i> with Barclay\u2019s Bank.","My husband and I have a <i>joint account<\/i> (= <em> one that is shared between two people <\/em> ) ."],"EXAMPLETRAN":["我的工资直接存入我的银行账户。","我在巴克莱银行开了一个账户。","我和丈夫有个联名账户。"],"SIGNPOST":["at a bank"],"SIGNTRAN":["在银行"],"TRAN":["账户"],"Variant":[{"ABBR":["a/c","acct."],"LINKWORD":["written abbreviation <i>书面缩写为<\/i>","or"]}]},{"DEF":["to consider or include particular facts or details when making a decision or judgment about something"],"EXAMPLE":["These figures do not take account of changes in the rate of inflation."],"EXAMPLETRAN":["这些数字没有把通货膨胀率的变化考虑进去。"],"LEXUNIT":["take account of sth"],"TRAN":["考虑到某事，把某事考虑进去"],"Variant":[{"LEXVAR":["take sth into account"],"LINKWORD":["also <i>又作<\/i>"]}]}]}},{"Entry":{"Head":[{"FREQ":["S3","W2"],"HOMNUM":["2"],"HWD":["account"],"HYPHENATION":["account"],"POS":["v"],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}]}}]}
     * syno : {"synos":[{"syno":{"pos":"n.","tran":"[会计]帐户；解释；帐目，帐单；理由","ws":[{"w":"interpretation"},{"w":"explanation"},{"w":"construction"},{"w":"sake"},{"w":"reason"}]}},{"syno":{"pos":"vi.","tran":"解释；导致；报帐","ws":[{"w":"result in"},{"w":"to interpret"}]}},{"syno":{"pos":"vt.","tran":"认为；把\u2026视为","ws":[{"w":"count"},{"w":"find"},{"w":"guess"},{"w":"feel"},{"w":"rate"}]}}],"word":"account"}
     * web_trans : {"web-translation":[{"@same":"true","key":"Account","key-speech":"Account","trans":[{"summary":{"line":["...本次博彩之神争霸(Hegemony)战将分为两个阶段(Stage)：资格赛阶段和决赛阶段。玩家在大发随意四个产物之一具有备案<b>账户<\/b>(<b>Account<\/b>)即有资历参预资格赛(Qualifi.."]},"support":1037,"url":"","value":"账户"},{"summary":{"line":["然则我进 <b>账目<\/b> ( Accounts )里看，这一注的结算(Clearing)是赢，用关心和珍惜来代替「谢谢与「对不起，多珍惜别人对我们的好。"]},"support":792,"url":"","value":"账目"},{"cls":{"cl":["会计"]},"summary":{"line":["各种各样的 ... accordingly ad.因此,所以;照着 <b>account<\/b> n.记述;解释;<b>帐目 <\/b>accountant n. 会计,会计师 ..."]},"support":675,"url":"","value":"帐目"},{"cls":{"cl":["会计"]},"summary":{"line":["凤凰城安逸谷 ... 帐户 Ledger <b>会计科目 <\/b><b>Account<\/b> 会计分录 Journal entry ..."]},"support":500,"url":"","value":"会计科目"}]},{"key":"account for","key-speech":"account+for","trans":[{"value":"说明"},{"value":"解释"},{"value":"占"},{"value":"报账"}]},{"key":"account sales","key-speech":"account+sales","trans":[{"value":"销货帐"},{"cls":{"cl":["会计"]},"value":"承销清单"},{"value":"销货"},{"cls":{"cl":["贸易"]},"value":"售货清单"}]},{"key":"account title","key-speech":"account+title","trans":[{"cls":{"cl":["会计"]},"value":"会计科目"},{"cls":{"cl":["会计"]},"value":"帐户名称"},{"value":"账户名称"},{"value":"收户名称"}]},{"key":"current account","key-speech":"current+account","trans":[{"value":"经常项目"},{"value":"现金帐户"},{"value":"经常收支"},{"value":"经常帐"}]},{"key":"margin account","key-speech":"margin+account","trans":[{"cls":{"cl":["金融"]},"value":"保证金帐户"},{"value":"保证金账户"},{"value":"孖展户口"},{"value":"融资帐户"}]},{"key":"account policies","key-speech":"account+policies","trans":[{"value":"记帐策略"},{"value":"记帐计谋"},{"value":"账户策略"},{"value":"账号封锁"}]},{"key":"general account","key-speech":"general+account","trans":[{"cls":{"cl":["会计"]},"value":"总帐"},{"value":"一般帐目"},{"value":"总分类账户"},{"value":"一般会计"}]},{"key":"personal account","key-speech":"personal+account","trans":[{"value":"个人账户"},{"value":"人名帐户"},{"value":"人账户"},{"value":"个人帐户"}]},{"key":"account book","key-speech":"account+book","trans":[{"cls":{"cl":["会计"]},"value":"帐簿"},{"value":"账本"},{"value":"帐本"},{"value":"帐册"}]}]}
     * webster : {"encryptedData":"VcKA3WTZEeIeiUjhssApF-Rw8is5r7T_8GW9fsFlNzo8-bWtmAC_OKhiQed5gVHcngAldduVR-6c4THgZnh5rVwJtM4RHPewiAuvihBSWptG_-Kl-41k6vkiEnukWIq3Le90K4Kq3h_E8p34siY5ZyZvANBIp8myJtmPga7ZOTVR_JnvbNlNmbmFPVvHd2Px_hUE52T0zfAsGXmBRn6ru73Jd6pfzShEPRYsVdGhtxwPlo2aBIc0kG2pS-n0w99Ttyx-yayHjEWJJShrhmAOALiRrVSWCYIwndGwzU3WJy1vSIfsIBHmg5Ey27LolGRFJ4GFtvUZRQFEE0LLs1n0ke_dIYBBAof99RwcTf5anbouhYSOUZoA3x-gFim0JfHjTV7JbtzPYECFAe0ccDBluJdRAKiHM8io65LHCZZrvggycn-re_MWp93bIfMPPZrraYQbnCCMaZQKrqA34u-D2Hh8HwUYsRtTPwooAvOSvYY_Ek3jx19pOAH3Yk8yRRHZjX0D8R5ArPh-TZ1qDeh4aHxqIeAlzslfDMcmIsuw5UqfZya6HzNLT_R5KuwgixCHmucfZ70qd564SmRHtuL3_qiZXCmLSw6rJpBcud_bV2elsO4e8gyjAxH9rL5Y-IL_e_meMvz0SVuZ3hdeM71UgQyNJuvNZ9PuprT0OLeAjbpqMjPhS6se-kJ0hQmjydXErnFBxzX-SqKkKrRSkIivBjX4_au8CjUeY2fib45yGsGhzjcr9R-IvIzXUAY02xrxNbIxbqx8Zkfljz4zu6CHU1Wb7hE9x9rXmNZ0o_llwh2HgA5tC8GqYBym-oB6OKKfT3hPdZ4Uvlnx02R2hD-ALeoPBgxjSK4SQFWUk-2FvgHQ7-1BG7QvUl2x9JIgjsPQXnaq0j7pqIFsJYRGgFcxYEFehUEQri_Cq3zMXAT5nK8UGo3sHq_zWCTlRhtkYaxzCXMeTs4zSYz3HFCNDtNBWUbca0aEwwOQMFpG2dT6tDYOsH4uFbi1feP9jBG8xrccGZ6pGfjgXcFm_pPow4RouYlb64GxxDeu4dzDyNrl4nTXQHd63OQ4VkizzX_iOKwis7DeeBHvXAVJpZSgEJcR2TZaEteA6tE4LJQva-3Rhc3EnT9mMYuVFEvV0anPVeltArxwUDxz0ktBEmpMG_-XU8VoubM4T4xpLGUDJe97JioDzgryvaT9TF7bmLBHCELmTC--JhVTsKhtiSQNpKOtEFEjKSBTZwju2Fk5xiZ9OL6y2bHO2n9BgKxIR-jauJHv7wqJoVOuY5-nOUk2nOvnBjDUqwds4EoBsj5ZRZsPZ8YZcfSbQ_szS6F7ApP5T2nY-vwDClr3LrZbTHJgRca_Kz1iFGHXwJ1hU0ERvZftx206eYkJowvjOmt8ckjuN8HgXEheD3kcuvWb3Aa0tAxPkfu0HAPAOcQDSq6ZQ4oYKFxXbBncKwoKd84lHEtkstLBT5OAfEsWVZCvNzen_BOi7CbDQV3yEojlL8ySwRPjjovyR23paciFvPMFcQsdkWjM0sSBMRthmR_6ozIyKNe8oBYA2YMUHjJdAhakrrWPa1EP7nl1F92ulvLZhe-n7SJpDewginOPu0zuwLqkG2H4b6UGKCfAGIM2lotZ--_cgHL_QCvJg3IuyKfrcwhAplhSvRXvWUhATI4VOiidkPEQdtZ_zlL4LE13skmhx4oO3x8uWC7Xj1eo-h4PJ1AsEtM1-lTq7uU2zWnNmrHjACl3jdoj5-UZcqekBMc3SFjFze2ov3g2oyloJKgBOh-Oeig3Z5ADIVrYOU2LJhvxdR4eo26YfbjsKrEJo7mdXtuSn5u323VSupB-r2tzdFdPVOJHcrtreHArd66054kwn5fLNhk05fSJEXKVB9gsM6iNxg320Cc2A7OV3MtU84fTQI_yH0X3DuSvzcmm_FdXZ3XFyYt0Tomnns3CI_JW3Tk5819u9dcKa81iHo4Alj0c-3nsp7XK14rL0tGBYukBW-muGgIw0QucChhhMjtcorECyTPYKiFkNi0cXtbtXtjqPknFm0PjKDm5G_BNOFBzW0e4muXDstJPTBj85J7wuQyj3o8JshV_1l32vsEeEZ_mESkKuVLZqPhF0H-ljtEKNdbg1NRW0O7tHenUv3zaiILIGt8jgnFJUsHYB1LomqTlb64Ai8ZQIoZP3RMb04D3L4rprTcAanqYi6S7kVn1-kgmPJ2EWuWzVDABBwBkt2nk6JqAAK0uI56ncI8bHblF5u_ZkPigPYVhiTuMpPLaZOYeRQPjREDDkNHUzoemfbeqc-uSJMN-lvC6MAcRkhgbtCRJqNlKqZKE6XJhXtnvKlutjCxK4Wf5zMMdEzh8gEVjZiK_k47ExQSlrh9EF8WcGtYtI-1mZqiHC_gQZkTEzqFK39C5vmuj4B6WvfKXOIsUIVlt1CBlb10SM7pVUHF4wfXJ0IPgT-XiYXZNUAT3akSP7MW5-0x2BTl-YNm9wbihFv4TbuavT7bODrb_5G5J3uR8alYoAel8h9PeYLam8jGA3uTef5MCzpnPKmb21Cm0JHIw5aJkw0SraDEzqhFPkp2HtOpOjSYf9xviE7iRUoEKjs6eHJwPA6HFIWvgmTjxBQG1bZ6uKT0ej6V0l2ZxxSiO4Hw9ZkzcmcpZzTuDGbBRQNyxIL1gF3LvGfr7M8MwZQeqbhXZ8qc-YGxivs0C15auvup2B4eBNVZUrj9YqHX9iNJ08HjuniDnGpCaRK_3hwzffzo5Wv9xkGJs-gjtY_mEIz2GqzqkR7BX7AW9U3KCtWwJzNjJJ00df0D6QOuhjqtBH49Vz5zIP1066RtsUNOVYnnlThoLIV_ChyIy-qIUR5Mh8Y18I05YRegchSIivJQXpmcgjoRK1pS8n8hjz85Hn8Z5GalSrZ9GU5bvjNFAgfz1xAy9W9wbfOPYPiT6GEoz2iKvEWk27XwCzNEiftZ7fytKzofIfmL4CpvKETomls0rYpcLOoY8R3dKXfEag-YjZgCrKfXisBzhObrbBglAE8Ud6vCHdmiqjS4gbtCMfa4B5UfDJo5mRiaja0uPpmUVUPxQyB_3Z195wdGaSxhnQ3zfxbJVb_ER7KcwmLf1hE_GyuZ1cN5sfsgkMUc1ZwjklUSsO1HPpExhedUZ6dEUwcZBKPGqSLID8_DiXLqREUPkLO-eLWOtttGx27cQNzC5B4vk37i-EY-pA8hxv5a72bhN4g4j87GNFCPNY74OpRl2MLO2cAj8MSrfwB6cKffwlX5U4t_Ys-OfQTVv9SsaDgu61pNBA-wwLl2P1fxzGcnl4u6nQgZ6cszpsky24K82xUKRJ0PaWjt-OxtyhbNadDr5NeKcy1yF-K4-TTI8Q5L96_yFtbvljCZSPfqJABpli2xNWRbiEywhJgbfoduMoc5rM8igHJm48YqQCJqGPagjj6L6sdpoJxcH2MQfkMLzYYv0fEpmoIuyQnochf7sLUeg5GlZQVmuqZZykZOnKn1NcTO4C0grsdPgPgnVsHj_Sr1rvTJ_LmLJD_9fBitwe6CE3UVJJS1M0_PMUcjyzmOz-IclayomOifxNAH9X4Ry4ChwoYBHu0sgBXeH0g6v7fZn2MYSRIrAwv_ijN68RNz3bOJLvR3QjHl3FKEwuN8wwFxQAu2IHAOPhFEMy9Ah1BG1FbkyVrJGAPnXnZTfWVYaTFechX1Q15z1KvLPbv1u_439dGFq6ez1M_Zt3FiIIo4X_nxmGnvfUXKUmRcyCW8q6JrI5NAJNknJOeUER38P_X1EsyEgUmMEoxKSmZYQlKkdbzwLatEHtD9VfUzb3SOR4TBMO1k0PXFg4BeRD71YCVy4UbNMTTXJmbrxJVPPZRbW7msgqWCfyru8CMCYKWhg8oRDzgGtAh13HFu08H_-HKi4mbCeykBVQlS3pKL7P5cAbtGTf4WSvoXWYMSeUuDWyiOO5UVJIvW4cU_My3w__aPH3A2r_q1GfFvk7_izbHZMxomDliq-wMXulbfKAHMVibJs1ZNvQx52gq_AKi5adn0vbLlTDswsgLEnhgH2xJdMBgDEporqskhTaw_9ANsxX0CpP9GojYS9H2zyD0IWI2cE_o61pE0pXmQJA8wHxXbabA0_hfoYETOZVXQaN6NFylYRYhfuCMwhOkyb7j7qxjA0EeiDuccfxlDB_YxkTNEcrRs9Wb7JcEeUcVpSZUDo1TcRGV6jngXGnbvxWbg4A9suNAJn_eaUABqXhiLe1rl8HhFUvTHUJ5qYKie4PqP4nRO_rCAaFfEWxf7CpL03gVeeBuIQJNRP8Nbin2TcqZdccmImwRVlJjz3A8N4qLqKW2YUHlCsmmAJ3iBOEM0AiOGRxRl4jCGCU6d4oGN2x31RxYTWc55iyVHpNyLIC53JMnaVMK-Zt-pl4IhS-mudmkgaeqM8D9G5g4FTpeyRl7I7nD2p-XoMa7czoUtfUx3yJOMuJnZNw80xq4Gp0KcuzgqKARB1lqG3Sday-7pSuLeX3jcBjCBQstHGRVUwFyOAOIW-WHd2W-qSeCS5rGOr2dF6ssr8cmT-bjY0MBOkCUpd6390Dou6ZAr4-0NaBFgsw3EvMfqmPSqRlB7Pj5uLFP-toRtMjRO55qNd7TNhOWKlAOWDDFejrCP5-7-XvE2Fqne6yv155KPBfdjXmrFsxU2MHKkL8AbHr4QB2Lxfwn0KYLaxOkIVZn8ua0xFQUPuKQZ1DkuYv6ChncnNg4QJzR2jck5ESYlO9KUGB4EBCFVAfSB22jJbhXkx96xw1vTk-QU3uYvgihXDc6NM8ovv0GetMbBc3_yYOHO-Z13whmWTt4oN__dtr9jDOpHfiCsgz8IbXgC1Kb87-fA0RSlORLbrQXTBW1uOXYOKL9fA7hd6JtrTRwTvAwts4aO-cA7XYhVI28USTihBh5FLtqhuUvm4ogMV4lWECqIP6SBbJx9avOZGntGQHFXS4Ueg7PBjPsZaNRb5wAN_y4kpLjAL4T6fSn7glinTH3z-9YGgwCYiyRiOqPCdIdkwPZZRxmeSfWWSA3LoN5UesS852j58mQDBhMDJ3YVM-pqN-JLpB6WNlkMSvd9N0DGdExLAovPMVv52a9XhHc6_Qn8LjgfayyuQJYhN9Bcm31JbDiNqR78lVIB1KMe0-p9SG51W87RuGSPNDAHonqtTjRE0UN2OCCM4TdNzC3fA-opHDoLxMw=="}
     * wikipedia_digest : {"source":{"name":"维基百科","url":"http://en.wikipedia.org/wiki/Account"},"summarys":[{"key":"Account","summary":"Account may refer to:Accounts is a British term for financial statements."}]}
     */

    private AuthSentsPartBean auth_sents_part;
    private BlngSentsPartBean blng_sents_part;
    private CollinsBean collins;
    private EcBean ec;
    private EeBean ee;
    private EtymBean etym;
    private ExamDictBean exam_dict;
    private String input;
    private String lang;
    private String le;
    private LongmanBean longman;
    private MediaSentsPartBean media_sents_part;
    private MetaBean meta;
    private OxfordBean oxford;
    private OxfordAdvanceBean oxfordAdvance;
    private PhrsBeanX phrs;
    private RelWordBean rel_word;
    private SimpleBean simple;
    private SpecialBean special;
    private SplongmanBean splongman;
    private SynoBeanX syno;
    private WebTransBean web_trans;
    private WebsterBean webster;
    private WikipediaDigestBean wikipedia_digest;

    public AuthSentsPartBean getAuth_sents_part() {
        return auth_sents_part;
    }

    public void setAuth_sents_part(AuthSentsPartBean auth_sents_part) {
        this.auth_sents_part = auth_sents_part;
    }

    public BlngSentsPartBean getBlng_sents_part() {
        return blng_sents_part;
    }

    public void setBlng_sents_part(BlngSentsPartBean blng_sents_part) {
        this.blng_sents_part = blng_sents_part;
    }

    public CollinsBean getCollins() {
        return collins;
    }

    public void setCollins(CollinsBean collins) {
        this.collins = collins;
    }

    public EcBean getEc() {
        return ec;
    }

    public void setEc(EcBean ec) {
        this.ec = ec;
    }

    public EeBean getEe() {
        return ee;
    }

    public void setEe(EeBean ee) {
        this.ee = ee;
    }

    public EtymBean getEtym() {
        return etym;
    }

    public void setEtym(EtymBean etym) {
        this.etym = etym;
    }

    public ExamDictBean getExam_dict() {
        return exam_dict;
    }

    public void setExam_dict(ExamDictBean exam_dict) {
        this.exam_dict = exam_dict;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getLe() {
        return le;
    }

    public void setLe(String le) {
        this.le = le;
    }

    public LongmanBean getLongman() {
        return longman;
    }

    public void setLongman(LongmanBean longman) {
        this.longman = longman;
    }

    public MediaSentsPartBean getMedia_sents_part() {
        return media_sents_part;
    }

    public void setMedia_sents_part(MediaSentsPartBean media_sents_part) {
        this.media_sents_part = media_sents_part;
    }

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public OxfordBean getOxford() {
        return oxford;
    }

    public void setOxford(OxfordBean oxford) {
        this.oxford = oxford;
    }

    public OxfordAdvanceBean getOxfordAdvance() {
        return oxfordAdvance;
    }

    public void setOxfordAdvance(OxfordAdvanceBean oxfordAdvance) {
        this.oxfordAdvance = oxfordAdvance;
    }

    public PhrsBeanX getPhrs() {
        return phrs;
    }

    public void setPhrs(PhrsBeanX phrs) {
        this.phrs = phrs;
    }

    public RelWordBean getRel_word() {
        return rel_word;
    }

    public void setRel_word(RelWordBean rel_word) {
        this.rel_word = rel_word;
    }

    public SimpleBean getSimple() {
        return simple;
    }

    public void setSimple(SimpleBean simple) {
        this.simple = simple;
    }

    public SpecialBean getSpecial() {
        return special;
    }

    public void setSpecial(SpecialBean special) {
        this.special = special;
    }

    public SplongmanBean getSplongman() {
        return splongman;
    }

    public void setSplongman(SplongmanBean splongman) {
        this.splongman = splongman;
    }

    public SynoBeanX getSyno() {
        return syno;
    }

    public void setSyno(SynoBeanX syno) {
        this.syno = syno;
    }

    public WebTransBean getWeb_trans() {
        return web_trans;
    }

    public void setWeb_trans(WebTransBean web_trans) {
        this.web_trans = web_trans;
    }

    public WebsterBean getWebster() {
        return webster;
    }

    public void setWebster(WebsterBean webster) {
        this.webster = webster;
    }

    public WikipediaDigestBean getWikipedia_digest() {
        return wikipedia_digest;
    }

    public void setWikipedia_digest(WikipediaDigestBean wikipedia_digest) {
        this.wikipedia_digest = wikipedia_digest;
    }

    public static class AuthSentsPartBean {
        /**
         * more : auth_sents
         * sent : [{"foreign":"This purchase will <b>account<\/b> for 39.5% of the outstanding shares of the brokerage following the issuance. ","score":0.9831430912017822,"source":"FORBES: <i>JP Morgan Sweetens Deal That Is Still Sour For Bear Investors<\/i>","speech":"This+purchase+will+account+for+39.5%25+of+the+outstanding+shares+of+the+brokerage+following+the+issuance.+","speech-size":"30kb","url":"http://www.forbes.com/2008/03/24/bear-stearns-jpmorgan-markets-equity-cx_po_0324markets06.html"},{"foreign":"Spouse heirs, of course, can still claim the <b>account<\/b> as their own and name new heirs. ","score":0.9831407070159912,"source":"FORBES: <i>IRA Tips and Traps<\/i>","speech":"Spouse+heirs%2C+of+course%2C+can+still+claim+the+account+as+their+own+and+name+new+heirs.+","speech-size":"25kb","url":"http://www.forbes.com/forbes/2001/0611/216.html"},{"foreign":"Best for having your frequent flier <b>account<\/b> balances within easy reach for spontaneous upgrades. ","score":0.9831383228302002,"source":"BBC: <i>Five best air travel apps<\/i>","speech":"Best+for+having+your+frequent+flier+account+balances+within+easy+reach+for+spontaneous+upgrades.+","speech-size":"28kb","url":"http://www.bbc.com/travel/story/20120619-five-best-air-travel-apps"}]
         * sentence-count : 6
         */

        private String more;
        @SerializedName("sentence-count")
        private int sentencecount;
        private List<SentBean> sent;

        public String getMore() {
            return more;
        }

        public void setMore(String more) {
            this.more = more;
        }

        public int getSentencecount() {
            return sentencecount;
        }

        public void setSentencecount(int sentencecount) {
            this.sentencecount = sentencecount;
        }

        public List<SentBean> getSent() {
            return sent;
        }

        public void setSent(List<SentBean> sent) {
            this.sent = sent;
        }

        public static class SentBean {
            /**
             * foreign : This purchase will <b>account</b> for 39.5% of the outstanding shares of the brokerage following the issuance.
             * score : 0.9831430912017822
             * source : FORBES: <i>JP Morgan Sweetens Deal That Is Still Sour For Bear Investors</i>
             * speech : This+purchase+will+account+for+39.5%25+of+the+outstanding+shares+of+the+brokerage+following+the+issuance.+
             * speech-size : 30kb
             * url : http://www.forbes.com/2008/03/24/bear-stearns-jpmorgan-markets-equity-cx_po_0324markets06.html
             */

            private String foreign;
            private double score;
            private String source;
            private String speech;
            @SerializedName("speech-size")
            private String speechsize;
            private String url;

            public String getForeign() {
                return foreign;
            }

            public void setForeign(String foreign) {
                this.foreign = foreign;
            }

            public double getScore() {
                return score;
            }

            public void setScore(double score) {
                this.score = score;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getSpeech() {
                return speech;
            }

            public void setSpeech(String speech) {
                this.speech = speech;
            }

            public String getSpeechsize() {
                return speechsize;
            }

            public void setSpeechsize(String speechsize) {
                this.speechsize = speechsize;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }

    public static class BlngSentsPartBean {
        /**
         * more : blng_sents
         * sentence-count : 6
         * sentence-pair : [{"aligned-words":{"src":{"chars":[{"@e":"4","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"12","@id":"1","@s":"5","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]},"q":[{"@e":"12","@s":"5"}]},{"@e":"32","@id":"2","@s":"13","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"2"}]}}]},"tran":{"chars":[{"@e":"2","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"5","@id":"1","@s":"3","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]}},{"@e":"9","@id":"2","@s":"5","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"2"}]}}]}},"sentence":"His account contradicted itself.","sentence-eng":"His <b>account<\/b> contradicted itself.","sentence-speech":"His+account+contradicted+itself.&le=eng","sentence-translation":"他的解释自相矛盾。","source":"《21世纪大英汉词典》","speech-size":"9kb","url":"http://《21世纪大英汉词典》/"},{"aligned-words":{"src":{"chars":[{"@e":"6","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"14","@id":"1","@s":"7","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]}},{"@e":"23","@id":"2","@s":"15","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"5"}]}},{"@e":"28","@id":"3","@s":"24","aligns":{"sc":[{"@id":"3"}],"tc":[{"@id":"2"}]}},{"@e":"32","@id":"4","@s":"29","aligns":{"sc":[{"@id":"4"}],"tc":[{"@id":"3"}]}},{"@e":"40","@id":"5","@s":"33","aligns":{"sc":[{"@id":"5"}],"tc":[{"@id":"4"}]},"q":[{"@e":"40","@s":"33"}]}]},"tran":{"chars":[{"@e":"3","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"5","@id":"1","@s":"3","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]}},{"@e":"6","@id":"2","@s":"5","aligns":{"sc":[{"@id":"3"}],"tc":[{"@id":"2"}]}},{"@e":"8","@id":"3","@s":"6","aligns":{"sc":[{"@id":"4"}],"tc":[{"@id":"3"}]}},{"@e":"11","@id":"4","@s":"9","aligns":{"sc":[{"@id":"5"}],"tc":[{"@id":"4"}]}},{"@e":"13","@id":"5","@s":"11","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"5"}]}}]}},"sentence":"These figures disagree with our account.","sentence-eng":"These figures disagree with our <b>account<\/b>.","sentence-speech":"These+figures+disagree+with+our+account.&le=eng","sentence-translation":"这些数字与我们的账单不符。","source":"《21世纪大英汉词典》","speech-size":"11kb","url":"http://《21世纪大英汉词典》/"},{"aligned-words":{"src":{"chars":[{"@e":"4","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"},{"@id":"3"}]}},{"@e":"9","@id":"1","@s":"5","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"2"}]}},{"@e":"17","@id":"2","@s":"10","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"8"}]},"q":[{"@e":"17","@s":"10"}]},{"@e":"20","@id":"3","@s":"18","aligns":{"sc":[{"@id":"3"}],"tc":[{"@id":"6"}]}},{"@e":"27","@id":"4","@s":"21","aligns":{"sc":[{"@id":"4"}],"tc":[{"@id":"7"}]}},{"@e":"46","@id":"6","@s":"42","aligns":{"sc":[{"@id":"6"}],"tc":[{"@id":"5"}]}}]},"tran":{"chars":[{"@e":"2","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"},{"@id":"3"}]}},{"@e":"4","@id":"2","@s":"2","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"2"}]}},{"@e":"6","@id":"3","@s":"5","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"},{"@id":"3"}]}},{"@e":"11","@id":"5","@s":"7","aligns":{"sc":[{"@id":"6"}],"tc":[{"@id":"5"}]}},{"@e":"12","@id":"6","@s":"11","aligns":{"sc":[{"@id":"3"}],"tc":[{"@id":"6"}]}},{"@e":"14","@id":"7","@s":"12","aligns":{"sc":[{"@id":"4"}],"tc":[{"@id":"7"}]}},{"@e":"16","@id":"8","@s":"14","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"8"}]}}]}},"sentence":"You must account to father what you have done.","sentence-eng":"You must <b>account<\/b> to father what you have done.","sentence-speech":"You+must+account+to+father+what+you+have+done.&le=eng","sentence-translation":"你必须把你的所作所为对父亲解释清楚。","source":"《21世纪大英汉词典》","speech-size":"13kb","url":"http://《21世纪大英汉词典》/"}]
         */

        private String more;
        @SerializedName("sentence-count")
        private int sentencecount;
        @SerializedName("sentence-pair")
        private List<SentencepairBean> sentencepair;

        public String getMore() {
            return more;
        }

        public void setMore(String more) {
            this.more = more;
        }

        public int getSentencecount() {
            return sentencecount;
        }

        public void setSentencecount(int sentencecount) {
            this.sentencecount = sentencecount;
        }

        public List<SentencepairBean> getSentencepair() {
            return sentencepair;
        }

        public void setSentencepair(List<SentencepairBean> sentencepair) {
            this.sentencepair = sentencepair;
        }

        public static class SentencepairBean {
            /**
             * aligned-words : {"src":{"chars":[{"@e":"4","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]},"q":[{"@e":"12","@s":"5"}]},{"@e":"12","@id":"1","@s":"5","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]},"q":[{"@e":"12","@s":"5"}]},{"@e":"32","@id":"2","@s":"13","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"2"}]}}]},"tran":{"chars":[{"@e":"2","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"5","@id":"1","@s":"3","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]}},{"@e":"9","@id":"2","@s":"5","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"2"}]}}]}}
             * sentence : His account contradicted itself.
             * sentence-eng : His <b>account</b> contradicted itself.
             * sentence-speech : His+account+contradicted+itself.&le=eng
             * sentence-translation : 他的解释自相矛盾。
             * source : 《21世纪大英汉词典》
             * speech-size : 9kb
             * url : http://《21世纪大英汉词典》/
             */

            @SerializedName("aligned-words")
            private AlignedwordsBean alignedwords;
            private String sentence;
            @SerializedName("sentence-eng")
            private String sentenceeng;
            @SerializedName("sentence-speech")
            private String sentencespeech;
            @SerializedName("sentence-translation")
            private String sentencetranslation;
            private String source;
            @SerializedName("speech-size")
            private String speechsize;
            private String url;

            public AlignedwordsBean getAlignedwords() {
                return alignedwords;
            }

            public void setAlignedwords(AlignedwordsBean alignedwords) {
                this.alignedwords = alignedwords;
            }

            public String getSentence() {
                return sentence;
            }

            public void setSentence(String sentence) {
                this.sentence = sentence;
            }

            public String getSentenceeng() {
                return sentenceeng;
            }

            public void setSentenceeng(String sentenceeng) {
                this.sentenceeng = sentenceeng;
            }

            public String getSentencespeech() {
                return sentencespeech;
            }

            public void setSentencespeech(String sentencespeech) {
                this.sentencespeech = sentencespeech;
            }

            public String getSentencetranslation() {
                return sentencetranslation;
            }

            public void setSentencetranslation(String sentencetranslation) {
                this.sentencetranslation = sentencetranslation;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getSpeechsize() {
                return speechsize;
            }

            public void setSpeechsize(String speechsize) {
                this.speechsize = speechsize;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public static class AlignedwordsBean {
                /**
                 * src : {"chars":[{"@e":"4","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]},"q":[{"@e":"12","@s":"5"}]},{"@e":"12","@id":"1","@s":"5","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]},"q":[{"@e":"12","@s":"5"}]},{"@e":"32","@id":"2","@s":"13","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"2"}]}}]}
                 * tran : {"chars":[{"@e":"2","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"5","@id":"1","@s":"3","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]}},{"@e":"9","@id":"2","@s":"5","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"2"}]}}]}
                 */

                private SrcBean src;
                private TranBean tran;

                public SrcBean getSrc() {
                    return src;
                }

                public void setSrc(SrcBean src) {
                    this.src = src;
                }

                public TranBean getTran() {
                    return tran;
                }

                public void setTran(TranBean tran) {
                    this.tran = tran;
                }

                public static class SrcBean {
                    private List<CharsBean> chars;

                    public List<CharsBean> getChars() {
                        return chars;
                    }

                    public void setChars(List<CharsBean> chars) {
                        this.chars = chars;
                    }

                    public static class CharsBean {
                        @SerializedName("@e")
                        private String _$E89; // FIXME check this code
                        @SerializedName("@id")
                        private String _$Id206; // FIXME check this code
                        @SerializedName("@s")
                        private String _$S238; // FIXME check this code
                        private AlignsBean aligns;
                        private List<QBean> q;

                        public String get_$E89() {
                            return _$E89;
                        }

                        public void set_$E89(String _$E89) {
                            this._$E89 = _$E89;
                        }

                        public String get_$Id206() {
                            return _$Id206;
                        }

                        public void set_$Id206(String _$Id206) {
                            this._$Id206 = _$Id206;
                        }

                        public String get_$S238() {
                            return _$S238;
                        }

                        public void set_$S238(String _$S238) {
                            this._$S238 = _$S238;
                        }

                        public AlignsBean getAligns() {
                            return aligns;
                        }

                        public void setAligns(AlignsBean aligns) {
                            this.aligns = aligns;
                        }

                        public List<QBean> getQ() {
                            return q;
                        }

                        public void setQ(List<QBean> q) {
                            this.q = q;
                        }

                        public static class AlignsBean {
                            private List<ScBean> sc;
                            private List<TcBean> tc;

                            public List<ScBean> getSc() {
                                return sc;
                            }

                            public void setSc(List<ScBean> sc) {
                                this.sc = sc;
                            }

                            public List<TcBean> getTc() {
                                return tc;
                            }

                            public void setTc(List<TcBean> tc) {
                                this.tc = tc;
                            }

                            public static class ScBean {
                                @SerializedName("@id")
                                private String _$Id128; // FIXME check this code

                                public String get_$Id128() {
                                    return _$Id128;
                                }

                                public void set_$Id128(String _$Id128) {
                                    this._$Id128 = _$Id128;
                                }
                            }

                            public static class TcBean {
                                @SerializedName("@id")
                                private String _$Id267; // FIXME check this code

                                public String get_$Id267() {
                                    return _$Id267;
                                }

                                public void set_$Id267(String _$Id267) {
                                    this._$Id267 = _$Id267;
                                }
                            }
                        }

                        public static class QBean {
                            @SerializedName("@e")
                            private String _$E13; // FIXME check this code
                            @SerializedName("@s")
                            private String _$S186; // FIXME check this code

                            public String get_$E13() {
                                return _$E13;
                            }

                            public void set_$E13(String _$E13) {
                                this._$E13 = _$E13;
                            }

                            public String get_$S186() {
                                return _$S186;
                            }

                            public void set_$S186(String _$S186) {
                                this._$S186 = _$S186;
                            }
                        }
                    }
                }

                public static class TranBean {
                    private List<CharsBeanX> chars;

                    public List<CharsBeanX> getChars() {
                        return chars;
                    }

                    public void setChars(List<CharsBeanX> chars) {
                        this.chars = chars;
                    }

                    public static class CharsBeanX {
                        @SerializedName("@e")
                        private String _$E288; // FIXME check this code
                        @SerializedName("@id")
                        private String _$Id201; // FIXME check this code
                        @SerializedName("@s")
                        private String _$S223; // FIXME check this code
                        private AlignsBeanX aligns;

                        public String get_$E288() {
                            return _$E288;
                        }

                        public void set_$E288(String _$E288) {
                            this._$E288 = _$E288;
                        }

                        public String get_$Id201() {
                            return _$Id201;
                        }

                        public void set_$Id201(String _$Id201) {
                            this._$Id201 = _$Id201;
                        }

                        public String get_$S223() {
                            return _$S223;
                        }

                        public void set_$S223(String _$S223) {
                            this._$S223 = _$S223;
                        }

                        public AlignsBeanX getAligns() {
                            return aligns;
                        }

                        public void setAligns(AlignsBeanX aligns) {
                            this.aligns = aligns;
                        }

                        public static class AlignsBeanX {
                            private List<ScBeanX> sc;
                            private List<TcBeanX> tc;

                            public List<ScBeanX> getSc() {
                                return sc;
                            }

                            public void setSc(List<ScBeanX> sc) {
                                this.sc = sc;
                            }

                            public List<TcBeanX> getTc() {
                                return tc;
                            }

                            public void setTc(List<TcBeanX> tc) {
                                this.tc = tc;
                            }

                            public static class ScBeanX {
                                @SerializedName("@id")
                                private String _$Id47; // FIXME check this code

                                public String get_$Id47() {
                                    return _$Id47;
                                }

                                public void set_$Id47(String _$Id47) {
                                    this._$Id47 = _$Id47;
                                }
                            }

                            public static class TcBeanX {
                                @SerializedName("@id")
                                private String _$Id281; // FIXME check this code

                                public String get_$Id281() {
                                    return _$Id281;
                                }

                                public void set_$Id281(String _$Id281) {
                                    this._$Id281 = _$Id281;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static class CollinsBean {
        private List<CollinsEntriesBean> collins_entries;

        public List<CollinsEntriesBean> getCollins_entries() {
            return collins_entries;
        }

        public void setCollins_entries(List<CollinsEntriesBean> collins_entries) {
            this.collins_entries = collins_entries;
        }

        public static class CollinsEntriesBean {
            /**
             * basic_entries : {"basic_entry":[{"cet":"CET4 TEM4","headword":"account","wordforms":{"wordform":[{"word":"accounting"},{"word":"accounted"},{"word":"accounts"}]}}]}
             * entries : {"entry":[{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"有些银行使开一个账户困难重重。","eng_sent":"Some banks make it difficult to open an account."}]},"pos_entry":{"pos":"N-COUNT","pos_tips":"可数名词"},"tran":"If you have an <b>account<\/b> with a bank or a similar organization, you have an arrangement to leave your money there and take some out when you need it. 账户"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"所有的三家网络代理公司都夸口说他们已赢得了大客户。","eng_sent":"All three Internet agencies boast they've won major accounts."}]},"pos_entry":{"pos":"N-COUNT","pos_tips":"可数名词"},"prof":"商业","tran":"In business, a regular customer of a company can be referred to as an <b>account<\/b>, especially when the customer is another company. 客户"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"他保存了详细的账目。","eng_sent":"He kept detailed accounts."}]},"pos_entry":{"pos":"N-COUNT","pos_tips":"可数名词"},"prof":"商业","tran":"<b>Accounts<\/b> are detailed records of all the money that a person or business receives and spends. 账目"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"他对那个决定命运的夜晚所发生的事情做了一个详细的报道。","eng_sent":"He gave a detailed account of what happened on the fateful night."}]},"pos_entry":{"pos":"N-COUNT","pos_tips":"可数名词"},"tran":"An <b>account<\/b> is a written or spoken report of something that has happened. 报道"}]},{"tran_entry":[{"seeAlsos":{"seeAlso":[{"seeword":"accounting"},{"seeword":"bank account"},{"seeword":"checking account"},{"seeword":"deposit account"}],"seealso":"see also"}}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"据说，他是一名优秀的教师。","eng_sent":"He is, by all accounts, a superb teacher."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you say that something is true <b>by all accounts<\/b> or <b>from all accounts<\/b>, you believe it is true because other people say so. 据说"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"这些无名的组织在国内或国际政治中都是无足轻重的。","eng_sent":"These obscure groups were of little account in either national or international politics."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"registr":"正式","tran":"If you say that something is <b>of no account<\/b> or <b>of little account<\/b>, you mean that it is very unimportant and is not worth considering. 无足轻重的"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"在对他的债务做最后的评估期间，他被命令先付这家公司50万美元。","eng_sent":"He was ordered to pay the company $500,000 on account pending a final assessment of his liability."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you buy or pay for something <b>on account<\/b>, you pay nothing or only part of the cost at first, and pay the rest later. 以赊账方式"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"那位总统由于嗓子疼拒绝亲自发表演讲。","eng_sent":"The president declined to deliver the speech himself, on account of a sore throat."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"You use <b>on account of<\/b> to introduce the reason or explanation for something. 由于"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"莫丽告诉了我她做过的事情，我真为她感到害怕。","eng_sent":"Mollie told me what she'd done and I was really scared on her account."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"Your feelings <b>on<\/b> someone's <b>account<\/b> are the feelings you have about what they have experienced or might experience, especially when you imagine yourself to be in their situation. 为 (某人的) 缘故 (而感到\u2026)"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"不要因为我而离开。","eng_sent":"Don't leave on my account."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"registr":"口语","tran":"If you tell someone not to do something <b>on<\/b> your <b>account<\/b>, you mean that they should do it only if they want to, and not because they think it will please you. (不) 为 (某人的) 缘故 (而做某事)"}]},{"tran_entry":[{"box_extra":"强调","exam_sents":{"sent":[{"chn_sent":"这种混合物绝对不应当接近沸点。","eng_sent":"On no account should the mixture come near boiling."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you say that something should <b>on no account<\/b> be done, you are emphasizing that it should not be done under any circumstances. 绝对不"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"我告诉他，如果他退出那么他要自负其则。","eng_sent":"I told him if he withdrew it was on his own account."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you do something <b>on<\/b> your <b>own account<\/b>, you do it because you want to and without being asked, and you take responsibility for your own action. 随 (某人) 自己"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"该被告请求将21项相似的犯罪罪行考虑在内。","eng_sent":"The defendant asked for 21 similar offences to be taken into account."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you <b>take<\/b> something <b>into account<\/b>, or <b>take account of<\/b> something, you consider it when you are thinking about a situation or deciding what to do. 考虑到"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"反复提供虚假情报的人应为其行为而受到追究。","eng_sent":"Individuals who repeatedly provide false information should be called to account for their actions."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If someone <b>is called, held,<\/b> or <b>brought to account<\/b> for something they have done wrong, they are made to explain why they did it, and are often criticized or punished for it. 追究"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"我们曾经为缺乏准备所阻，但我肯定我们会表现很好的。","eng_sent":"We have been hindered by our lack of preparation, but I'm sure we will give a good account of ourselves."}]},"loc":"英国英语","pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you say that someone <b>gave a good account of<\/b> themselves in a particular situation, you mean that they performed well, although they may not have been completely successful. 表现很好"}]}]}
             * headword : account
             * phonetic : əˈkaʊnt
             * star : 5
             */

            private BasicEntriesBean basic_entries;
            private EntriesBean entries;
            private String headword;
            private String phonetic;
            private String star;

            public BasicEntriesBean getBasic_entries() {
                return basic_entries;
            }

            public void setBasic_entries(BasicEntriesBean basic_entries) {
                this.basic_entries = basic_entries;
            }

            public EntriesBean getEntries() {
                return entries;
            }

            public void setEntries(EntriesBean entries) {
                this.entries = entries;
            }

            public String getHeadword() {
                return headword;
            }

            public void setHeadword(String headword) {
                this.headword = headword;
            }

            public String getPhonetic() {
                return phonetic;
            }

            public void setPhonetic(String phonetic) {
                this.phonetic = phonetic;
            }

            public String getStar() {
                return star;
            }

            public void setStar(String star) {
                this.star = star;
            }

            public static class BasicEntriesBean {
                private List<BasicEntryBean> basic_entry;

                public List<BasicEntryBean> getBasic_entry() {
                    return basic_entry;
                }

                public void setBasic_entry(List<BasicEntryBean> basic_entry) {
                    this.basic_entry = basic_entry;
                }

                public static class BasicEntryBean {
                    /**
                     * cet : CET4 TEM4
                     * headword : account
                     * wordforms : {"wordform":[{"word":"accounting"},{"word":"accounted"},{"word":"accounts"}]}
                     */

                    private String cet;
                    private String headword;
                    private WordformsBean wordforms;

                    public String getCet() {
                        return cet;
                    }

                    public void setCet(String cet) {
                        this.cet = cet;
                    }

                    public String getHeadword() {
                        return headword;
                    }

                    public void setHeadword(String headword) {
                        this.headword = headword;
                    }

                    public WordformsBean getWordforms() {
                        return wordforms;
                    }

                    public void setWordforms(WordformsBean wordforms) {
                        this.wordforms = wordforms;
                    }

                    public static class WordformsBean {
                        private List<WordformBean> wordform;

                        public List<WordformBean> getWordform() {
                            return wordform;
                        }

                        public void setWordform(List<WordformBean> wordform) {
                            this.wordform = wordform;
                        }

                        public static class WordformBean {
                            /**
                             * word : accounting
                             */

                            private String word;

                            public String getWord() {
                                return word;
                            }

                            public void setWord(String word) {
                                this.word = word;
                            }
                        }
                    }
                }
            }

            public static class EntriesBean {
                private List<EntryBean> entry;

                public List<EntryBean> getEntry() {
                    return entry;
                }

                public void setEntry(List<EntryBean> entry) {
                    this.entry = entry;
                }

                public static class EntryBean {
                    private List<TranEntryBean> tran_entry;

                    public List<TranEntryBean> getTran_entry() {
                        return tran_entry;
                    }

                    public void setTran_entry(List<TranEntryBean> tran_entry) {
                        this.tran_entry = tran_entry;
                    }

                    public static class TranEntryBean {
                        /**
                         * exam_sents : {"sent":[{"chn_sent":"有些银行使开一个账户困难重重。","eng_sent":"Some banks make it difficult to open an account."}]}
                         * pos_entry : {"pos":"N-COUNT","pos_tips":"可数名词"}
                         * tran : If you have an <b>account</b> with a bank or a similar organization, you have an arrangement to leave your money there and take some out when you need it. 账户
                         */

                        private ExamSentsBean exam_sents;
                        private PosEntryBean pos_entry;
                        private String tran;

                        public ExamSentsBean getExam_sents() {
                            return exam_sents;
                        }

                        public void setExam_sents(ExamSentsBean exam_sents) {
                            this.exam_sents = exam_sents;
                        }

                        public PosEntryBean getPos_entry() {
                            return pos_entry;
                        }

                        public void setPos_entry(PosEntryBean pos_entry) {
                            this.pos_entry = pos_entry;
                        }

                        public String getTran() {
                            return tran;
                        }

                        public void setTran(String tran) {
                            this.tran = tran;
                        }

                        public static class ExamSentsBean {
                            private List<SentBeanX> sent;

                            public List<SentBeanX> getSent() {
                                return sent;
                            }

                            public void setSent(List<SentBeanX> sent) {
                                this.sent = sent;
                            }

                            public static class SentBeanX {
                                /**
                                 * chn_sent : 有些银行使开一个账户困难重重。
                                 * eng_sent : Some banks make it difficult to open an account.
                                 */

                                private String chn_sent;
                                private String eng_sent;

                                public String getChn_sent() {
                                    return chn_sent;
                                }

                                public void setChn_sent(String chn_sent) {
                                    this.chn_sent = chn_sent;
                                }

                                public String getEng_sent() {
                                    return eng_sent;
                                }

                                public void setEng_sent(String eng_sent) {
                                    this.eng_sent = eng_sent;
                                }
                            }
                        }

                        public static class PosEntryBean {
                            /**
                             * pos : N-COUNT
                             * pos_tips : 可数名词
                             */

                            private String pos;
                            private String pos_tips;

                            public String getPos() {
                                return pos;
                            }

                            public void setPos(String pos) {
                                this.pos = pos;
                            }

                            public String getPos_tips() {
                                return pos_tips;
                            }

                            public void setPos_tips(String pos_tips) {
                                this.pos_tips = pos_tips;
                            }
                        }
                    }
                }
            }
        }
    }

    public static class EcBean {
        @Override
        public String toString() {
            return "EcBean{" +
                    "source=" + source +
                    ", exam_type=" + exam_type +
                    ", word=" + word +
                    '}';
        }

        /**
         * exam_type : ["TOEFL","高中","IELTS","CET6","CET4","商务英语","考研"]
         * source : {"name":"有道词典","url":"http://dict.youdao.com"}
         * word : [{"return-phrase":{"l":{"i":"account"}},"trs":[{"tr":[{"l":{"i":["n. 账户；解释；账目，账单；理由；描述"]}}]},{"tr":[{"l":{"i":["vi. 解释；导致；报账"]}}]},{"tr":[{"l":{"i":["vt. 认为；把\u2026视为"]}}]}],"ukphone":"ə'kaʊnt","ukspeech":"account&type=1","usphone":"ə'kaʊnt","usspeech":"account&type=2"}]
         */

        private SourceBean source;
        private List<String> exam_type;
        private List<WordBean> word;

        public SourceBean getSource() {
            return source;
        }

        public void setSource(SourceBean source) {
            this.source = source;
        }

        public List<String> getExam_type() {
            return exam_type;
        }

        public void setExam_type(List<String> exam_type) {
            this.exam_type = exam_type;
        }

        public List<WordBean> getWord() {
            return word;
        }

        public void setWord(List<WordBean> word) {
            this.word = word;
        }

        public static class SourceBean {
            /**
             * name : 有道词典
             * url : http://dict.youdao.com
             */

            private String name;
            private String url;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class WordBean {
            @Override
            public String toString() {
                return "WordBean{" +
                        "returnphrase=" + returnphrase +
                        ", ukphone='" + ukphone + '\'' +
                        ", ukspeech='" + ukspeech + '\'' +
                        ", usphone='" + usphone + '\'' +
                        ", usspeech='" + usspeech + '\'' +
                        ", trs=" + trs +
                        '}';
            }

            /**
             * return-phrase : {"l":{"i":"account"}}
             * trs : [{"tr":[{"l":{"i":["n. 账户；解释；账目，账单；理由；描述"]}}]},{"tr":[{"l":{"i":["vi. 解释；导致；报账"]}}]},{"tr":[{"l":{"i":["vt. 认为；把\u2026视为"]}}]}]
             * ukphone : ə'kaʊnt
             * ukspeech : account&type=1
             * usphone : ə'kaʊnt
             * usspeech : account&type=2
             */

            @SerializedName("return-phrase")
            private ReturnphraseBean returnphrase;
            private String ukphone;
            private String ukspeech;
            private String usphone;
            private String usspeech;
            private List<TrsBean> trs;

            public ReturnphraseBean getReturnphrase() {
                return returnphrase;
            }

            public void setReturnphrase(ReturnphraseBean returnphrase) {
                this.returnphrase = returnphrase;
            }

            public String getUkphone() {
                return ukphone;
            }

            public void setUkphone(String ukphone) {
                this.ukphone = ukphone;
            }

            public String getUkspeech() {
                return ukspeech;
            }

            public void setUkspeech(String ukspeech) {
                this.ukspeech = ukspeech;
            }

            public String getUsphone() {
                return usphone;
            }

            public void setUsphone(String usphone) {
                this.usphone = usphone;
            }

            public String getUsspeech() {
                return usspeech;
            }

            public void setUsspeech(String usspeech) {
                this.usspeech = usspeech;
            }

            public List<TrsBean> getTrs() {
                return trs;
            }

            public void setTrs(List<TrsBean> trs) {
                this.trs = trs;
            }

            public static class ReturnphraseBean {
                /**
                 * l : {"i":"account"}
                 */

                private LBean l;

                public LBean getL() {
                    return l;
                }

                public void setL(LBean l) {
                    this.l = l;
                }

                public static class LBean {
                    /**
                     * i : account
                     */

                    private String i;

                    public String getI() {
                        return i;
                    }

                    public void setI(String i) {
                        this.i = i;
                    }
                }
            }

            public static class TrsBean {
                @Override
                public String toString() {
                    return "TrsBean{" +
                            "tr=" + tr +
                            '}';
                }

                private List<TrBean> tr;

                public List<TrBean> getTr() {
                    return tr;
                }

                public void setTr(List<TrBean> tr) {
                    this.tr = tr;
                }

                public static class TrBean {
                    @Override
                    public String toString() {
                        return "TrBean{" +
                                "l=" + l +
                                '}';
                    }

                    /**
                     * l : {"i":["n. 账户；解释；账目，账单；理由；描述"]}
                     */

                    private LBeanX l;

                    public LBeanX getL() {
                        return l;
                    }

                    public void setL(LBeanX l) {
                        this.l = l;
                    }

                    public static class LBeanX {
                        private List<String> i;

                        public List<String> getI() {
                            return i;
                        }

                        public void setI(List<String> i) {
                            this.i = i;
                        }
                    }
                }
            }
        }
    }

    public static class EeBean {
        /**
         * source : {"name":"WordNet","url":"http://wordnet.princeton.edu"}
         * word : {"phone":"","return-phrase":{"l":{"i":"account"}},"speech":"account","trs":[{"pos":"n.","tr":[{"exam":{"i":{"f":{"l":[{"i":"he asked to see the executive who handled his account"}]}}},"l":{"i":"a formal contractual relationship established to provide for regular banking or brokerage or business services"},"similar-words":[{"similar":"business relationship"}]},{"exam":{"i":{"f":{"l":[{"i":"by all accounts they were a happy couple"}]}}},"l":{"i":"the act of informing by verbal report"},"similar-words":[{"similar":"report"}]},{"exam":{"i":{"f":{"l":[{"i":"he gave an inaccurate account of the plot to kill the president"}]}}},"l":{"i":"a record or narrative description of past events"},"similar-words":[{"similar":"history"},{"similar":"chronicle"},{"similar":"story"}]},{"exam":{"i":{"f":{"l":[{"i":"the account of his speech that was given on the evening news made the governor furious"}]}}},"l":{"i":"a short account of the news"},"similar-words":[{"similar":"report"},{"similar":"news report"},{"similar":"story"},{"similar":"write up"}]},{"exam":{"i":{"f":{"l":[{"i":"they send me an accounting every month"}]}}},"l":{"i":"a statement of recent transactions and the resulting balance"},"similar-words":[{"similar":"accounting"},{"similar":"account statement"}]},{"exam":{"i":{"f":{"l":[{"i":"I expected a brief account"}]}}},"l":{"i":"a statement that makes something comprehensible by describing the relevant structure or operation or circumstances etc."},"similar-words":[{"similar":"explanation"}]},{"exam":{"i":{"f":{"l":[{"i":"send me an account of what I owe"}]}}},"l":{"i":"an itemized statement of money owed for goods shipped or services rendered"},"similar-words":[{"similar":"bill"},{"similar":"invoice"}]},{"exam":{"i":{"f":{"l":[{"i":"don't do it on my account"},{"i":"the paper was rejected on account of its length"}]}}},"l":{"i":"grounds"},"similar-words":[{"similar":"score"}]},{"exam":{"i":{"f":{"l":[{"i":"a person of considerable account"},{"i":"he predicted that although it is of small account now it will rapidly increase in importance"}]}}},"l":{"i":"importance or value"}},{"exam":{"i":{"f":{"l":[{"i":"she turned her writing skills to good account"}]}}},"l":{"i":"the quality of taking advantage"}}]},{"pos":"v.","tr":[{"exam":{"i":{"f":{"l":[{"i":"Passing grades account for half of the grades given in this exam"}]}}},"l":{"i":"be the sole or primary factor in the existence, acquisition, supply, or disposal of something"}},{"l":{"i":"keep an account of"},"similar-words":[{"similar":"calculate"}]},{"l":{"i":"to give an account or representation of in words"},"similar-words":[{"similar":"report"},{"similar":"describe"}]},{"exam":{"i":{"f":{"l":[{"i":"I can't account for the missing money"}]}}},"l":{"i":"furnish a justifying analysis or explanation"},"similar-words":[{"similar":"answer for"}]}]}]}
         */

        private SourceBeanX source;
        private WordBeanX word;

        public SourceBeanX getSource() {
            return source;
        }

        public void setSource(SourceBeanX source) {
            this.source = source;
        }

        public WordBeanX getWord() {
            return word;
        }

        public void setWord(WordBeanX word) {
            this.word = word;
        }

        public static class SourceBeanX {
            /**
             * name : WordNet
             * url : http://wordnet.princeton.edu
             */

            private String name;
            private String url;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class WordBeanX {
            /**
             * phone :
             * return-phrase : {"l":{"i":"account"}}
             * speech : account
             * trs : [{"pos":"n.","tr":[{"exam":{"i":{"f":{"l":[{"i":"he asked to see the executive who handled his account"}]}}},"l":{"i":"a formal contractual relationship established to provide for regular banking or brokerage or business services"},"similar-words":[{"similar":"business relationship"}]},{"exam":{"i":{"f":{"l":[{"i":"by all accounts they were a happy couple"}]}}},"l":{"i":"the act of informing by verbal report"},"similar-words":[{"similar":"report"}]},{"exam":{"i":{"f":{"l":[{"i":"he gave an inaccurate account of the plot to kill the president"}]}}},"l":{"i":"a record or narrative description of past events"},"similar-words":[{"similar":"history"},{"similar":"chronicle"},{"similar":"story"}]},{"exam":{"i":{"f":{"l":[{"i":"the account of his speech that was given on the evening news made the governor furious"}]}}},"l":{"i":"a short account of the news"},"similar-words":[{"similar":"report"},{"similar":"news report"},{"similar":"story"},{"similar":"write up"}]},{"exam":{"i":{"f":{"l":[{"i":"they send me an accounting every month"}]}}},"l":{"i":"a statement of recent transactions and the resulting balance"},"similar-words":[{"similar":"accounting"},{"similar":"account statement"}]},{"exam":{"i":{"f":{"l":[{"i":"I expected a brief account"}]}}},"l":{"i":"a statement that makes something comprehensible by describing the relevant structure or operation or circumstances etc."},"similar-words":[{"similar":"explanation"}]},{"exam":{"i":{"f":{"l":[{"i":"send me an account of what I owe"}]}}},"l":{"i":"an itemized statement of money owed for goods shipped or services rendered"},"similar-words":[{"similar":"bill"},{"similar":"invoice"}]},{"exam":{"i":{"f":{"l":[{"i":"don't do it on my account"},{"i":"the paper was rejected on account of its length"}]}}},"l":{"i":"grounds"},"similar-words":[{"similar":"score"}]},{"exam":{"i":{"f":{"l":[{"i":"a person of considerable account"},{"i":"he predicted that although it is of small account now it will rapidly increase in importance"}]}}},"l":{"i":"importance or value"}},{"exam":{"i":{"f":{"l":[{"i":"she turned her writing skills to good account"}]}}},"l":{"i":"the quality of taking advantage"}}]},{"pos":"v.","tr":[{"exam":{"i":{"f":{"l":[{"i":"Passing grades account for half of the grades given in this exam"}]}}},"l":{"i":"be the sole or primary factor in the existence, acquisition, supply, or disposal of something"}},{"l":{"i":"keep an account of"},"similar-words":[{"similar":"calculate"}]},{"l":{"i":"to give an account or representation of in words"},"similar-words":[{"similar":"report"},{"similar":"describe"}]},{"exam":{"i":{"f":{"l":[{"i":"I can't account for the missing money"}]}}},"l":{"i":"furnish a justifying analysis or explanation"},"similar-words":[{"similar":"answer for"}]}]}]
             */

            private String phone;
            @SerializedName("return-phrase")
            private ReturnphraseBeanX returnphrase;
            private String speech;
            private List<TrsBeanX> trs;

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public ReturnphraseBeanX getReturnphrase() {
                return returnphrase;
            }

            public void setReturnphrase(ReturnphraseBeanX returnphrase) {
                this.returnphrase = returnphrase;
            }

            public String getSpeech() {
                return speech;
            }

            public void setSpeech(String speech) {
                this.speech = speech;
            }

            public List<TrsBeanX> getTrs() {
                return trs;
            }

            public void setTrs(List<TrsBeanX> trs) {
                this.trs = trs;
            }

            public static class ReturnphraseBeanX {
                /**
                 * l : {"i":"account"}
                 */

                private LBeanXX l;

                public LBeanXX getL() {
                    return l;
                }

                public void setL(LBeanXX l) {
                    this.l = l;
                }

                public static class LBeanXX {
                    /**
                     * i : account
                     */

                    private String i;

                    public String getI() {
                        return i;
                    }

                    public void setI(String i) {
                        this.i = i;
                    }
                }
            }

            public static class TrsBeanX {
                /**
                 * pos : n.
                 * tr : [{"exam":{"i":{"f":{"l":[{"i":"he asked to see the executive who handled his account"}]}}},"l":{"i":"a formal contractual relationship established to provide for regular banking or brokerage or business services"},"similar-words":[{"similar":"business relationship"}]},{"exam":{"i":{"f":{"l":[{"i":"by all accounts they were a happy couple"}]}}},"l":{"i":"the act of informing by verbal report"},"similar-words":[{"similar":"report"}]},{"exam":{"i":{"f":{"l":[{"i":"he gave an inaccurate account of the plot to kill the president"}]}}},"l":{"i":"a record or narrative description of past events"},"similar-words":[{"similar":"history"},{"similar":"chronicle"},{"similar":"story"}]},{"exam":{"i":{"f":{"l":[{"i":"the account of his speech that was given on the evening news made the governor furious"}]}}},"l":{"i":"a short account of the news"},"similar-words":[{"similar":"report"},{"similar":"news report"},{"similar":"story"},{"similar":"write up"}]},{"exam":{"i":{"f":{"l":[{"i":"they send me an accounting every month"}]}}},"l":{"i":"a statement of recent transactions and the resulting balance"},"similar-words":[{"similar":"accounting"},{"similar":"account statement"}]},{"exam":{"i":{"f":{"l":[{"i":"I expected a brief account"}]}}},"l":{"i":"a statement that makes something comprehensible by describing the relevant structure or operation or circumstances etc."},"similar-words":[{"similar":"explanation"}]},{"exam":{"i":{"f":{"l":[{"i":"send me an account of what I owe"}]}}},"l":{"i":"an itemized statement of money owed for goods shipped or services rendered"},"similar-words":[{"similar":"bill"},{"similar":"invoice"}]},{"exam":{"i":{"f":{"l":[{"i":"don't do it on my account"},{"i":"the paper was rejected on account of its length"}]}}},"l":{"i":"grounds"},"similar-words":[{"similar":"score"}]},{"exam":{"i":{"f":{"l":[{"i":"a person of considerable account"},{"i":"he predicted that although it is of small account now it will rapidly increase in importance"}]}}},"l":{"i":"importance or value"}},{"exam":{"i":{"f":{"l":[{"i":"she turned her writing skills to good account"}]}}},"l":{"i":"the quality of taking advantage"}}]
                 */

                private String pos;
                private List<TrBeanX> tr;

                public String getPos() {
                    return pos;
                }

                public void setPos(String pos) {
                    this.pos = pos;
                }

                public List<TrBeanX> getTr() {
                    return tr;
                }

                public void setTr(List<TrBeanX> tr) {
                    this.tr = tr;
                }

                public static class TrBeanX {
                    /**
                     * exam : {"i":{"f":{"l":[{"i":"he asked to see the executive who handled his account"}]}}}
                     * l : {"i":"a formal contractual relationship established to provide for regular banking or brokerage or business services"}
                     * similar-words : [{"similar":"business relationship"}]
                     */

                    private ExamBean exam;
                    private LBeanXXXX l;
                    @SerializedName("similar-words")
                    private List<SimilarwordsBean> similarwords;

                    public ExamBean getExam() {
                        return exam;
                    }

                    public void setExam(ExamBean exam) {
                        this.exam = exam;
                    }

                    public LBeanXXXX getL() {
                        return l;
                    }

                    public void setL(LBeanXXXX l) {
                        this.l = l;
                    }

                    public List<SimilarwordsBean> getSimilarwords() {
                        return similarwords;
                    }

                    public void setSimilarwords(List<SimilarwordsBean> similarwords) {
                        this.similarwords = similarwords;
                    }

                    public static class ExamBean {
                        /**
                         * i : {"f":{"l":[{"i":"he asked to see the executive who handled his account"}]}}
                         */

                        private IBean i;

                        public IBean getI() {
                            return i;
                        }

                        public void setI(IBean i) {
                            this.i = i;
                        }

                        public static class IBean {
                            /**
                             * f : {"l":[{"i":"he asked to see the executive who handled his account"}]}
                             */

                            private FBean f;

                            public FBean getF() {
                                return f;
                            }

                            public void setF(FBean f) {
                                this.f = f;
                            }

                            public static class FBean {
                                private List<LBeanXXX> l;

                                public List<LBeanXXX> getL() {
                                    return l;
                                }

                                public void setL(List<LBeanXXX> l) {
                                    this.l = l;
                                }

                                public static class LBeanXXX {
                                    /**
                                     * i : he asked to see the executive who handled his account
                                     */

                                    private String i;

                                    public String getI() {
                                        return i;
                                    }

                                    public void setI(String i) {
                                        this.i = i;
                                    }
                                }
                            }
                        }
                    }

                    public static class LBeanXXXX {
                        /**
                         * i : a formal contractual relationship established to provide for regular banking or brokerage or business services
                         */

                        private String i;

                        public String getI() {
                            return i;
                        }

                        public void setI(String i) {
                            this.i = i;
                        }
                    }

                    public static class SimilarwordsBean {
                        /**
                         * similar : business relationship
                         */

                        private String similar;

                        public String getSimilar() {
                            return similar;
                        }

                        public void setSimilar(String similar) {
                            this.similar = similar;
                        }
                    }
                }
            }
        }
    }

    public static class EtymBean {
        /**
         * etyms : {"en":[{"desc":"","source":"youdict","url":"http://www.youdict.com/etym/","value":"account: [14] Account is of Old French origin. It was formed from compter, conter \u2018count\u2019 (which derived from Latin computāre) and the prefix a-. Its original meaning in English, too, was \u2018count\u2019 or \u2018count up\u2019; this had disappeared by the end of the 18th century, but its specialized reference to the keeping of financial records is of equal antiquity. Account for, meaning \u2018explain\u2019, arose in the mid 18th century.=> count","word":"account"},{"desc":"(v.)","source":"youdict","url":"http://www.youdict.com/etym/","value":"c. 1300, \"to count, enumerate,\" from Old French aconter \"to count, render account\" (Modern French conter), from a \"to\" (see ad-) + conter \"to count, tell\" (see count (v.)). Meaning \"to reckon for money given or received, render a reckoning,\" is from late 14c.; sense of \"to explain\" (c. 1710) is from notion of \"answer for money held in trust.\" Transferred sense of \"value\" is from late 14c. Related: Accounted; accounting.","word":"account"}],"zh":[{"desc":"帐目","source":"童理民","url":"","value":"来自法语，来自于拉丁语compute,来自于词根put,思考，计算。","word":"account"},{"desc":"账目，账户；说明，叙述","source":"童理民","url":"","value":"词根词缀：ac-加强意义 + -count-计算,讲故事 →账目/说明","word":"account"}]}
         * word : account
         */

        private EtymsBean etyms;
        private String word;

        public EtymsBean getEtyms() {
            return etyms;
        }

        public void setEtyms(EtymsBean etyms) {
            this.etyms = etyms;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public static class EtymsBean {
            private List<EnBean> en;
            private List<ZhBean> zh;

            public List<EnBean> getEn() {
                return en;
            }

            public void setEn(List<EnBean> en) {
                this.en = en;
            }

            public List<ZhBean> getZh() {
                return zh;
            }

            public void setZh(List<ZhBean> zh) {
                this.zh = zh;
            }

            public static class EnBean {
                /**
                 * desc :
                 * source : youdict
                 * url : http://www.youdict.com/etym/
                 * value : account: [14] Account is of Old French origin. It was formed from compter, conter ‘count’ (which derived from Latin computāre) and the prefix a-. Its original meaning in English, too, was ‘count’ or ‘count up’; this had disappeared by the end of the 18th century, but its specialized reference to the keeping of financial records is of equal antiquity. Account for, meaning ‘explain’, arose in the mid 18th century.=> count
                 * word : account
                 */

                private String desc;
                private String source;
                private String url;
                private String value;
                private String word;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getSource() {
                    return source;
                }

                public void setSource(String source) {
                    this.source = source;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public String getWord() {
                    return word;
                }

                public void setWord(String word) {
                    this.word = word;
                }
            }

            public static class ZhBean {
                /**
                 * desc : 帐目
                 * source : 童理民
                 * url :
                 * value : 来自法语，来自于拉丁语compute,来自于词根put,思考，计算。
                 * word : account
                 */

                private String desc;
                private String source;
                private String url;
                private String value;
                private String word;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getSource() {
                    return source;
                }

                public void setSource(String source) {
                    this.source = source;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public String getWord() {
                    return word;
                }

                public void setWord(String word) {
                    this.word = word;
                }
            }
        }
    }

    public static class ExamDictBean {
        private List<String> exam_type;
        private List<ExamsBean> exams;

        public List<String> getExam_type() {
            return exam_type;
        }

        public void setExam_type(List<String> exam_type) {
            this.exam_type = exam_type;
        }

        public List<ExamsBean> getExams() {
            return exams;
        }

        public void setExams(List<ExamsBean> exams) {
            this.exams = exams;
        }

        public static class ExamsBean {
            /**
             * books : [{"book_name":"新东方·TOEFL词汇词根+联想记忆法","content":{"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[],"phonetic":"[ə'kaunt]","phrases":[{"content":[{"phrase":"take...into <b>account<\/b> 考虑， 重视； <b>account<\/b> for说明； 占"}],"name":"词组搭配"}],"regular":false,"related":[{"content":[{"text":"accounting(n. 会计学)； accountant(n. 会计师)； accountable(a. 应作解释的； 应负责的)"}],"name":"派生词"}],"remember":[{"content":" ac(表加强) + count(数) → 账目需要一数再数 → 账目","name":"词根记忆"}],"sentences":[{"content":[{"eng":"The three main television networks in the United States <b>account<\/b> for more advertising dollars than any other medium. 美国三大电视网络占有的广告费比其他任何媒体都要多。"}],"name":"例句"}],"star":false,"translation":[{"examples":[],"occured":false,"tran":"v. 说明， 解释； (在数量上)占 n. 解释， 描述， 叙述(interpretation)； 账目； 账户(record)"}],"word":"account"}}]
             * category : TOEFL
             */

            private String category;
            private List<BooksBean> books;

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public List<BooksBean> getBooks() {
                return books;
            }

            public void setBooks(List<BooksBean> books) {
                this.books = books;
            }

            public static class BooksBean {
                /**
                 * book_name : 新东方·TOEFL词汇词根+联想记忆法
                 * content : {"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[],"phonetic":"[ə'kaunt]","phrases":[{"content":[{"phrase":"take...into <b>account<\/b> 考虑， 重视； <b>account<\/b> for说明； 占"}],"name":"词组搭配"}],"regular":false,"related":[{"content":[{"text":"accounting(n. 会计学)； accountant(n. 会计师)； accountable(a. 应作解释的； 应负责的)"}],"name":"派生词"}],"remember":[{"content":" ac(表加强) + count(数) → 账目需要一数再数 → 账目","name":"词根记忆"}],"sentences":[{"content":[{"eng":"The three main television networks in the United States <b>account<\/b> for more advertising dollars than any other medium. 美国三大电视网络占有的广告费比其他任何媒体都要多。"}],"name":"例句"}],"star":false,"translation":[{"examples":[],"occured":false,"tran":"v. 说明， 解释； (在数量上)占 n. 解释， 描述， 叙述(interpretation)； 账目； 账户(record)"}],"word":"account"}
                 */

                private String book_name;
                private ContentBeanXXX content;

                public String getBook_name() {
                    return book_name;
                }

                public void setBook_name(String book_name) {
                    this.book_name = book_name;
                }

                public ContentBeanXXX getContent() {
                    return content;
                }

                public void setContent(ContentBeanXXX content) {
                    this.content = content;
                }

                public static class ContentBeanXXX {
                    /**
                     * barron : false
                     * discriminate : []
                     * explanation : []
                     * freq : -1
                     * pastexams : []
                     * phonetic : [ə'kaunt]
                     * phrases : [{"content":[{"phrase":"take...into <b>account<\/b> 考虑， 重视； <b>account<\/b> for说明； 占"}],"name":"词组搭配"}]
                     * regular : false
                     * related : [{"content":[{"text":"accounting(n. 会计学)； accountant(n. 会计师)； accountable(a. 应作解释的； 应负责的)"}],"name":"派生词"}]
                     * remember : [{"content":" ac(表加强) + count(数) → 账目需要一数再数 → 账目","name":"词根记忆"}]
                     * sentences : [{"content":[{"eng":"The three main television networks in the United States <b>account<\/b> for more advertising dollars than any other medium. 美国三大电视网络占有的广告费比其他任何媒体都要多。"}],"name":"例句"}]
                     * star : false
                     * translation : [{"examples":[],"occured":false,"tran":"v. 说明， 解释； (在数量上)占 n. 解释， 描述， 叙述(interpretation)； 账目； 账户(record)"}]
                     * word : account
                     */

                    private boolean barron;
                    private int freq;
                    private String phonetic;
                    private boolean regular;
                    private boolean star;
                    private String word;
                    private List<?> discriminate;
                    private List<?> explanation;
                    private List<?> pastexams;
                    private List<PhrasesBean> phrases;
                    private List<RelatedBean> related;
                    private List<RememberBean> remember;
                    private List<SentencesBean> sentences;
                    private List<TranslationBean> translation;

                    public boolean isBarron() {
                        return barron;
                    }

                    public void setBarron(boolean barron) {
                        this.barron = barron;
                    }

                    public int getFreq() {
                        return freq;
                    }

                    public void setFreq(int freq) {
                        this.freq = freq;
                    }

                    public String getPhonetic() {
                        return phonetic;
                    }

                    public void setPhonetic(String phonetic) {
                        this.phonetic = phonetic;
                    }

                    public boolean isRegular() {
                        return regular;
                    }

                    public void setRegular(boolean regular) {
                        this.regular = regular;
                    }

                    public boolean isStar() {
                        return star;
                    }

                    public void setStar(boolean star) {
                        this.star = star;
                    }

                    public String getWord() {
                        return word;
                    }

                    public void setWord(String word) {
                        this.word = word;
                    }

                    public List<?> getDiscriminate() {
                        return discriminate;
                    }

                    public void setDiscriminate(List<?> discriminate) {
                        this.discriminate = discriminate;
                    }

                    public List<?> getExplanation() {
                        return explanation;
                    }

                    public void setExplanation(List<?> explanation) {
                        this.explanation = explanation;
                    }

                    public List<?> getPastexams() {
                        return pastexams;
                    }

                    public void setPastexams(List<?> pastexams) {
                        this.pastexams = pastexams;
                    }

                    public List<PhrasesBean> getPhrases() {
                        return phrases;
                    }

                    public void setPhrases(List<PhrasesBean> phrases) {
                        this.phrases = phrases;
                    }

                    public List<RelatedBean> getRelated() {
                        return related;
                    }

                    public void setRelated(List<RelatedBean> related) {
                        this.related = related;
                    }

                    public List<RememberBean> getRemember() {
                        return remember;
                    }

                    public void setRemember(List<RememberBean> remember) {
                        this.remember = remember;
                    }

                    public List<SentencesBean> getSentences() {
                        return sentences;
                    }

                    public void setSentences(List<SentencesBean> sentences) {
                        this.sentences = sentences;
                    }

                    public List<TranslationBean> getTranslation() {
                        return translation;
                    }

                    public void setTranslation(List<TranslationBean> translation) {
                        this.translation = translation;
                    }

                    public static class PhrasesBean {
                        /**
                         * content : [{"phrase":"take...into <b>account<\/b> 考虑， 重视； <b>account<\/b> for说明； 占"}]
                         * name : 词组搭配
                         */

                        private String name;
                        private List<ContentBean> content;

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public List<ContentBean> getContent() {
                            return content;
                        }

                        public void setContent(List<ContentBean> content) {
                            this.content = content;
                        }

                        public static class ContentBean {
                            /**
                             * phrase : take...into <b>account</b> 考虑， 重视； <b>account</b> for说明； 占
                             */

                            private String phrase;

                            public String getPhrase() {
                                return phrase;
                            }

                            public void setPhrase(String phrase) {
                                this.phrase = phrase;
                            }
                        }
                    }

                    public static class RelatedBean {
                        /**
                         * content : [{"text":"accounting(n. 会计学)； accountant(n. 会计师)； accountable(a. 应作解释的； 应负责的)"}]
                         * name : 派生词
                         */

                        private String name;
                        private List<ContentBeanX> content;

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public List<ContentBeanX> getContent() {
                            return content;
                        }

                        public void setContent(List<ContentBeanX> content) {
                            this.content = content;
                        }

                        public static class ContentBeanX {
                            /**
                             * text : accounting(n. 会计学)； accountant(n. 会计师)； accountable(a. 应作解释的； 应负责的)
                             */

                            private String text;

                            public String getText() {
                                return text;
                            }

                            public void setText(String text) {
                                this.text = text;
                            }
                        }
                    }

                    public static class RememberBean {
                        /**
                         * content :  ac(表加强) + count(数) → 账目需要一数再数 → 账目
                         * name : 词根记忆
                         */

                        private String content;
                        private String name;

                        public String getContent() {
                            return content;
                        }

                        public void setContent(String content) {
                            this.content = content;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }
                    }

                    public static class SentencesBean {
                        /**
                         * content : [{"eng":"The three main television networks in the United States <b>account<\/b> for more advertising dollars than any other medium. 美国三大电视网络占有的广告费比其他任何媒体都要多。"}]
                         * name : 例句
                         */

                        private String name;
                        private List<ContentBeanXX> content;

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public List<ContentBeanXX> getContent() {
                            return content;
                        }

                        public void setContent(List<ContentBeanXX> content) {
                            this.content = content;
                        }

                        public static class ContentBeanXX {
                            /**
                             * eng : The three main television networks in the United States <b>account</b> for more advertising dollars than any other medium. 美国三大电视网络占有的广告费比其他任何媒体都要多。
                             */

                            private String eng;

                            public String getEng() {
                                return eng;
                            }

                            public void setEng(String eng) {
                                this.eng = eng;
                            }
                        }
                    }

                    public static class TranslationBean {
                        /**
                         * examples : []
                         * occured : false
                         * tran : v. 说明， 解释； (在数量上)占 n. 解释， 描述， 叙述(interpretation)； 账目； 账户(record)
                         */

                        private boolean occured;
                        private String tran;
                        private List<?> examples;

                        public boolean isOccured() {
                            return occured;
                        }

                        public void setOccured(boolean occured) {
                            this.occured = occured;
                        }

                        public String getTran() {
                            return tran;
                        }

                        public void setTran(String tran) {
                            this.tran = tran;
                        }

                        public List<?> getExamples() {
                            return examples;
                        }

                        public void setExamples(List<?> examples) {
                            this.examples = examples;
                        }
                    }
                }
            }
        }
    }

    public static class LongmanBean {
        /**
         * isGood : true
         * wordList : [{"Entry":{"Head":[{"FREQ":["S1","W1"],"GRAM":["C"],"HOMNUM":["1"],"HWD":["account"],"HYPHENATION":["ac\u2027count"],"POS":["n"],"PronCodes":[{"PRON":["əˈkaʊnt"],"PRONKK":["əˋka u nt"]}],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}],"Sense":[{"DEF":["a written or spoken description that says what happens in an event or process"],"EXAMPLE":["Chomsky\u2019s account of how children learn their first language"],"EXAMPLETRAN":["乔姆斯基关于儿童如何学习第一语言的描述"],"GramExa":[{"EXAMPLE":["He was too shocked to <i>give an account<\/i> of what had happened."],"EXAMPLETRAN":["他因受惊过度而无法描述所发生的事情。"],"PROPFORMPREP":["of"]},{"COLLOTRAN":["一五一十的叙述"],"EXAMPLE":["a blow-by-blow account of how England lost to Portugal"],"EXAMPLETRAN":["英格兰队如何负于葡萄牙队的详细报道"],"GLOSS":["a description of all the details of an event in the order that they happened"],"PROPFORM":["blow-by-blow account"]},{"COLLOTRAN":["目击者的/第一手的描述"],"EXAMPLE":["Eye-witness accounts told of the unprovoked shooting of civilians.","This gives a first-hand account of the war."],"EXAMPLETRAN":["目击者讲到平民无故被枪击。","这是关于这场战争的第一手报道。"],"GLOSS":["a description of events by someone who saw them"],"PROPFORM":["eye-witness/first-hand account"]}],"SIGNPOST":["description"],"SIGNTRAN":["描述"],"TRAN":["叙述，描写，报道"]},{"Crossref":[{"Crossrefto":[{"REFHWD":["bank account"]},{"REFHWD":["checking account"]},{"REFHWD":["current account"]},{"REFHWD":["deposit account"]},{"REFHWD":["profit and loss account"]},{"REFHWD":["savings account"]}]}],"DEF":["an arrangement in which a bank keeps your money safe so that you can pay more in or take money out"],"EXAMPLE":["My salary is paid into my bank account.","I\u2019ve <i>opened an account<\/i> with Barclay\u2019s Bank.","My husband and I have a <i>joint account<\/i> (= <em> one that is shared between two people <\/em> ) ."],"EXAMPLETRAN":["我的工资直接存入我的银行账户。","我在巴克莱银行开了一个账户。","我和丈夫有个联名账户。"],"SIGNPOST":["at a bank"],"SIGNTRAN":["在银行"],"TRAN":["账户"],"Variant":[{"ABBR":["a/c","acct."],"LINKWORD":["written abbreviation <i>书面缩写为<\/i>","or"]}]},{"DEF":["to consider or include particular facts or details when making a decision or judgment about something"],"EXAMPLE":["These figures do not take account of changes in the rate of inflation."],"EXAMPLETRAN":["这些数字没有把通货膨胀率的变化考虑进去。"],"LEXUNIT":["take account of sth"],"TRAN":["考虑到某事，把某事考虑进去"],"Variant":[{"LEXVAR":["take sth into account"],"LINKWORD":["also <i>又作<\/i>"]}]},{"DEF":["because of something else, especially a problem or difficulty"],"EXAMPLE":["She was told to wear flat shoes, on account of her back problem."],"EXAMPLETRAN":["因为背部有问题，她被建议穿平底鞋。"],"LEXUNIT":["on account of sth"],"TRAN":["因为某事，由于某事"]},{"LEXUNIT":["accounts"],"Subsense":[{"DEF":["an exact record of the money that a company has received and the money it has spent"],"EXAMPLE":["The accounts for last year showed a profit of $2 million."],"EXAMPLETRAN":["去年的账目显示利润为200万美元。"],"GRAM":["plural"],"GRAMTRAN":["复数"],"TRAN":["账目"]},{"DEF":["a department in a company that is responsible for keeping records of the amount of money spent and received"],"EXAMPLE":["Eileen works in accounts."],"EXAMPLETRAN":["艾琳在财务部工作。"],"GRAM":["U"],"TRAN":["〔公司的〕财务部"]}]},{"DEF":["if you buy goods on account, you take them away with you and pay for them later"],"LEXUNIT":["on account"],"TRAN":["赊账"]},{"DEF":["an arrangement that you have with a shop or company, which allows you to buy goods or use a service now and pay for them later"],"EXAMPLE":["Can you charge this to my account please?","an unlimited-use Internet account"],"EXAMPLETRAN":["你能把这记在我的（赊欠）账上吗？","一个能无限使用的因特网后付费账户"],"SIGNPOST":["with a shop/company"],"SIGNTRAN":["商店/公司"],"SYN":["credit account"],"TRAN":["〔可先使用后付款的〕赊欠账户"]},{"DEF":["a statement that shows how much money you owe for things you have bought from a shop"],"GramExa":[{"COLLOTRAN":["付账/结账"],"EXAMPLE":["James left the restaurant, settling his account by credit card."],"EXAMPLETRAN":["詹姆斯用信用卡结完账离开餐厅。"],"GLOSS":["pay what you owe"],"PROPFORM":["pay/settle your account"]}],"SIGNPOST":["bill"],"SIGNTRAN":["账单"],"SYN":["bill"],"TRAN":["账单"]},{"DEF":["an arrangement to sell goods and services to another company over a period of time"],"EXAMPLE":["Our sales manager has secured several big accounts recently."],"EXAMPLETRAN":["我们的销售部经理最近拉到了好几笔大生意。"],"SIGNPOST":["arrangement to sell goods"],"SIGNTRAN":["售货安排"],"TRAN":["〔一段时间内的〕交易安排"]},{"DEF":["according to what a lot of people say"],"EXAMPLE":["It has, from all accounts, been a successful marriage."],"EXAMPLETRAN":["谁都说这是一桩美满的婚姻。"],"LEXUNIT":["by/from all accounts"],"TRAN":["根据各方面所说"]},{"DEF":["if you do something on someone\u2019s account, you do it because you think they want you to"],"EXAMPLE":["Please don\u2019t change your plans on my account."],"EXAMPLETRAN":["请不要为了我而改变你的计划。"],"LEXUNIT":["on sb\u2019s account"],"TRAN":["为了某人的缘故"]},{"DEF":["by yourself or for yourself"],"EXAMPLE":["Carrie decided to do a little research on her own account."],"EXAMPLETRAN":["卡丽决定自己做点研究。"],"LEXUNIT":["on your own account"],"TRAN":["靠自己；为自己"]},{"DEF":["used when saying that someone must not, for any reason, do something"],"EXAMPLE":["On no account must you disturb me."],"EXAMPLETRAN":["你千万不要打扰我。"],"LEXUNIT":["on no account/not on any account"],"TRAN":["决不，绝对不"]},{"DEF":["according to what you have said, especially when you have admitted doing something wrong"],"EXAMPLE":["Bentley was, by his own account, over-sensitive to criticism."],"EXAMPLETRAN":["据本特利自己说，他对批评过于敏感。"],"LEXUNIT":["by sb\u2019s own account"],"TRAN":["据某人自己所说"]},{"DEF":["concerning a particular situation"],"EXAMPLE":["There needn\u2019t be any more worries on that account."],"EXAMPLETRAN":["没有必要再为那事担心了。"],"LEXUNIT":["on that account/on this account"],"TRAN":["由于那个/这个缘故"]},{"DEF":["to do something or perform very well or very badly"],"EXAMPLE":["Kevin gave a good account of himself in today\u2019s game."],"EXAMPLETRAN":["凯文在今天的比赛中表现出色。"],"LEXUNIT":["give a good/poor account of yourself"],"TRAN":["表现好/表现差"]},{"DEF":["to force someone who is responsible for a mistake or a crime to explain publicly why they did it and punish them for it if necessary"],"EXAMPLE":["The people responsible for the accident have never been brought to account."],"EXAMPLETRAN":["这起事故的责任人一直没有被追究责任。"],"LABELTRAN":["【正式】"],"LEXUNIT":["bring/call sb to account"],"REGISTERLAB":["formal"],"TRAN":["追究某人的责任"]},{"DEF":["to use something for a good purpose"],"EXAMPLE":["Perhaps she could put some of her talents to good account by helping us."],"EXAMPLETRAN":["通过帮助我们，也许她可以把自己的某些才能充分发挥出来。"],"LABELTRAN":["【正式】"],"LEXUNIT":["put/turn sth to good account"],"REGISTERLAB":["formal"],"TRAN":["善用某物，充分利用某物"]},{"DEF":["not important"],"EXAMPLE":["As she grew up, her father was of no account to her."],"EXAMPLETRAN":["她渐渐长大，父亲对她也不重要了。"],"LABELTRAN":["【正式】"],"LEXUNIT":["of no/little account"],"REGISTERLAB":["formal"],"TRAN":["不重要，没关系"]}]}},{"Entry":{"Head":[{"FREQ":["S3","W2"],"HOMNUM":["2"],"HWD":["account"],"HYPHENATION":["account"],"POS":["v"],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}],"PhrVbEntry":[{"Head":[{"PHRVBHWD":["account for <i>sth<\/i>"],"POS":["phr v"]}],"Sense":[{"DEF":["to form a particular amount or part of something"],"EXAMPLE":["Afro-Americans account for 12% of the US population."],"EXAMPLETRAN":["非裔美国人占美国人口的12%。"],"TRAN":["占〔一定数量或比例〕"]},{"DEF":["to be the reason why something happens"],"EXAMPLE":["Recent pressure at work may account for his behavior."],"EXAMPLETRAN":["他的行为也许是最近的工作压力导致的。"],"SYN":["explain"],"TRAN":["是\u2026的原因"]},{"DEF":["to give a satisfactory explanation of why something has happened or why you did something"],"EXAMPLE":["Can you account for your movements on that night?"],"EXAMPLETRAN":["你能说明一下你那天晚上的行踪吗？"],"SYN":["explain"],"TRAN":["解释，说明"]},{"DEF":["to say where all the members of a group of people or things are, especially because you are worried that some of them may be lost"],"EXAMPLE":["Three days after the earthquake, more than 150 people had still to be accounted for."],"EXAMPLETRAN":["地震发生3天后，仍有150多人下落不明。"],"TRAN":["说明\u2026在何处"]}]}]}}]
         */

        private String isGood;
        private List<WordListBean> wordList;

        public String getIsGood() {
            return isGood;
        }

        public void setIsGood(String isGood) {
            this.isGood = isGood;
        }

        public List<WordListBean> getWordList() {
            return wordList;
        }

        public void setWordList(List<WordListBean> wordList) {
            this.wordList = wordList;
        }

        public static class WordListBean {
            /**
             * Entry : {"Head":[{"FREQ":["S1","W1"],"GRAM":["C"],"HOMNUM":["1"],"HWD":["account"],"HYPHENATION":["ac\u2027count"],"POS":["n"],"PronCodes":[{"PRON":["əˈkaʊnt"],"PRONKK":["əˋka u nt"]}],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}],"Sense":[{"DEF":["a written or spoken description that says what happens in an event or process"],"EXAMPLE":["Chomsky\u2019s account of how children learn their first language"],"EXAMPLETRAN":["乔姆斯基关于儿童如何学习第一语言的描述"],"GramExa":[{"EXAMPLE":["He was too shocked to <i>give an account<\/i> of what had happened."],"EXAMPLETRAN":["他因受惊过度而无法描述所发生的事情。"],"PROPFORMPREP":["of"],"COLLOTRAN":["一五一十的叙述"],"GLOSS":["a description of all the details of an event in the order that they happened"],"PROPFORM":["blow-by-blow account"]},{"COLLOTRAN":["一五一十的叙述"],"EXAMPLE":["a blow-by-blow account of how England lost to Portugal"],"EXAMPLETRAN":["英格兰队如何负于葡萄牙队的详细报道"],"GLOSS":["a description of all the details of an event in the order that they happened"],"PROPFORM":["blow-by-blow account"]},{"COLLOTRAN":["目击者的/第一手的描述"],"EXAMPLE":["Eye-witness accounts told of the unprovoked shooting of civilians.","This gives a first-hand account of the war."],"EXAMPLETRAN":["目击者讲到平民无故被枪击。","这是关于这场战争的第一手报道。"],"GLOSS":["a description of events by someone who saw them"],"PROPFORM":["eye-witness/first-hand account"]}],"SIGNPOST":["description"],"SIGNTRAN":["描述"],"TRAN":["叙述，描写，报道"],"Crossref":[{"Crossrefto":[{"REFHWD":["bank account"]},{"REFHWD":["checking account"]},{"REFHWD":["current account"]},{"REFHWD":["deposit account"]},{"REFHWD":["profit and loss account"]},{"REFHWD":["savings account"]}]}],"Variant":[{"ABBR":["a/c","acct."],"LINKWORD":["written abbreviation <i>书面缩写为<\/i>","or"]}],"LEXUNIT":["take account of sth"],"Subsense":[{"DEF":["an exact record of the money that a company has received and the money it has spent"],"EXAMPLE":["The accounts for last year showed a profit of $2 million."],"EXAMPLETRAN":["去年的账目显示利润为200万美元。"],"GRAM":["plural"],"GRAMTRAN":["复数"],"TRAN":["账目"]},{"DEF":["a department in a company that is responsible for keeping records of the amount of money spent and received"],"EXAMPLE":["Eileen works in accounts."],"EXAMPLETRAN":["艾琳在财务部工作。"],"GRAM":["U"],"TRAN":["〔公司的〕财务部"]}],"SYN":["credit account"],"LABELTRAN":["【正式】"],"REGISTERLAB":["formal"]},{"Crossref":[{"Crossrefto":[{"REFHWD":["bank account"]},{"REFHWD":["checking account"]},{"REFHWD":["current account"]},{"REFHWD":["deposit account"]},{"REFHWD":["profit and loss account"]},{"REFHWD":["savings account"]}]}],"DEF":["an arrangement in which a bank keeps your money safe so that you can pay more in or take money out"],"EXAMPLE":["My salary is paid into my bank account.","I\u2019ve <i>opened an account<\/i> with Barclay\u2019s Bank.","My husband and I have a <i>joint account<\/i> (= <em> one that is shared between two people <\/em> ) ."],"EXAMPLETRAN":["我的工资直接存入我的银行账户。","我在巴克莱银行开了一个账户。","我和丈夫有个联名账户。"],"SIGNPOST":["at a bank"],"SIGNTRAN":["在银行"],"TRAN":["账户"],"Variant":[{"ABBR":["a/c","acct."],"LINKWORD":["written abbreviation <i>书面缩写为<\/i>","or"]}]},{"DEF":["to consider or include particular facts or details when making a decision or judgment about something"],"EXAMPLE":["These figures do not take account of changes in the rate of inflation."],"EXAMPLETRAN":["这些数字没有把通货膨胀率的变化考虑进去。"],"LEXUNIT":["take account of sth"],"TRAN":["考虑到某事，把某事考虑进去"],"Variant":[{"LEXVAR":["take sth into account"],"LINKWORD":["also <i>又作<\/i>"]}]},{"DEF":["because of something else, especially a problem or difficulty"],"EXAMPLE":["She was told to wear flat shoes, on account of her back problem."],"EXAMPLETRAN":["因为背部有问题，她被建议穿平底鞋。"],"LEXUNIT":["on account of sth"],"TRAN":["因为某事，由于某事"]},{"LEXUNIT":["accounts"],"Subsense":[{"DEF":["an exact record of the money that a company has received and the money it has spent"],"EXAMPLE":["The accounts for last year showed a profit of $2 million."],"EXAMPLETRAN":["去年的账目显示利润为200万美元。"],"GRAM":["plural"],"GRAMTRAN":["复数"],"TRAN":["账目"]},{"DEF":["a department in a company that is responsible for keeping records of the amount of money spent and received"],"EXAMPLE":["Eileen works in accounts."],"EXAMPLETRAN":["艾琳在财务部工作。"],"GRAM":["U"],"TRAN":["〔公司的〕财务部"]}]},{"DEF":["if you buy goods on account, you take them away with you and pay for them later"],"LEXUNIT":["on account"],"TRAN":["赊账"]},{"DEF":["an arrangement that you have with a shop or company, which allows you to buy goods or use a service now and pay for them later"],"EXAMPLE":["Can you charge this to my account please?","an unlimited-use Internet account"],"EXAMPLETRAN":["你能把这记在我的（赊欠）账上吗？","一个能无限使用的因特网后付费账户"],"SIGNPOST":["with a shop/company"],"SIGNTRAN":["商店/公司"],"SYN":["credit account"],"TRAN":["〔可先使用后付款的〕赊欠账户"]},{"DEF":["a statement that shows how much money you owe for things you have bought from a shop"],"GramExa":[{"COLLOTRAN":["付账/结账"],"EXAMPLE":["James left the restaurant, settling his account by credit card."],"EXAMPLETRAN":["詹姆斯用信用卡结完账离开餐厅。"],"GLOSS":["pay what you owe"],"PROPFORM":["pay/settle your account"]}],"SIGNPOST":["bill"],"SIGNTRAN":["账单"],"SYN":["bill"],"TRAN":["账单"]},{"DEF":["an arrangement to sell goods and services to another company over a period of time"],"EXAMPLE":["Our sales manager has secured several big accounts recently."],"EXAMPLETRAN":["我们的销售部经理最近拉到了好几笔大生意。"],"SIGNPOST":["arrangement to sell goods"],"SIGNTRAN":["售货安排"],"TRAN":["〔一段时间内的〕交易安排"]},{"DEF":["according to what a lot of people say"],"EXAMPLE":["It has, from all accounts, been a successful marriage."],"EXAMPLETRAN":["谁都说这是一桩美满的婚姻。"],"LEXUNIT":["by/from all accounts"],"TRAN":["根据各方面所说"]},{"DEF":["if you do something on someone\u2019s account, you do it because you think they want you to"],"EXAMPLE":["Please don\u2019t change your plans on my account."],"EXAMPLETRAN":["请不要为了我而改变你的计划。"],"LEXUNIT":["on sb\u2019s account"],"TRAN":["为了某人的缘故"]},{"DEF":["by yourself or for yourself"],"EXAMPLE":["Carrie decided to do a little research on her own account."],"EXAMPLETRAN":["卡丽决定自己做点研究。"],"LEXUNIT":["on your own account"],"TRAN":["靠自己；为自己"]},{"DEF":["used when saying that someone must not, for any reason, do something"],"EXAMPLE":["On no account must you disturb me."],"EXAMPLETRAN":["你千万不要打扰我。"],"LEXUNIT":["on no account/not on any account"],"TRAN":["决不，绝对不"]},{"DEF":["according to what you have said, especially when you have admitted doing something wrong"],"EXAMPLE":["Bentley was, by his own account, over-sensitive to criticism."],"EXAMPLETRAN":["据本特利自己说，他对批评过于敏感。"],"LEXUNIT":["by sb\u2019s own account"],"TRAN":["据某人自己所说"]},{"DEF":["concerning a particular situation"],"EXAMPLE":["There needn\u2019t be any more worries on that account."],"EXAMPLETRAN":["没有必要再为那事担心了。"],"LEXUNIT":["on that account/on this account"],"TRAN":["由于那个/这个缘故"]},{"DEF":["to do something or perform very well or very badly"],"EXAMPLE":["Kevin gave a good account of himself in today\u2019s game."],"EXAMPLETRAN":["凯文在今天的比赛中表现出色。"],"LEXUNIT":["give a good/poor account of yourself"],"TRAN":["表现好/表现差"]},{"DEF":["to force someone who is responsible for a mistake or a crime to explain publicly why they did it and punish them for it if necessary"],"EXAMPLE":["The people responsible for the accident have never been brought to account."],"EXAMPLETRAN":["这起事故的责任人一直没有被追究责任。"],"LABELTRAN":["【正式】"],"LEXUNIT":["bring/call sb to account"],"REGISTERLAB":["formal"],"TRAN":["追究某人的责任"]},{"DEF":["to use something for a good purpose"],"EXAMPLE":["Perhaps she could put some of her talents to good account by helping us."],"EXAMPLETRAN":["通过帮助我们，也许她可以把自己的某些才能充分发挥出来。"],"LABELTRAN":["【正式】"],"LEXUNIT":["put/turn sth to good account"],"REGISTERLAB":["formal"],"TRAN":["善用某物，充分利用某物"]},{"DEF":["not important"],"EXAMPLE":["As she grew up, her father was of no account to her."],"EXAMPLETRAN":["她渐渐长大，父亲对她也不重要了。"],"LABELTRAN":["【正式】"],"LEXUNIT":["of no/little account"],"REGISTERLAB":["formal"],"TRAN":["不重要，没关系"]}]}
             */

            private EntryBeanX Entry;

            public EntryBeanX getEntry() {
                return Entry;
            }

            public void setEntry(EntryBeanX Entry) {
                this.Entry = Entry;
            }

            public static class EntryBeanX {
                private List<HeadBean> Head;
                private List<SenseBean> Sense;

                public List<HeadBean> getHead() {
                    return Head;
                }

                public void setHead(List<HeadBean> Head) {
                    this.Head = Head;
                }

                public List<SenseBean> getSense() {
                    return Sense;
                }

                public void setSense(List<SenseBean> Sense) {
                    this.Sense = Sense;
                }

                public static class HeadBean {
                    private List<String> FREQ;
                    private List<String> GRAM;
                    private List<String> HOMNUM;
                    private List<String> HWD;
                    private List<String> HYPHENATION;
                    private List<String> POS;
                    private List<PronCodesBean> PronCodes;
                    private List<String> VIDEOCAL;

                    public List<String> getFREQ() {
                        return FREQ;
                    }

                    public void setFREQ(List<String> FREQ) {
                        this.FREQ = FREQ;
                    }

                    public List<String> getGRAM() {
                        return GRAM;
                    }

                    public void setGRAM(List<String> GRAM) {
                        this.GRAM = GRAM;
                    }

                    public List<String> getHOMNUM() {
                        return HOMNUM;
                    }

                    public void setHOMNUM(List<String> HOMNUM) {
                        this.HOMNUM = HOMNUM;
                    }

                    public List<String> getHWD() {
                        return HWD;
                    }

                    public void setHWD(List<String> HWD) {
                        this.HWD = HWD;
                    }

                    public List<String> getHYPHENATION() {
                        return HYPHENATION;
                    }

                    public void setHYPHENATION(List<String> HYPHENATION) {
                        this.HYPHENATION = HYPHENATION;
                    }

                    public List<String> getPOS() {
                        return POS;
                    }

                    public void setPOS(List<String> POS) {
                        this.POS = POS;
                    }

                    public List<PronCodesBean> getPronCodes() {
                        return PronCodes;
                    }

                    public void setPronCodes(List<PronCodesBean> PronCodes) {
                        this.PronCodes = PronCodes;
                    }

                    public List<String> getVIDEOCAL() {
                        return VIDEOCAL;
                    }

                    public void setVIDEOCAL(List<String> VIDEOCAL) {
                        this.VIDEOCAL = VIDEOCAL;
                    }

                    public static class PronCodesBean {
                        private List<String> PRON;
                        private List<String> PRONKK;

                        public List<String> getPRON() {
                            return PRON;
                        }

                        public void setPRON(List<String> PRON) {
                            this.PRON = PRON;
                        }

                        public List<String> getPRONKK() {
                            return PRONKK;
                        }

                        public void setPRONKK(List<String> PRONKK) {
                            this.PRONKK = PRONKK;
                        }
                    }
                }

                public static class SenseBean {
                    private List<String> DEF;
                    private List<String> EXAMPLE;
                    private List<String> EXAMPLETRAN;
                    private List<GramExaBean> GramExa;
                    private List<String> SIGNPOST;
                    private List<String> SIGNTRAN;
                    private List<String> TRAN;
                    private List<CrossrefBean> Crossref;
                    private List<VariantBean> Variant;
                    private List<String> LEXUNIT;
                    private List<SubsenseBean> Subsense;
                    private List<String> SYN;
                    private List<String> LABELTRAN;
                    private List<String> REGISTERLAB;

                    public List<String> getDEF() {
                        return DEF;
                    }

                    public void setDEF(List<String> DEF) {
                        this.DEF = DEF;
                    }

                    public List<String> getEXAMPLE() {
                        return EXAMPLE;
                    }

                    public void setEXAMPLE(List<String> EXAMPLE) {
                        this.EXAMPLE = EXAMPLE;
                    }

                    public List<String> getEXAMPLETRAN() {
                        return EXAMPLETRAN;
                    }

                    public void setEXAMPLETRAN(List<String> EXAMPLETRAN) {
                        this.EXAMPLETRAN = EXAMPLETRAN;
                    }

                    public List<GramExaBean> getGramExa() {
                        return GramExa;
                    }

                    public void setGramExa(List<GramExaBean> GramExa) {
                        this.GramExa = GramExa;
                    }

                    public List<String> getSIGNPOST() {
                        return SIGNPOST;
                    }

                    public void setSIGNPOST(List<String> SIGNPOST) {
                        this.SIGNPOST = SIGNPOST;
                    }

                    public List<String> getSIGNTRAN() {
                        return SIGNTRAN;
                    }

                    public void setSIGNTRAN(List<String> SIGNTRAN) {
                        this.SIGNTRAN = SIGNTRAN;
                    }

                    public List<String> getTRAN() {
                        return TRAN;
                    }

                    public void setTRAN(List<String> TRAN) {
                        this.TRAN = TRAN;
                    }

                    public List<CrossrefBean> getCrossref() {
                        return Crossref;
                    }

                    public void setCrossref(List<CrossrefBean> Crossref) {
                        this.Crossref = Crossref;
                    }

                    public List<VariantBean> getVariant() {
                        return Variant;
                    }

                    public void setVariant(List<VariantBean> Variant) {
                        this.Variant = Variant;
                    }

                    public List<String> getLEXUNIT() {
                        return LEXUNIT;
                    }

                    public void setLEXUNIT(List<String> LEXUNIT) {
                        this.LEXUNIT = LEXUNIT;
                    }

                    public List<SubsenseBean> getSubsense() {
                        return Subsense;
                    }

                    public void setSubsense(List<SubsenseBean> Subsense) {
                        this.Subsense = Subsense;
                    }

                    public List<String> getSYN() {
                        return SYN;
                    }

                    public void setSYN(List<String> SYN) {
                        this.SYN = SYN;
                    }

                    public List<String> getLABELTRAN() {
                        return LABELTRAN;
                    }

                    public void setLABELTRAN(List<String> LABELTRAN) {
                        this.LABELTRAN = LABELTRAN;
                    }

                    public List<String> getREGISTERLAB() {
                        return REGISTERLAB;
                    }

                    public void setREGISTERLAB(List<String> REGISTERLAB) {
                        this.REGISTERLAB = REGISTERLAB;
                    }

                    public static class GramExaBean {
                        private List<String> EXAMPLE;
                        private List<String> EXAMPLETRAN;
                        private List<String> PROPFORMPREP;
                        private List<String> COLLOTRAN;
                        private List<String> GLOSS;
                        private List<String> PROPFORM;

                        public List<String> getEXAMPLE() {
                            return EXAMPLE;
                        }

                        public void setEXAMPLE(List<String> EXAMPLE) {
                            this.EXAMPLE = EXAMPLE;
                        }

                        public List<String> getEXAMPLETRAN() {
                            return EXAMPLETRAN;
                        }

                        public void setEXAMPLETRAN(List<String> EXAMPLETRAN) {
                            this.EXAMPLETRAN = EXAMPLETRAN;
                        }

                        public List<String> getPROPFORMPREP() {
                            return PROPFORMPREP;
                        }

                        public void setPROPFORMPREP(List<String> PROPFORMPREP) {
                            this.PROPFORMPREP = PROPFORMPREP;
                        }

                        public List<String> getCOLLOTRAN() {
                            return COLLOTRAN;
                        }

                        public void setCOLLOTRAN(List<String> COLLOTRAN) {
                            this.COLLOTRAN = COLLOTRAN;
                        }

                        public List<String> getGLOSS() {
                            return GLOSS;
                        }

                        public void setGLOSS(List<String> GLOSS) {
                            this.GLOSS = GLOSS;
                        }

                        public List<String> getPROPFORM() {
                            return PROPFORM;
                        }

                        public void setPROPFORM(List<String> PROPFORM) {
                            this.PROPFORM = PROPFORM;
                        }
                    }

                    public static class CrossrefBean {
                        private List<CrossreftoBean> Crossrefto;

                        public List<CrossreftoBean> getCrossrefto() {
                            return Crossrefto;
                        }

                        public void setCrossrefto(List<CrossreftoBean> Crossrefto) {
                            this.Crossrefto = Crossrefto;
                        }

                        public static class CrossreftoBean {
                            private List<String> REFHWD;

                            public List<String> getREFHWD() {
                                return REFHWD;
                            }

                            public void setREFHWD(List<String> REFHWD) {
                                this.REFHWD = REFHWD;
                            }
                        }
                    }

                    public static class VariantBean {
                        private List<String> ABBR;
                        private List<String> LINKWORD;

                        public List<String> getABBR() {
                            return ABBR;
                        }

                        public void setABBR(List<String> ABBR) {
                            this.ABBR = ABBR;
                        }

                        public List<String> getLINKWORD() {
                            return LINKWORD;
                        }

                        public void setLINKWORD(List<String> LINKWORD) {
                            this.LINKWORD = LINKWORD;
                        }
                    }

                    public static class SubsenseBean {
                        private List<String> DEF;
                        private List<String> EXAMPLE;
                        private List<String> EXAMPLETRAN;
                        private List<String> GRAM;
                        private List<String> GRAMTRAN;
                        private List<String> TRAN;

                        public List<String> getDEF() {
                            return DEF;
                        }

                        public void setDEF(List<String> DEF) {
                            this.DEF = DEF;
                        }

                        public List<String> getEXAMPLE() {
                            return EXAMPLE;
                        }

                        public void setEXAMPLE(List<String> EXAMPLE) {
                            this.EXAMPLE = EXAMPLE;
                        }

                        public List<String> getEXAMPLETRAN() {
                            return EXAMPLETRAN;
                        }

                        public void setEXAMPLETRAN(List<String> EXAMPLETRAN) {
                            this.EXAMPLETRAN = EXAMPLETRAN;
                        }

                        public List<String> getGRAM() {
                            return GRAM;
                        }

                        public void setGRAM(List<String> GRAM) {
                            this.GRAM = GRAM;
                        }

                        public List<String> getGRAMTRAN() {
                            return GRAMTRAN;
                        }

                        public void setGRAMTRAN(List<String> GRAMTRAN) {
                            this.GRAMTRAN = GRAMTRAN;
                        }

                        public List<String> getTRAN() {
                            return TRAN;
                        }

                        public void setTRAN(List<String> TRAN) {
                            this.TRAN = TRAN;
                        }
                    }
                }
            }
        }
    }

    public static class MediaSentsPartBean {
        /**
         * more : media_sents
         * query : account
         * sent : [{"@mediatype":"audio","eng":"\" ...on <b>account<\/b> of the number of pine trees that grow in the gorge of the mountain in which it is situated.","snippets":{"snippet":[{"duration":"11300","name":"special.2010.04.26","source":"VOA","streamUrl":"https://dict.youdao.com/pureaudio?docid=-139385106736947527","swf":"","win8":"https://dict.youdao.com/pureaudio?docid=-139385106736947527&dist=win8"}]},"speech-size":"33kb"},{"@mediatype":"video","chn":"我们还应该注意第一个创世故事中的描述，说他们在上帝面前有不平等的关系。<br>","eng":"It should further be noted that in the first creation <b>account<\/b>, in any kind of unequal relationship before God.<br>","snippets":{"snippet":[{"imageUrl":"http://dict.youdao.com/pureimage?docid=6315912264594031708","name":"耶鲁公开课","source":"旧约导论课程节选","sourceUrl":"http://v.163.com/special/sp/introductiontotheoldtestament.html","streamUrl":"movie=http://dict.youdao.com/purevideo?docid=6315912264594031708&auto=true","swf":"http://shared.ydstatic.com/dict/4.0/simplayer.swf"}]}},{"@mediatype":"video","chn":"通常经过文学分析，会发现,最终版本都经过艺术加工。<br>","eng":"Literary analysis that is sensitive to the larger contours of the <b>account<\/b> will reveal the artistic hand of the final editor.<br>","snippets":{"snippet":[{"imageUrl":"http://dict.youdao.com/pureimage?docid=1354883003772870612","name":"耶鲁公开课","source":"旧约导论课程节选","sourceUrl":"http://v.163.com/special/sp/introductiontotheoldtestament.html","streamUrl":"movie=http://dict.youdao.com/purevideo?docid=1354883003772870612&auto=true","swf":"http://shared.ydstatic.com/dict/4.0/simplayer.swf"}]}},{"@mediatype":"audio","eng":"But users are charged if they try to spend more than the amount available in their <b>account<\/b>.","snippets":{"snippet":[{"duration":"9500","name":"special.2009.05.21","source":"VOA","streamUrl":"https://dict.youdao.com/pureaudio?docid=3489381727482543878","swf":"","win8":"https://dict.youdao.com/pureaudio?docid=3489381727482543878&dist=win8"}]},"speech-size":"28kb"},{"@mediatype":"audio","eng":"He also wanted her to repay the two thousand dollars that was put into her bank <b>account<\/b>.","snippets":{"snippet":[{"duration":"8200","name":"special.2010.04.24","source":"VOA","streamUrl":"https://dict.youdao.com/pureaudio?docid=8361486732036605144","swf":"","win8":"https://dict.youdao.com/pureaudio?docid=8361486732036605144&dist=win8"}]},"speech-size":"27kb"}]
         * sentence-count : 6
         */

        private String more;
        private String query;
        @SerializedName("sentence-count")
        private int sentencecount;
        private List<SentBeanXX> sent;

        public String getMore() {
            return more;
        }

        public void setMore(String more) {
            this.more = more;
        }

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public int getSentencecount() {
            return sentencecount;
        }

        public void setSentencecount(int sentencecount) {
            this.sentencecount = sentencecount;
        }

        public List<SentBeanXX> getSent() {
            return sent;
        }

        public void setSent(List<SentBeanXX> sent) {
            this.sent = sent;
        }

        public static class SentBeanXX {
            @SerializedName("@mediatype")
            private String _$Mediatype87; // FIXME check this code
            private String eng;
            private SnippetsBean snippets;
            @SerializedName("speech-size")
            private String speechsize;
            private String chn;

            public String get_$Mediatype87() {
                return _$Mediatype87;
            }

            public void set_$Mediatype87(String _$Mediatype87) {
                this._$Mediatype87 = _$Mediatype87;
            }

            public String getEng() {
                return eng;
            }

            public void setEng(String eng) {
                this.eng = eng;
            }

            public SnippetsBean getSnippets() {
                return snippets;
            }

            public void setSnippets(SnippetsBean snippets) {
                this.snippets = snippets;
            }

            public String getSpeechsize() {
                return speechsize;
            }

            public void setSpeechsize(String speechsize) {
                this.speechsize = speechsize;
            }

            public String getChn() {
                return chn;
            }

            public void setChn(String chn) {
                this.chn = chn;
            }

            public static class SnippetsBean {
                private List<SnippetBean> snippet;

                public List<SnippetBean> getSnippet() {
                    return snippet;
                }

                public void setSnippet(List<SnippetBean> snippet) {
                    this.snippet = snippet;
                }

                public static class SnippetBean {
                    /**
                     * duration : 11300
                     * name : special.2010.04.26
                     * source : VOA
                     * streamUrl : https://dict.youdao.com/pureaudio?docid=-139385106736947527
                     * swf :
                     * win8 : https://dict.youdao.com/pureaudio?docid=-139385106736947527&dist=win8
                     */

                    private String duration;
                    private String name;
                    private String source;
                    private String streamUrl;
                    private String swf;
                    private String win8;

                    public String getDuration() {
                        return duration;
                    }

                    public void setDuration(String duration) {
                        this.duration = duration;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getSource() {
                        return source;
                    }

                    public void setSource(String source) {
                        this.source = source;
                    }

                    public String getStreamUrl() {
                        return streamUrl;
                    }

                    public void setStreamUrl(String streamUrl) {
                        this.streamUrl = streamUrl;
                    }

                    public String getSwf() {
                        return swf;
                    }

                    public void setSwf(String swf) {
                        this.swf = swf;
                    }

                    public String getWin8() {
                        return win8;
                    }

                    public void setWin8(String win8) {
                        this.win8 = win8;
                    }
                }
            }
        }
    }

    public static class MetaBean {
        /**
         * dicts : ["ee","web_trans","blng_sents_part","exam_dict","auth_sents_part","rel_word","media_sents_part","simple","splongman","etym","phrs","oxford","special","syno","collins","meta","longman","webster","wikipedia_digest","ec","oxfordAdvance"]
         * guessLanguage : eng
         * input : account
         * lang : eng
         * le : en
         */

        private String guessLanguage;
        private String input;
        private String lang;
        private String le;
        private List<String> dicts;

        public String getGuessLanguage() {
            return guessLanguage;
        }

        public void setGuessLanguage(String guessLanguage) {
            this.guessLanguage = guessLanguage;
        }

        public String getInput() {
            return input;
        }

        public void setInput(String input) {
            this.input = input;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public String getLe() {
            return le;
        }

        public void setLe(String le) {
            this.le = le;
        }

        public List<String> getDicts() {
            return dicts;
        }

        public void setDicts(List<String> dicts) {
            this.dicts = dicts;
        }
    }

    public static class OxfordBean {
        /**
         * encryptedData : TNvL5RvzrtPgEpLHE_NgThWwwkxquWqw-vfSABjPoFNyL3_S4K0m21IsczBUYE3Ukt-FiVGKQypHwLkUAzoIWeFEkTDRjFdRKhzCVwelaWii-o2uk65pOT2eRfQ8Mr4zxzolxNcOIQC-VhzC4ykUDj6eGS1x3OfN3mN1DzTXg_52iWoZsRBhstm09kSW_pb4jsc-UzVgASFgWRuitbZKn252KYFWOLLWuV8l3xnVCJTqzxRUZlPE_hvw2_L0jcUktmuPwU4t7bYvqzjPuXVJ5qu9T2W-rTHC8fhM_00CpkBp7TiKH5apQUOQ04YS-S3iRqYRi-L225937pf7Jeau4fWXK1JWv7A-cKg_IEc8hVe27csfOyg2Hl2fFhitvoqjwtIPfdCQvFpBtockRLRgMERRp24D5acCbhXukCT97k7jxTO07ALjbUC55WZCQUDa38r9B2YyFcOx1-LNY0_rDgr8ry3WpFcT9q_CuIhwSjYi7Vurc8ynCEukQQYRwyP4G6jpqfRG9fLN57axlunamEbtNNsMkqjxYNddBSaCKkV89-cfGtfexjVPbkGLMIu4aXVlFN-Sn9UIo-AoL6g-QRyUNxjJblDa2wpRiZv4wp5iKvdPFEGWTWsRQOCH4OE2fjtv3wq811vZr_ntww807A-oK-FJL7J5ZnKb1w0sbG6hRTJkscLjtmfZGPEc6BCooQEQD0SBJYqDAYSFCwTJMi5ZfipTonPKjsTUqrEbLwRtOIwtYa9TqWnThVVdBmvDF18Z1Az4X-bcaKvgQ7gQz6iRHtNt_Ksq9r4v5QXXV-V444A9sILLEeuEgxIy_dN6OSEfqv8DivJePN2CgUVZ9s6S6ZBh5jfzkrZzq433UMCWwV1xrtwzFm8qVESWiIC4e_F123dtyumliUGTuCVaRNWyU-ZeRE17KYqx4qo6t_aJ3YvOis5SDxK_J-otr0sbx6m3OtiShmc_MXS2n3xelggw02tfW6uQvcybGCnc9Zt9B3zd0o9qCyh5wvgcHv4RBLKrpJl9LvFARN8Gg4B_NAcYmX2wXQFGObKvNXatTzWHDBtu0t9DIunQO9Z0KNGKpMCsZASz0W1D6UlPC16IyNWqT4fW9azZKCX-DX4a0aNyNpPrQipmyYrYiISoGZ9Cs9JgQzyio5ej-D_1UvRMnzq9RsCMRFknfURnruwD_CYunhzb-jxwY1SzfhgSU9zeq-vzR2ye7dUAAqrPLN1gKb57OyoqbvpClmXerwE3OtFxu97BTeR_Jb_U-_V-FcTIjxA-lm2btGEDjuAHbGUsdEsUzCvI04u3hqR9-vnPfDqUk7tzKiiRBHUojMLWr6g8l51Eot2cOJra-XODabkvMyhtZ1H7TzFOq8s8TBw6do5lRtca4SIdigVbv96J9ZoVDTrC304XXV_-WVA4J02ZEsihYoQL_Y4z_CMPKbbqIdaWuXDoxeU_Y3UQ3QBiA0Qtvj6HNFMkhLlXplB4PnT9Z-rjd6XR6GON0bCf1LgsvwfoAUt_hvUd6ezb2MSjetyQprTfXARXmRltn7n3SF1L-2EgocfGW_a5ugZj3-aNnKQkOpeH3k6VkCcohcwVqiUpXApepoA9s2BsRB5W-dTnDTCPaqnwS8WrXLo4Urpx0WVODEbKBODlRUxuJUPm1SPGfFmIyvZCC4K_Jb9haELxilYedZGk3M__cfBt_BjCHuKr1hLyvWDFZjgg1ZZ4Y1VVaOqWSZFu1kXjwUtWLsBxqCEn_BSgbQKyohBaaeLONO9i0n4snFIZV45-a8Jps64ob5fJG-HL9iAhdx6_yhSw80UPmVSzRaDOfFAaUAnxNsr9pFfhDONnpWePnlwU25N9duz20V6dJaurtVVsTkmYj3w2C9Bl01toVzOCTe29fO0sRjLVdFQ1SWDQkfQJxgrb56IpigAy0acuApddkyNRs7xl8JpEJzu7NvAyucScIGMwkJRw7Fxo1wsjPVZNIGPV1HQFxHpcYRp6E4ZzC2_wvknJl2reQ7oVoPGFH4S8ccIxzCH-2cwcSDm0ud-Nsc3hdGM9280UaTIS_j707_Nj3xMSt0aIFG2QoJ7hnRI9YwkFvRzeoKQ-UcL4TAch0wzjRPABeREcG7mo8RTiWB1U-0IupmXUVHTsV2xHxOZRJfVMzrehmAwyH5HLCbKywsGTgVXDaMVlaxWAdJsDqe8Xw81If09_j3cPCi1CX8RjLbXBZ8UXgutQZDZTAbYtjTFvEdmHaavcgE3qMoJtAX_v1l3F7kVSkpDmykU7yH5wgs6K1D-__QIdECQSJg8Dvw1heJnUvwWQmyiG55c78TQtUkAe6eHVZ7gMO4NoeW9RQpFFSf-TGL-t9jcsdGvgn-qerunDJhhYFlsFvLh9rnN4BFqUcJkChkxiX7gBxy4w1eiD7PucTHA5LD0hgiFcBsBuJCRm_j7HFuPdAQLCzHcn3v9xKCsbao7T1BDpFvwyIgEXmFfXjHsq3I5Avj0CZFxFRb2YfMnevkz5NaxtLbMfv-8GDLUF3dOf-oazEHGGCvrQW2CFupM-soLEbaEszOnJHfD580K3kvsYrRh9ythQvqt_gWPZnfPlp5Kd71Am1qUEWw3QMAS_p567dTAbr8e0o_vZFlxi12f1x6pDcWqgxFyM5xwLblu6i6EHZaZdAf_-0W_IWjYlkthiSQ2be43B4zWPe1gPlL8zvlztRPZE_U7AddDVITb3MOmrU_nk7CgO8G9gsBMzi8mAdqGkOZ3A-0SNi2abnFHhjpcZHuxRCVXsyXrkQa7xSv9fku0rXoAEhT7S1QVCwwW-mhAPjVoECLFdob8vECpbEoSaoIDnqhNJnfLDHEILEvrTrtim6yjI1hnnLM86ou6-P1waNA0QIGxCwMe4ANP11_QFg18LDLZRV5rkso43xa7Q3hsQBa2CSHS7emGMKvdeGXxa4rC_okhAOKCpP7hadLwaE3bNRWusKstkowC-eQXo5wcBXS3YvLVOsfkYv5-jJyU1AXceg9Fi8PuuVxhslLv759jesL82kuhptzZk2NlJOqe-AwWbdLlK4aAutzeXPD5-nvH5oxal8RxlTz6yU2KfJ10dgvnjRrhjzVGrQ0kTzVZaPnQFajKY8oQoSD_RoiPua2a3zgPN-P2cfIp6dDNtcweN5QT4HZ6VSnCS5EaRHUklf_RAHBajRvhctIb4r5_M_VubFwtg4usJMlUkgodyMVN2e7dXYO9WeB42sKgAA_GVJWsNuag9fawc3fZzIdWr7YipQ9ZZpvb_RObV7oKPapJtwv073qVM4bSOXZ7K8Q2gbLhY_CF_C7jhrWf-fFa7MOSI3k1C6cRe_30M4kW6XU9k95GbW-Ap42rMJ2u6YGdMLE4zZBbw-HjnjwUgAHaSSm6-XLzGkZf_lVQIHnCt-MUKagcw0eWysifNr1Alagkr5pA9VY6P8YZxFpmKFx7lxy_-bsCbjRJCIKiW8KsG_t3MSjuBb4VLEE49kiNrJBQ-s6m9ddueObRVKnz_zhfMBfZ4si6tHJpBHf29m8ppuq0EoBMFR4iPJ5-Y8jOqBLrtsTv3hBCT_wZKctcjzhZ3OIGYwf_tufP1tC9_EG1v__x-sA5-fyZzkac7WWUF8qvFGdcCesk_ZNOdzsRVMRBd_8zD2IPyqayb2q91JzLJcYw2L33ilNvQDZkPVhNjCVAf0O5sb8hSl5d9-X745doVX1TJci8XfiZpwuiOkZDiU3azW5ndaS4XgyR_BkRFzaVj4GbXWXa9NWVrsYLmVYSt7k_pYH-cSepMQU_Ca1E9MuXLiyuV88J1Z53v5j6wdSmbfPa83QWJcXbJpX2upL9lyqVnjwht5YqAVZ8Ap8pbiPi8gvnEPhGC-pcKnIpeQ-BObltn2mT0sLKOPGnSb4WBQE36Gd3flPPv3EhkvieNsQuysxevvCGQabbFFMQp00oSIfUccRawL4Rzw4v9URM5hywWgsMevkwYiqcrJxRZuts_L-ABL_a2fxE3OgJWQomD9l-8in9iQATR8_s9xczoVgVov7WUZtaDcuhARHLogSLojh7CryD932bHI0R8smeMFXGkpb4_azrQ2qv-btI1OBWR09_uqdr-GIENyI506fVZeozwZMdloPVd6ffeaauHCHlZPZzoEnV4aF7NsiTsN3CR_AE17whNn6y1GqfvO8CMJDME1Ly-WKBuQ0lda1A_efhS0nqebincT-qHs5WMz9Flk1UM-CAlRxxmejNgLET51kZeZy8e9n4jofbEL_tThwmEP_QSyEKr1BlaC6a3Ia4VaaQ0VV6NvuSQ8hSqN5HXi1--W6M0csR4ufsBIx5aOXh6_omtLO0-uBkkbpndLDz5XqHr1N3KsG3ZhA-tltXhIWu2v-l7tj0GF_kgvAYdPULNgPUbQcvAXt5MG86rhMKIxNsrV15KeCfqiTfsciK4n64h7ttYwreseIe5Oj1jSZELYGHo-WeLL06Etv3J83Q87IdXNML0T33amTmb6RRSrobjzh0BdE07d9o8yPoOD5Yz2x31S2iU0ogUkjOqluyyo3lWMy-cyxkLl689MylgaTPUfMNRctCcEByGbHbRCdRNG-KYAaEej82UnQp-A6G5zVwdb0tRV60uqOwn6U7C-j3Lus7g9UVuhV1RQCKMg70Y9Oob9JtcLXxBwuqnFj4eBew2Pyt0KK1esMqBSKl0xhvGs_RKFiKV2vmiz1NIpOVhj6bCgdNfgp7yG97fAIlLRNdSQCy827k1tqdspgEPFGk83Y6qakkvUG70QOmnrQ-CR5AGX3_WsrVbSrQ_g99bd9suofb4ebv5hRgsC5lSCXiliuc9syMWLEo7lY0qfAIz0WspQ_tLU-k9U11HGKRoDFdmFmvyQ3l3CroWap1lzhmRGHmXlUkIUzZH5jfEBcrlxnC39KySfxupz5AORA5WCCaZOp5_cR5rlmRt2sg6PjG0Bj-r8fWCJH8jOhpuplvWQ5CQCtjg6zkOzJqOK3dF0EYfHLclu1wmHBDJLGd2fnUK5NP-ssBguxdANFi0f9KcNxTe2827t_xqNdpN1FGugPMGlbL4xKvfEiDmPi-1Euz7_1j9bqftXZbg4ZgyNW8rZoCvgGNsfmzuR4nrmbRYA7n5LhRh2Eczr25TFWrNShXUBjWJItPKg4vgr-42gFweyGyjzTbmL5X026ZrIsGUzMFmL4pvLlM2crHv_WFwtpXwZXTgqVcjvaj57Ucq_PafUDbYCitouh_wVWXynhFqIvNxlQpkkS8syl6geYybivBQBqPnaWoej36SAA-lRuydDqMIMMpMFyt-0T4s66C5_7ttbRVagBlGnFnYsmjn26OOSgp8VIYIBIIJPnXFMjnYhVlE-YlQUz8-KApmCfo6rX_SJNldBztocBS3w1jZxRCR1_ZcITA7RPbap-xUsNy-uVfUwnXrHj-9mv6gYBojrEELC0OdHvk-a2PJYPsJ9AvGx8D0JY-RsfM-LJw5QhKCLmShUBt6qwUQzGNEQpzSoOtw73CEYj3DKIUwdb6vrdFomD7_HDD1pPp3kOM1RjlCPyvxuNROLjFNyiQPPPoVYUwX_llz_H_gx8Bf8vUTOFxb47b3ZWA_lAIj30A_TrO8fful870VTtog0qKdL_7eE3iAn52bbljN7vbGlSp3t5JoiHoh6zJXMrIRuEUe6tz-_fKeRQL9TzR_pJr50WI4C2HQplVw1LFlLLIID39pxyaZ7XrzkHpeeoHfhCtnYbvImEchi1Wx8s59ZGjGPDUkUvzgfUMGXGQnCvRSlB9_A4o0mMCyhRb0Yhg0L_tzXg9z8zB5QcRakGaxwXvrXZbutRRASu2itwWCJHi4ryIMqOdus2yNMYZ-8tJB2kgD38brgvBrMbGlpRyLJOKjOqXqMJZB23g9Mh_Kp6zU-djS6UhisAi6YpynY6k6reUa0HV9Q5XaNk5dGk6PU9LfPO9jIBUnBsRY3UGQtTpdtY3S9ZHMlWkA2WEU3-H4Kgi5QTaYYIYJBRhqKHIXI1YdBFO4TuL_FFZvKv8jt4so_MQTUIu7xuyjnkHON8lYV-BGHSXO4Xd4C9wz09gAaTDq_OYC5RW3XmNiVkZ4i85rRLozzReIo1wRMn1Lk2VbUDWVnf32zZDugy761jltqp_3H2Ahl92MqnpfAh4zH2mCnqwOw5RluIR4FCb3Cxn9y05wQmIALM_n2aFI1eoQPi8hLFqa3EiR0SFa6WLm-Go2VQL3wkAmARiND7bPzs3NFTFPvV0W2d8uRoqt-xTA8bnMt60fBByVuMmxqQ9-Ephl3VhKqJdbtxHdk7HUqgdgLGpQxZhFzcfmf8LRDdgnxJMu14FRnD0vJ0JKg7kkxjMbylKWcbS0v3pngoiBdT-ZnDNCeZcNbJp-7VFUmaPwR8TQJT1qpcfdYLAQA_5WjiU3GYdBfJo4USvtLpF9fPcD3VeelZbKxb0nZL-KFNvoi-Og91_nllM3fmkOuydIMGIMsY8kskUJMpBhrun_tU6UbFhX7z43ZI6alDAHR-9kAqYJNmbpSzSEy4G2-wt1Lr6ak_6X3sNdSJciW3KeKnX1nnerkYOz9jmGpDd0Fc0cbtrqtogtPpxNvWqIWEqUBVPX_IzG7BrxfoYvCtYGzyBRM4OYCjY9VnGzGZfAaRJZbi-rxrZ7uJxu5bZJcegwNN4GqsydUEgAwPdTsbd3OEYbTB5SDFsIsWUxviHHuavHYhjZQSxK2vSIn8Se5Syce2G45jXljk87pR9x0bdYm89mt6uiFw3kcebfFvScaelvpxCffcR4AhIGLRPTGtxfGMU7s5V0M4M0F0c4VgsUVby6SdN-hBTxxQjmxY21x8ev6J2Pi4jpPwE-vboQe0PkNSNCg8kl0-6SgwbWgUlgUtYEyx8_jvTaNuV3rXBiZ3ioF-Fw2vidXyXOX-12ffqjTgNh2uisFJRxD6gi_BKxDMdaDlKTY_xLLGlxCEhyBQWsMPOHX2srqg9A8c0WOsd_dKM6LICgb2UPQK_yscbuCK9iWOUqLH0IXw-M5G6ZhQWmZptuY-uUQT-rSvAb-XH7FXq5pTrKFe9DaoW-JKSg2oT2R7rDFYpd2BapcfiD3CwKwaQF-ZP4YUIZcY-u8g76YX9j5VIrXus_z9-3J8cjeU3SDU309um-MEAwXd70QeORqIhqwLR0N7JFQki2lxCKYofYUquvkgw0FHdA-2N4njjIKommLeDkcsYk7UJb0--VkAndyQPwh_ouQFBDd3d0HEeyuVyby2EMFvXlIwTOh7AyxU-_D_1TDL_AKw0YZTR1yjpNNwF2vlj8mTKBj10wljUsG98BlWRz-b4Eorosorvsum_Wd7mh7McvPxZubkRDgBmjx0IlQTTobwKvsyikvq-8BtLYsqoJ88YpYFpY1mWINIkMrkYI3h8nsrQ-90p1U9cD-Zs8I5q0Rmk9euS9-_QS8pue1BfnB7puF3VYf_7jdbiuGbIRv1O3h_aSIwsHq3qN3xVZo_G6IjHrtalC228Su3dIabla1guZNnCycBPLcztbzRyxkADu2ZnRfSUXlDsZPiS-2afWIUzTBawlT9bbUNU4zzQ6MVtyzW16v35uappxr2Z5YsglXGNk2GkQEIjH-WqlqRY0oofVNjMGojv0xf1X_QSftIlqUS8JiVf2yZphrZtZ9y-T_b1-R_T2esqL_RJQtfuxrNR_biuyQnjt9tluzbmY2qlsjnoPYIKEMbwlF63lC1UipLW0Jdrpa1BcZiYAsmhrxRhfRzj7aiBX4knfpfdENsibJBmFtAamlWmYeakF6lknn4oZMRBi6uMhkrs5leXKLFYozn0OCAiM3kQhwkAngH0fqf4R7snW_h8VSDwdD-xxBYq0cEkgAJpnYGtF9TkVyb2Z-VsfQETqRo9uiXTLYmMlXJ_Xmy8R5lTfGIqg91-M3u6lrVsmhL7xaIBKzWBwkhrPOG8331Sy95ml_05KvBF0KhH1ogSQDzztzqyWkwedh2a_XuccfjjsKHJhR533SgYTaDRtpbmdiD0S-gSB4tgBvoelBfcZgzUzwrBTFZXudYFstREjFMwsCTVym74MvNZ6fEG-QnjVPe_2tkaNJzYSUXL7qf7q9JLVFX1bA5qUNrUCLnMkcG2FB--SugZZbZSrdFEGdL58h2LxTNj5h3I_NlNZ3fOlglbUy_f8No7aro-rQbXzXzJiJ6v9hFB3jBn9EI5yVkYoKl8XgQJ9oELpzcSJCNAYOjOhm9wV3-kL3HQrozDCYAiJ6PkvhnTcPnNh0-i9zBgjzm5ASmwzGaAFjsf7rBuQrPllztIg6xXMH7-8yDA7P3M8Uyzv3dN0KUrrq9cnS4mMxGOAsEzimdidZC5zWVlIAqQ8Ku-QyTmylHJuRvzzg83IG2R8cM7tmmqMJi59_4Nb1z_Cm_y2eZm04Ma20krsoMa4KRSulRrGiUm2cdXTg06RSTUQv3dpiBvr-OJD-uF3Kb24SODGd6ojOC-fZt264aojEyDfCFuRWRCXsYDIYSxsOZSuWmpcjkyrTWkdQ8WnmuHQgf0qKK763pAV4Xlse7K7EyG9o-b2k5jeYraGPeEwpQJCzfZxIxcpFyXJymuMwgHznRbia9uHOqh0WCbpOb6MPkSvL3Qo6Lpcvz0ibyb4Vn5_ddYEEucGKRwOAZcqFd4yPC1l3pC29K_PxeG-fU3rO9jeza3JP5teC5i_Q1D9PdaY4ji8AvGdZaqsgfWxKXN0JXS-9sFOW6OeQZ7hmgHtVP5FuLsl31p1WJzo2_YqP4tg6hurjP3XkRhkpq3SNHZt7XfUK4jJTQVZxnonXgfBmsNBLsTozs47sZSqpioPcNxWRbZYm5BwgGv0a4ANMh8w5Wc1FmADwL3O1KCeIYfrej9r_b14HL5M9A3GR5ZQsEMFht5GS1Uye3huVV0wTy5VdfvyZ5wLG8N0xT5bnMOMt_K_ioKXKp1X0mXjasQG4HUudLz6DPJCdP1ZzlJMRRocHyyv_PletB5NAQdi7Ra1BxdN9IUNZp0gW0YMG5zY3j3ziwkyw0CvodQDA2yX6LDkx_8WocGWxro2hR5RdWrJDfsWtAyGn4fU1pNa3pUMYXrqmdFCHM3zLSxCn3ScUnaJTkwTFPkMRE_vtqwbcXMa_0MDgvCGGePDSiCCASm1mSYt8vz5KQ-D2vNURBip2LktfeOnwgfYmGeEi5zxbxa90WfoiqGDsrnBb8XIwyzyRHMB
         */

        private String encryptedData;

        public String getEncryptedData() {
            return encryptedData;
        }

        public void setEncryptedData(String encryptedData) {
            this.encryptedData = encryptedData;
        }
    }

    public static class OxfordAdvanceBean {
        /**
         * encryptedData : rKj0by9ucBtV2wn4uQ2U-XeeJvpfajjvoGj1G5uD7G__Nzm3iWNI47CjF16r7AWXeOyYlqMJs4o3v5k0MYN2JVN0btA5NeUvDw9a3eq0zzT7URgvLWuDgF-yMndodAhvVPB_T7fafU5DlkE6qGvpPTkem5f9OTyIBhp9JvkWPLRBhDUixdE6RJ_aQTAbXSOysifNm9jepaJUAPSS3n7vXZIAzXgtrDwz7r6jUysRnyFaXiF_81fo9l87_Q-bZYDdhSlLiLWjZhTbyf967C3Aw4N3qqiR8-zkjl1Y7JOgAIegkb9Wn4OOdU1dUJ2NoN9QTU8psHsfian3MVw4Y1DQ_n1HOe8S8lRdvA9i1VKCVsiL8vJiDbkZ1CzCffePuODjBMclTAy2EPXelHQuVRQj3-E5LvcoE-XonVTLLcgZel6P9MhONGizfB9U2oeeIiMTUdvjiQ8cjcwaRZOwJf95JEz2Gxc99tRdvgH5lTYXEVPZGiICGNfV_XMC19lJusLbMN5im2CdvCFNE4BbEEj9YvR-s38kmmJm5l2W0mXvSG07I99MumEza-PZKR0KKMi6TIHV9EWnfGMIOVLugAW7rUxEkmuZ_S8KDx8NDDHS6RBOSGjyYFh5DeLFbciF-CcyrJdJp-4_6JnR5HJvmgTfx94YV5QUM-64I-tGpWBESrO_wuHglIxcNTXn2ba22IPEQzW-ShDoQS6SgXSaBYt9pn1JM-CxvO65bgtEkK7ECi-Z8f-FFk5NFK3VgnT_1A6ZnYTZrOydXob7mkc2zB5tbExkWmKVrWaOKKNlmjU-9KBNcNzqz1LIjKK-ArQ6VUXtVHrKYjzANr2vMNTfkUUrfxKDxY5MAMtTRtt0K1NZjhHSESODuNyGGHI-ZElX3w08KIiycXQIg3Fs3DJ2cinXt-9lRiM6PMKy6JdH3hipKT3L_KILybOpOr11Rh94n_FnVLE7dAye1kncFJxcNXDVUXaTqiOVE6PzvdNDpESwVeS6ZCNfIG1p3BJi3y7BnFzQkd-0apAaO3AhNi6HEu4XjxFbnfwyteC1aMQGTV0lyMrMsqBKTdfWfswShEWcsXMnsSUOJiJCE1-U6SOFyroz2f9ktkbSF3-Bmt6zqWC6tl3I_ku3R9nJErZoxeBfScMXL-OrJR_HiCbOPrJ0BDXrECjdVWRRlZRhadUCa1vvB9Uv3l9yW8LhnklE91gv2eel3_x7VUcyo3W1lYEA_puizEDaFY2oDPfidhcJ8yM7UI7vndR5NJpf2nywH3-Q1gepqqEGCKYVB2P7v72MJSKApBpTg7o7r_sOElwnZZcLAuB1AzdPrTnMPsV4hItOYI7-LWj3g8k6_jvflFk3Hy1wEnXyy5mLUU8ScaHSpqwKuDskCVZvBF3NjzFvamYsUshTwL-kEDWmQZ7djCVEhGQJoBAW8xr1Dkmjq-ueUaoy-LvNqq0F6akGPwEpJ2LLnSKZsd3DiZRXNjvd-xFi6bgwtDxYkLofk4ZpLH7_aUatxkLw_Z0DWgKdgnpYPWIyHJ8aKxE1TecFYPkR3doL9WCGZKWKT0xoXw1xksLarbKA9Cm3fNTagA28HcvI7X_Y1yVsiqa39_a4CqeAiw4pppn8mQ_cGTqfw5R3X2-y_J0V1YhIKkm5_VRLEj9xhg5KK2MNIIzyCpIOx7sUx1TUsjjvSFImf6-Pb-bxcAUVAFrPEDedd3hGW8Ham-cim8TDAE0BI9ozkeaMd-Li4peduHAFG2xY9iv-xtA2phjhPkWBQCztpZtYJ0udwNE8mgveEyh1apzW9EhUv4c87NJWvowTnNfp_i-jVCAyENDgVSzgug3IgnwN3WBXCiB8gO0Ea_tVV5dv9ywwfkgZHKswowD9D2wqCgJdXPN9_sM9rbKUcqCDzTy3YSkBTAky3Jivyd3Ef60HFaQJg8WPICSrF4aEJJkO6-Gan8QA460vy3-ir11FJ4HQapvGkG0SgvpvziZrV1DgO-NzwO-lYMsAEo_4wubNqJnpp_cOSOdU9uzaW7dKuPitKYKfgc-BkwhjVJTSU9D3CjlTyJcvGSjpJ6X365efLX6AJbGqcJzvDzDdtJoHq9i4qzzi3nQL3mDAqEJ8Z2y6-ktIPfLU45uddehaJ_Cx8ipAa7DJq1zuIH9MPpZMuktcqmQcNOG7Y8sGWyJITyiyNk-EekVeICCZynt1kFEH6ndrorBlzqKeQl_R64QvBvn9nKWVpNu7pDHN_w4nce8E2NVZzEQFwxy5OKbu_tdp7QNO74aqsqG8qTgPbsrWy8bfirrbH3zpth6NXiBlXFNKJQ7l6U8EYGb3g4un8q6gWjACf8ksx6808FmPo2oFrQ8DBBED46Sad6keh3PL4bLFKDVYZYibZu0PYkkvJ9QZbjWZXz4URKrp04PoMy9aK6uLhOA4Uu0xrUmTukXz8zmrQBLwVqwVM3K7eRZEJL9o1Hmp83g6tTuNlLde5KwXeICnAlC2SRvkcMBpUBd8Xl859g2SghB4z-3BsaFHUoq41-zjetMUYbG1ILDGzcMe_BBvImbtNGxc08pgDd_qOUGMFO7vrJa1ymKQrIrfzV4vqGxmQMZ58x6coPkKiMO2ZewcNJhBK-UpW0hUGE0rH9evm1sUpEGttW5aj5hVOj-5JKcdOs41rzaje9d2T4y9hweXZnk9Wi982pqN_FHXujTsLwAqsTv4mmOI8C4z1Q2qqDX_c5LdsFdmaxsl-mePsQ2htWucZoo0ELa8M0jkUJXWILtlm6uxURkiO9V4D2J9LNp7xRWQtT4RNY0XJlSkGKuCYBvQSRaceh_vvRnK59rVhDK_rkTaPFrnvfUzjP10mU3jYwGn8PD7wbdUWg6ym7bfDmBJacZdwHpKfMGotM7f9yFjESH1gzRePS2W82vkU0du_2JfrsM3IBNaIxpD0MpjcyaAJO0QGvNLEjLpgqzawzX9mzkDkPk58XEfn2Gg0Gvx8wDKD_d6woz8I9he71En7fyKvtYDORL0VMn2wlLkcOxkFhz769wwXCToUpI3CK5-uvKwHgjs1mCsJKzO63EfY1sxUX-SE1S8C6MG3SWEic4-CLggoGk1GGsqxBLQ5ceo3MHzXpTEAysLtu-BRpKozV2fqrVzG8mUsOmU6TK6M5Xqt_LF4eJEtznrxm-AO_X5ge_86_W-vC4ZRnNfzTMx4GOTerefxWqje5B6_C-WM_tbInsG-AFpyH3bQ2Ng_KewHOWhLZd_fzXKHJi2JctjmoiXGvNZ4GOFoPvYqVFGMPOJPu8-9b0ZW46I0cYDvG0UakcpnjNTxmEH7w9UJ520-kQe2vIEC3kRwe3GgHGfHrrHJZKc14sitFtlL2v8r89bENmL4nVI_4QomLzvZbUYLbLpG1G4EF0UoyoIP5dnxC7H-DaLwLW3HnkEUAFqj2MnXrX-6PwhsquDKpV7-PmOSsEtLR9g3yoF_jobW1N_0mQcOZngAr-r0oOOpEXm5L9fhYyI9gn7L77GI2hbdI9wtzn3n4hlBke3heHuSX6MsdroVLfsw0uDLCgTuBo3JNvwzBm5-3wtAQguEynG6Il9-wPLql2PC2lXAj6okrAr2TLrqGHpoeXOATX-aPEy36zrjO5Z4u_1IDb33wjp77y1TjkQCt7cPGvZFYHRjDVR_dcDW5lnFI7-QVaLXsTg28SHPUMgwNx6VTwoRblIFECf5Ss9GcdUu1EmLUu3T-Rs37Kpf1-d_IKIkvDus5XT2XxXlrYod7lua_EP2auNtCIrq31tVYlnkUPhxhjADa4TkXkWrQvcqiRoqA3p7PKRTEGlqQ2scFxTVZP_mK6zblTpI9i0_wYLvx47MnaahP4ctPbKzBmQF5E2oA9CFvRwyUSZqhemiAEQ-CBRsNj76JH0BmSz1GgoE5z_bUTqAB8f8zeQQH7mvyI2eM1qkV5WW4ZYcIMt9Y8y4mmJvh-ee6XAceitTKRZHGI-EHDZGleC7OC8FjUlZkZI_H1SSjvTC3b_ecPCk1FaFF8GG-PEpBoRo79GT-Gi7Yztr4vDHHJEJsSzY4A6se6qvHfiw0VcWXpys6k4tOkB966S7mO_UbjgolEJDKTsC1G2P2Hq_8v1I3Nndjb1jpmJrJWbqQc2apzZV1eNStiKHuSWbnaILE5GuGSvbyZJ7SfIyM2X6MOKfHRh5Mim-TtTJ4pWReS7zhC1h0VS5OYiWNvOKFP7GRKm-bviq9giX71iOjctKNKeR4sDnYRzY25QhvETBb_jlzQqHITnpx9Q64ybwKZe7UhdSwZ_BgfTqljEQkYJsC2W3sHehHbJP0FU9U0xaKN2ZoNhFDLqR9p41_0iNplBHTf4CJdSlarfAlDxMi9leanZyZKEWi01wgNmUW1wcX42rxdyOiiag50vkpC7dkIcXISO8yz-zTLXWEIT_fuwBqGb2M3f7YjxKxycyMZdcm6F1AP-hx1UIxtJnN0ovrUirx8MD2bZcY4RiVoqZ48Y3vDD3l3NMqbEXEHI-_otktWSZGbc0ieH1iD70V0RSZg8KdFTNo0VVMSlaSOGqJ_XpCGMn6sQxFRel6wDVgbXEj10PTom9NeAiDKYvuPANg6FpnRyzbOdOraT2Ol3scdER-G8HAoF9QQpHgQtiEOvD-4az4t5x5NF36POX0QBoVge2A9ae6Z_fjZm3ZnmVVWjojdRVR-eggm8zwduQdXNQy-0w-l9moQuUK7gON_Yeuc6-3bhbPpZ-CtzXI7R6TLy8vzXvvlpoWypZ9TJfi1l0LHD89vr7_UPZiAx8ZNMUw1dvrBFnY-_oibD4IfbbbGfjrarXXjqP3lseAP950Fx-TfY6EHXjG9gpbsSQOI7-4WXKSIdR2u4ZfCAynEKGZAO_mPSb1EMm6aMr9pBjvcmapDNYZ_5_p2QitQbxe_79kOl3tKrc0q-_CR4gnNM3CoVGB1FJhYiFzVpUDlQQJbC0qfS545HWab58l7OgJNLXcWV4Qs44BzSOjgcIqqZxsLtnJCJ2jK67N9SGkvImuV3KRtddtfxrb_GnsHO9JmVvYAxJ0l9EAfX_eDptDp4NriFGas26DLDKSCB9l8YV3GoUi8cSR4yfD99AAxLc76-V-fJXVuKSNdbts6VRGgBNbFfv_vJvyqmwAH8DV07cul5zGIcdn9jPvLK4rOs3LxT_-de9DmH3a2ejVTWuUwZurDJ6OhAHbf1ZovaqNQTGnWrDa2euFzgHisSGZeL6xtHfIqCWuiBSuevjNiGOTnT1LIaMNqzLkysPCMGT0K9yno1yF52l2OnJOr4v-1rKA8f8ozeBWPv8k0ozqGobQ3-WvMfgUMgMAbMydBeo-gVukMYt_E2nnMEQXMfo7BA2s9fQEcKwzO4vdhgvTZ2fTtWyT8qoB5ws1TgtWJPENlzue1FcfzBx5AXs7HlO_pTrMTaWZk9yliiKaXzY_Hopz-iCj-ta_HTqYyWCWxzG9qK69JWo2GIHiiNBsv6dISFZ-OvmOPDGKy0xMCH0ty94B4JFAt3S7TtXka62S3CuvgNUpsG1hAfSbgAFWPU4m0W1OFV8XLBhEEnB_4_oDTImtUtiAoHTSNmrwv9-OxuutGHVhYMfWVAyxeNNGtzHG3RqOBWBg9qTQEfUqdsZxJ1xNcSus4fdbjyKfxTBlvWu8mOjyRdLZXjsXOZZ9Uoo4Tbtm4_j1cfVI2rsM1mH9ABSsG6kthCrnSgabRVWQvV71RggzKqgN-VdgpNNwUEu8HImxZDKqcYDEvvOb1EgRKFg3E4PoV2eWwNRCST3tWNbD9SysYyC_5gx1U81TqdNh7ALMOKOt5ZdV_4VkWN8APDfCyEY236LFP3rCNQW9eVWAXE8Z9DP6KPrZYahaXKVhGzkku3bXqocLkYLaHFtSITMXdypU2MBygPQaAmahurlB36V7oS098DOLa1W50M0jRRXMh0_8fPzlqr78hhVDKWec_bGw-extn9WbAg6MfxmHH4tN2OuyeEO_c259MmIi7CFU3DOW7ncCN0GxbrrKrZk8m-roEoRtGKUjQI_96Oi1xwcItCXMsiEeljKLRY1uGutqx2cBMEUX4H9m12iQTPJGF3EHcmgCeoyi_MSzNq7hXJcmUO0y9Ez3cCpAuhPFV2VFIl67Txd8-swSoccbFSLCIYuJppc04pZZgG7mBvceGjvhsqPmNW1bhJh0sWAISWf91HocwNGwmos4YTkBKPO8P3Sm5ZsTS8p312oJc2To9x1n2JIZZooSnS34ZMPm4oBaDpdKhAnQsTyKJKDa7Ym356hy56X-KkYJNEGB2tvZyiVE6Q1uCwatryh-5Jiyc_vNfPepA__62cXsTvMiRG5Mraky4aO3OpnBYc_6YYCvyaGQiZyIFcuHsu1zODZc8Wtoos5aHLpDsex9irR2siK6O50fzqgPIJ-u-T8TNFixzOWB8PUuWrSTfvw8KV56iJ5qddlQO7UBo8V32OR2N-G1ij87fXwWYp_cNb8iDUkXiguhR9Jj0HqazzY0Rknas2A3_oOF5AybJpnMgaxQDypw8dedUTIpJJW6ePwy0JhE16bVSBC156Ktd6nKfO_lrFFz8hbZnugJ4WIFNOaplDdZ1G1y_Xt9dZFGIoIG1QfWimwtTDeU3janN18AJVgNSBh8AziSjqEpEK2qkeepsAyPiegmwjCvRSWCVvrxwJtF-UdLXu-frHj17lQi3hRWeIlxPsWrQQOrlKFdPEnTxTOHruZstlgci9mcz2AS8WTnPQ-1Z2w9nRZ5gVHNzSlNgPKEpTvOgz54fDWqJdw3d8ycX3zfy6xlo3Z6lmOO9u1-u4mac47jgLyCpfGx8Y39J-iKzj7f7aOwNH7xceiXyrMhqonAvFa7ST0GsRj3rhKfSAH-9F2NZI1RvCH2GDw2T7bSaZncSzwJE50wvLQX1PgmCj3ebjCGMFIPt40FvznuJGFpgauex8tJJDQbo2EVcCdYjTediLGw2kFB4vgnfLHZESHekJ9h-fCF3y-JPHYjiuDim9U5WibXP78icP9o6kQkAe8hmEmTvY2rRgfAp5lUjPok2aZJvV91qGUMvAwE4ZMisiEe0295KuQgYzel_9PVk4wuPL-eNtrXHsLDzaLEAU-CwLMMQerhAiWKpqGu8jvEPAHokeQCSVCBfzvHpi4e6eP34AHTixwkASQQEJsMqQ2__96g8G7I1iBKRi-uHjQf7sNhKAcQkTXArH0cl_L3sd_jsPBN6W2RUg-6KiVrr3ppW68dDAP7dZLkwLovwlkmC9FMH2gGwln_54TE67zome9fdOTr96uCl5_ZmYyTfGeq_KBI_VC_Hm5d07qLbR0e3Y0qyJnhHxU4L99fendMVOiTNwwyJ4zjgA9D68aZj9oMbeCCdfOWz5DXropS-zSdXDpgSSN87AGc6s7KFXKG18MlWLyPxk0QDbqE8EYEcmYNDyb6jkAN7WXfhW3v9iLnJElF1f0lie4wDYaasVG2JGFoZX9y5SLzlmS7xeTqabkzrbjST3_d5jopelf6uQuqFvGaAn-6aYdsbjepINNXoZeIBI_xzSIpbQVIzzM-jlrqkOdc9AlDY7GjXx4vFI0OeaKFbE2pm7WFB5jqFYnxSsTI847ux-OZzKxSAyfvPpzvTt-ESBdzCtP78dMtF0_1aVz8sjbDCy3_icAZaVZZlPk3w-i2rANxobzcSoxGO6C3FVDKDyThfPNvBazk9caFR-JX7vwwwkatuL2qiUT-aPEKAbK8hO2uNalTHnfhnB16FtMfexp8fSn7qiLBeL0XGoc2qbbM-5-ogXm493s-LUZmJgtHk6rpf7TD6gHapJjZbZKY8SqZZ_uYpWUtc2nFvQ2XRgMi4avn96k3JSd6aM2LRN5-JsOyyqPrYo-d2I6Z_wFmE74l7-_Lf5gtXp4_N7j_2wA3vDbTnz1xRoi7_vykg2zlhHkL7jnVCxP3Rqf_lm3-Rxw-9J39WXdmc5mSJRyfKoqRCk2VnkfHGwgu67955iqh8As4MP6V-GoljUHzrA6Ey9JqHtBsYISFQOxrdO-6KsdxU7JpmQ0szmIhXmkoU996Z0WLPt1X6EpVlz5zkiZo4U8SSm-yWFb4CXedy2G33nbpVb3ulANCY8KNFQX-dPJ_8uN4g5empyt-6Y1r-_dm1QrMkUMLu0avqoOmHT69whc0z1FXAMgIfVIpfYhQpHBSxyKjsbuYo7VM9Pt9-zVNY01t-O2f2-k-Nhl-AaMlk5dtqv3LDPkiE_kVOE5p9PleKY5kz9CVp-HLQQeYXLAQC6s-n4VHOzu2bdGaX1AqUV43wPjAQ7PnVp8dPGNKKGYPnVgGW-z-QB1zI7yxQe_K3vuQmIm1zggwFkrJQQOeBx3fQxIJHRDQROTnL0XUjSfoou9fQx2Vz_V3nQX1TLBiGSWBA0eRPUzz6wSdaAF9PrDhcmhM-fhMeSe8fSktZyAFq5YOo_C9D5nH8Du3xlZjkuS8n6WVEhadaWQNQ0sbo7uGMyJ2787daHBVbVYPrMPyYinfFZg-XnY5_PKoaeP3Rj2yA8kMH1HBNtHX0rRvtrEjm17K0fS87_wVLytyhMlfl6yAULCasd6CM6gqUng4w8cO86ir7RywaV8lz-urWkPdhl3nHSqJToHY0STJP3HylEiVih1mPtt62TFX5eLavr_YftQzYLn2g2W8DaBXzPbZNQTQ_HzloNQX7SCI1vSG2N7ZOOiBorxxiIJx_G4HMFjCx19q_nnH6_I9hl7X8ndB6g13fld1pSqYu0iBOa1IO1xrngNlo8GcWSqzqFVKjNeFpRmeDaki0wKSOFDAeTU2mFgNh6CIfcHz_pk0m1tYSeGj9Z5WWperi_wfGO8VwWR4SedKb_UxmLuO7LT5PyJ-xkXckNUseceHLMI-0TB0Le5GtyVqzjghBtJbJn6MFKgKrsGQ2peyIVdCs0FjqLrf5nUIfu5O9OBt9L957rWISNiaTrWigMP8PfeITPWlT6wp1zbFvrcty7ihl3cJkbFYLInQF1BpbbpDQB0Wc9Jx-W66YHGKcoEG38ZMcrtEK0X12qo7v1bOK3Ik6rAf6zaOcMnafCYFLeOvffZH-ysX-GAfo6v1xpvZe_0LqEa5hhg-QxXSsPRN9MCurL7I3EeH3H8Jqt49kuk6XYWzVmbC1jH7hYO7XxjCBtKWVzAPyP_r_lcsUZ_kbTDEU1-MYR1rZBUQh1-uiPxqgXUYWB1sSwO1g2eUaEyoBAIZbL3cv8s-ywJKXusC65MrKttjuTp2IUCJAmyGurf-ZA5w4esxL5zVqHNylJMIogQuP06GiyohRiL88ikq2KO6mgSWTs3PUDsVkZXXsku-Sd76jn-1_Qvat926BfDAct-cJEHS0U8a4SIrE92xsP6pwk44NBn3sIvGyg5R2T1imTO0hkTmfGAfNhMkY2IPGzIlt81_7AuAlC7eLJN0e_sQOSgJq_sWtnqR8y-t2OnLG7LvQ7m4Fswopx_9JH4qhlezKDChQObpYkNokwJu8cARj-uAzNTzrvmQMhjdCxaqZ1WK_YSjEiUmzHMj0sph8VsVZ-8gMznxujWPZV5iL4Y5KLdqHxqgHZvf0ahNYK-kkxivhI3hMwtRMVdVbu_0pOZZj6Y7QOT8VaAvu0vMqJm5FJnOh78xfUt0N4V84fth3U71SG6pDoXKZl3NtnZFqE3ZdlpUg9toUMPNAR5-dvM5w4TgdRyOszpFZs3m9PwUN9dWlU27SPHWlXmJ3m_cy2gyyhfAc7wkLytxnbQVbntONfBGyRSI9Ao9usHRwPJ3VLrCF7rzDi25qwv-eCroDTJhLTS1I_DnPEWMyaHxi25UwnWj2zBalXbdEE-JgDmG6eEyik2mBadmn9SaszVlv3YVRHs5LxZ99O-r_AGE5EDAmrYo7jLPQaetWNJks-xShAjfReZmZKu8uytcpNztb_Xcp9ywVrdCo4i2flI906Qbb1v4d3-BhHEtrCeZItpouyDZK6EfDFmm0INwFV2ZV6iJileCfdc4MlYv45Y4-B8kAmGot7iK2n4Cp7voGSI-c8Ip28cfzV6iKRLEgE_7LM9b1sAJpdOm71BaMbS99TdBwQ4cgDiD9JZAptG2Wys1BYiOqZJDVCqQhYc-PZopq_560cfSj86Hf19p7QEfuZk3FawlxwyDjEhawAzQnBUu5nyA_Gn68paNHdNCabyVg6LqFCnHFfxz0zYEWP-yBpcsOc61R0tMqtM5Pkmv_BDCZRooHV0mehFTl-nyYSrFRJPv--8ptLYTM29qgdSbTo-5Kdam49PonQVEhkeshoxscu74MV57b5-I1k08yeJmw0Bw2fSjSl8zY1bj4CeoqS7NxRYH665iHORJUIiJMrQo5S-IXOlJz1fisXACtD0VhjOEIxfgDjGfKqfMY5V_fwv_xyGjkwelL2Ny1ZipBsUf2073kcHYJHbBvDlFZxHX3dtuapK0o-uui24K-NYsr8NmG9GcS4Gj37VxIkpNCo4aVA6TTPmSv_DUD1d1MBRIRmscdlHU32N9XobdpOMjdgEnyCJ4NO3ldB_iBL9CctumQ_nlVNZtkXjy9u4hV85kc_o_3enfiLNzl2JKfkgerOv4Jjql5Sw9dxH9T4ibisYDBTOnvyQnRzAmjUcVxjvK2aPYPtOp_zw0-mTNcBYRKxnTEaS_Bvhz-m0Zlr1260gW8G6OcaWycx0pKfWFQxpG9UZgPKnyI1nMaHqMl1fZ7dzB9SGWy2-3CaojBjhfBv0-Cz4390aqs2yB9DNSJGEbqOUrCFFI-QlvQY3gYIKZHSx-4YT5JYr6mMyOiZiCBVlgNalSGb-tJzgsNw0nLiBU2IwV-Hta2yeQg225zvE87fAl9SBXrtsshxGttZ2wvlJsPeYaM2v7O7SjPchbayG45pVptW9Gva8wnn2jQ8-3JFPYBwpxw_MUTqT6MxTdqgL6iqrfLHaTa6tHaFjZd6jhY_IUaSJKKGZ8zDmOje28_AZJfiuegRgP8HTBiY3jNYMeeaTUjFNSKmoDD5juLP7BZ8uFajcC2szZug6L5EixQnZcNAFxhTP-MNWbNkIvBXOFdOtLuLSJcWEg0FErj3rPQajm73dvKXnypzDMu12D9rtbrFe0fwdFJswps8PO8l_mtaRvKbmI4XnLLHpdfe6vVUXxQm9xkwnoBsUXcdDYxL2DmZlrLoxcy5JSfJzEEzB0xZIZIFDOSoZp-cuMAoO4I4il-Ows21KmRiuxn4m5ZU3GS0bQM9808yX-GIacZMJCGZqzkXNHC2AD-83vKOzuIzI13bCAPltBIJEh3lpgiGkB54-LpzV67dO9m9cvtMCrhV9WSIUGJZ-dX549aqBulHqMVTGmlNyjkOk3ojTjPsyNxzJ6chCfaE4Gxx-C1U0GGclnR8FLDONX1atePZcVl2Xq-QJhTKcqOZDYWW2MXjADFnp4y5PV8NCJ-hs47eyPQ_0XfnnURw-iTsOeW2UzmePfomawOYGsI7sWv-AVvj5HXe7dmUaWBfiYeB1h22g5eiABe-1hE1tiu-IjNeCWPIkwWD6HezlYg2AFqxR0vBGMQHAIgUqx57RalnPO9ID6C6YUKCeFaJicrxxPM3SURAKZdg6rZxrrG8_yFApXv4R6UfaEC-2eUcGGkhx57VFFcRslRCm9Eyk1i-ETDqOPDWvd2zSuweZ83orP8gBebPCX8V-PUZje-wqQegL1FxZIx8KbNM9tSeULYzImexu5eGzUN1uNWV2t4_ebEvmeDXPMx3DjsaKauy4HX7fWdGATt3B3T6BylxNC1xl8cMIbFfo3rTXMGzJa1-CL6hVgAjf3IKhLB2-HwR_BjNg2v4Hfnfrbe4ppwEyu7BcNbAGMgJpR0q9_G54PSLdxgEHxs39daqcbAR5Xm2ezYGvtZb1no3ongVEDjZhMDGhsDfUaPFLY5a8pJI2koYvpS4KQhBhuReFh52WjplyV15abHAa5GUPmmcXXkpHI-ucMF4sGzasAQ60_2SRLajXoXl23YgiXyfb4XOlj5tag99n0qSlAG11lL0nu8IGIMQqvLAqHlSGruBDzeqeTIM9EL2CtZlU9c36Yvi_WNBZR0AgKS_D8BIaZqxtu7xZxSplDTafOyjI_TJwC4MD3r8P5YtfMJroAQiw_vwK8ox1jaLkjfL4WMVo3_pn7Z8ydUz1njNwlxX-901tMMLOVfDPIQefD6VE_RZujYPDbtqCjhIht93rcpbpPjgT3BZxEKYHjoXzpq_R1gwDSfpZkJEdPAkS2pkicpHsGWpzrVASVLMYOf7dS68WkglP82heIhSGb3nwtAws344RlqrxoG7NELwRqDSb_diDTOhuJuSHPMDTxdx29LEhwN8wAzNncwiaP0Cf2HYTy-LnT95jb7yQEUVt1GiriCaYJqmdI5Lk5wJnEgYYUCiSpE7Uvdv0ZzfhQnhgy63X7KE4SloGqKBYC7eZQBf7Ra6YdrSYPXdkqjzyx2g1E7TlsNio_vXjljYuqsEBPsbjlA6R4mQJZRp9TODr0fY_QY8HDL-EQw9QXaVWSTpMQH79MUJGZn4EeuNTExyBui3H844gs2Fe-JETb3V8-P-QpM5gCX75cfoNQ85ljOrTgw-UJZXj6OpgvSorbAgGnwkjO7cVQP2-Tf70w4PqFmGOmYVOcrkEf-F7TZaFoi_ugu41HW7Vn5mAkCGY0sMYGbiUrvF-o8qMAjaECWiO38XUePKvicvCjUhc_sWPV9xRoyfmsLKJZv35tpBSET5iPdktXjCToWldwMv3cjJwogGp45RYlRbCRiPiLRv9iYcDmDt8W6aCprhuDf7zuF4a3OmF2NcpBmXxPGM9C3-LlUzdDodhxbVEn0zGzmnKvOZMZVZGt2FoHhQENRd_bhraxE_JhLY0GX5PbYybBIImPOUtvFn1aPPFjoJ-fkUuRw4vF6QBU-a1ppudk7-b99Yxj04ihl1DoGBVlIRVph1olz97VW1cySkfSa80Z9JxLobkBZA3g1Mzmts16ZZ4Nkbvf482fOqoWMWFlYoqTifZEMRVA2-EwE_4en-7EYqTMe80cGtgUorEBh3SGH8e5oOTvfh7Ow1M-Lrso3ifLvLwqaoccAG8pu4CwYkcofgFC_Kt18KT-l1GisVf1lvmrFunn4CwLf7aYfeiDdZRv7Js_K2W90dubFDNONAHXFp0kiRcUNoyp4-LKJgg5ZkDkr3tjbG0LI-nca8l2sJdzJCT2jThEouDC6NIFUjbA7VM0Wyina0DamC5-jU0O3LGp6oorw3h7P9ZKWINVMy83Ud4BSUnD6aJHckNACW-rtdUkMjYTLwt7r_EI_ypfPg0LoHlGjmUTJOSrdHHCQrYRZZN0QPrI4IvXOiHiMCy1feyq5la-fbi4Wwix34P_zond9hVIbuuOjKm50yiIfXVOuneQP7fGajSKodBWBd6OoOQ0bmVtvETF5t-x3t07zgJeLSZNuIyp0ndbHbN9HSy8T108cQUUafiCcZpRMjdKfA-cGvDbHyvbq-40pdkVvR445wVZybrOEDQFTiXIu6aWyLzWwQPNB4f8rhBcnbLmM_FtuvXg7YuiOvh2K0JVMESlx-dw91f0vOSxe40ljQDGX26_nl0W6f-Ohr2diFWbTUWpWsFSRYfHeEha-v2Jj0E8U_lczbELO0i454ufPAIsXgG4HVA8_pVnj6pzNfi-YAQ-ClzIGZIFPC3Go7pZ22vplqJPikBdUG8mhSZYCDo_WZq-_EYog2SieBhWyzkCkC3wtYDelA2h1HAJcXgVPVpBT0XBEWg41DRH7R-MPBCQ8d6w6M-X9UC_g7hJp48ErkcQULib-ugOZFtGkT-SOLVDFc7DXx0p85KMgctoVjbvQMbsYc2IO116xDOdXBF0mqJG5Uc3AZ7lBS1Ei5e7cEA0SJiq6crdL03tG1FCaW9ZCxBur-nqoSExMMuKWNzfFggsFZ3vn20upDmSX4efeF_B_mGn8lph2xsW0ltAODoG0mrk266rPqE_jw7HJk4RmH7knf-pBkbWYXdUOC_R9wHcwJKc3juN_mtizFQyXtR_LWW6wOaRe2cUc4mQL0PANUNgN024UtF06JLsL7kpeLBpyUmyXluACBvBJx3v8tIZXtQX4wr_R4tAwuYq50QK1TldKor-fRpgCrgYnrGXRGj-z0ztLS9gaR7xYgUJnFbIXl3ao14DFTpuhKnvaRuo_3URpSiS0KUjokugDZRzbRS1epfzs2J4Z1JBhPfOdY4Ti2uiHl3kUrHAwRa6XPXlm2Y0TUnDzJbAbZcrQSOfSJcyU6nIYO-pFJ3iyS3Jh6BDoMCE7Rs9YIH3qBzixZnv2R_Tg0Urtkb7n9mwNyy0RUJnVdbncjy4S4GWlqlhqnxxWPIKUvCvfAZrziS74BFprPfVKRe4BjenR0f9vr8aJqanNmWUhb06TG1je1jETibWoWiU9wXwxRq-Fshr46HsvnPaEvSAASc8sTBg_hgveh7mBiyDhRIRko5R_XQI8_eKVwbRj8mvNJdOf_Rx16tPYi6qLRXSSoOtDd8_iZHHrDpAkf7hN7uuCBV41wiEzgcKRVXeDs9QL0aGa1_RpyYQ1YQigZ4cxebR8L9sXvk6TJV8wW5F980ZFmefnRKCiztL47isw-_b_91nEb3Em7zwVOT8zR8dZyWvewdE-Y1bPclEjn_p51me1Uq0RcZRerx3dbAYguWBlGCCVeW3_rMPpGXBiYmqfvLp9x8hGp-8Ea-cWb0PpxCAI7wQM3acae6o8L0rTz-QZN8fsLvLkaRi9TOOxwh38IpuqpDozrEbcJmmALfRnusGv3uOpmOt_Rtv9a-T-NM0NSLIy8bucqE9DQuMuWuriQu9uwMmC_DixuekGl-i2p1h70tq7cG5OzvshmXEGulYnM1pYVXy6B7AOHTCJX3XLNvddw8YJ6l8p3F4abY9eVVN4ilPUve2YmZKCZOdlWkbI4AwjiIW06QYXJlCvFE6ZsCELCuar_UnELHzPxzyx9YzSnH6QhXfmvU0O7m-AzreRBGKOQFaSPBrBmxjyFaN-HDPnYR6rWQuKXZIk6yMKUJe12WeZZV_kUDV5dNXoArgXk7XizgAEClyg52_1T18VRWbMF0heVBJrkGrGFs53MkxVV9nwpFSBOKSGY-Cyzwmq9GBvnxiNPPih3fHwT5ZDHTXisuMZlK_H5my9BN9DXq31CciMFhKAO-zPwM23-ZV6q-m-AgLVHmbEpeCHEeQ0uwxBSOL0L9QemIzV0rQ75tKNzLoJ3FmR8aXhGyMvFp4nMEPlHus9qvePw1sPGD75qvuIOFe6h-JcAKi7iutDJVOrYEm2hkq9oxcjyFh0oDCNOaE1hBUFAjzGmZa9XyR-AjPlEn-IPA2GhZ13LUknHXPfInMItSobB_yDq4_pasNDrjtVZ5r7opUh5H5MKbnf-GLJxrNMuSfCAzWgk1MhN9_ErluKN-MOjVcIimXza3tII_5S6mfa-z5tJZ7bp8ocsxojzhmWDoHrpjgI_EGHIW1r-PJoURyu7NyY-qVKWKDYdca0-34dHBCfd1mznORn1nGdLHxF6ZSCNQA1tkGltn9M8qJYNlW9zMbe34B1cG_Cu4ZZTcufJgB2mchPvoqs574Iae7A9CW0uTAv6R4vGdgwTCYH8Ms-82Q1dYng01MCP65GETp-sMQBslD5SOGR1Pui92pCriCQJitXjHwGSr8zPrGVMSiBrgEZf4ng2znauxMQfoDMkoyNxr0Ib2iom6HPxXyA_jwCF2C8Llq8MLcdRji82EBRn5KV1b1KiBqW7tNObkF9VIQGONiLQxN5lhQ8UJCOk9GgApshSDA4l7_WBUVlKxYKh7GDyaaOxvLKYUl13lgoUVFL49Y6qm2kqZGiqJqxPKAivaAdL9FjvJ6iwKR5Bf_PrJ2TeZW27WxwLi_rIHi-XvdKqrki9NlbfFsQqbAvNq8qSSwoRewB0n0jyee47rEr-0TU6GLilHrRSncJd7cFfEMWu1ipyqjryCGWGOpUVC_uUE--c6sLYxbqDmBqyUr0fAx_AGnYuN4M0KVoUGeq_8OA4rEQ4b7Wf6EL_2uzafV0CeGhrJ0ULReyALqEg1xTbwGD-UNiYXLGwo88IANrzWNFShNPv8hnGeMnou2zgSVJ8IJC4VOoEzHB0Lb-RBwPBjtAz6nNTbf1n6bPk5pviWT6-UpaSySZ6h6cpuaxqe1xHRrF8thpwplG4fitaAL5-XamMSRXkIrnOJgZRf7yhsaRj-gmXx1UN7K6qRCayTFhfWuy6MeBuxLNUuy2ciyWXnbAQvyDfMnsbJA6G3wwCevHDe6-PKhqxw5oxwTC-bgLCp9Q1JxrRwrzZ3sQt4uKWb4eoQVglGYMyaWQmorORR6cx8DbZNz4kp4a18cXUsgT1pkU2d2h3C_mThMcpvcJKvffEYiyGH9LW-0U9-7et6q6Xld5WUO3srVbwt1z2-xxhsHdvP_J16aj5F3swyE6Z5BfqsBSCRGd2yU6Gr-_OvDq-qZ2vVPd497TuzdLhEPedQPP5SZG3NLrC-iY7vWftM_4fWUtTWRaTt1r2omiTgDjuHbLarzDoCSt1aomAboPaadP-R8HFfXM3f2C4z0ZNLxhmFkbodhb8NXI7ignVf_MgqE7C34CkkkhcDftHSFX91AgeEqNy6YC_POoAfAO1Pe7OwlZl8uMoeAdHD8hcj6nnVJvg5CsnuyjgIfWll8Xj8jL8a3VOZ58wJNPY4KBA47N9fQ9e8vDKHHZx_LD7fcL2ahx2XwHjF3GtJbB-VC1v_LRPiPEzrMKviCA2bFJcluqeb81yOP73U9nRgmXpmMh7v5L7lId4hg3XE98ZU5NV0ctnG3dOnpYYa1oyeHO3PaJWtnGubd_Nvj_TYlGNB4HfZsigOVIWiZEedajOUAoaV3dSaqzjain9oXfqZNtKQhznhTi7EfiHfAeo6XdEu9sQH2z5hNbAAwAOy8eCdlYbFX9OewTzZypyZEzMZs041-7HoiUNUskf3PwmfQTjsB4HfLNcrHTm7MDtGUULQGH_WnDK4tTOMFkN5iWc2tLnVBnRI_CysT700hmK1TM9qe8Dmrfcaeu-nbhCKbdNlJbESzACKEbeg7Yd3T5QphmJtjTX4NRAh8UCirMpHNvlFAwJQjtMqQ_3PeLC434-1fGvf-ygOp921YFE3u-FL4g0U_AWdqVf3p74g4xq60ks7yUXHSo9KDrMnx0586k_ryCj4MYypUfFkYu_wsQvDHCudvVkrzdCzwz3SVLYSSIK8_gRTpCSgQCYWRNpf3x6GKvYD8KXVKzLk17MyaoLbrdytUhRkuztJiHdHavcG9kCjlJKUxRM4pFLmaA9JoU22kzLSDvk5MQ-6Rq8QhyfdTfI5-kO9ptyiEk_6RR-3iZp_fv2xjihXwLNz52Rwv-TPYcrz2qJcHv_D45wyoRTxsKQwoiWqckkVVRuGMNE9FUHiIau0yd9Uy484sY0mFbo9vKWRgZoW2ihPlC5iuUMikgNcoTR2Uc0zY3VO8yyiFiBlSGYxBAIboxZY0NjKiflVnugfA1-bRypSXIOePyYiiBcn2EwfKxWm2PAGrJBztKtAvGYWV4ME6ZDQ5Y_kwER4By0n4Ok2YpRRhM1PUsuIVY2PnDm9lvGtRYn0r3KVUy5mRow8JPHgclUzQasHwAMSVeeRMrRQoUC-Z6KJvhulTzJNkzpsiT7vqqN8JkwNBRag8plb5LI88GCqyuPVWjvgyhW_vqaQFHrq1Ss6SscfEzWPuxlOr0J9evLTNRMEnOCsbQqftQhDE468SkJ1c_YbTc7ktNt74Ozqb1982SpBhfArLtniPVUVDvk7tlXgqhHZyag8kik_mb7kGHz3A0nbzgH70tyj6pZd4eZZI_auBVHoxYwC9iXKMRD6eLJFNh5zJm0YpH7QAhn4B3f_QDglfoNIefPzEnLf8gC0i-EA4kF10FXul0ZjE_A0dq_kTGSRv6y5iRxfXF1UUQy_5hwLPX4hR5hKjMybdyKwfmkeh8ve5IOylldqmZ4nY0GUoIN8MRkVmKY6q0y69umNmIL-nCWbvT-a-y83q0YLIUNSE15aBX7vtLukHOK47ky3mt4xEinBjNBFN-2gV8Uw5s5aOCYKrXXEGFV2jsYBdkUMEQpyFFHkFxzJ6QOANIjR-2Jm99f7RB_4KFoGRiC3uzXvmEB1F8izwFrdZvqhOlyL45hqu8rb8vRwE1j3TgcSbF2Qi4nwf9jln_g4XVqNcyPrHkjyKFgVCSyhHJU9ta0P2K-29sjCey7-yOj8LN8kFEM2mcK09RNnGWccDMLy9vlksdtEMbwEr0oATY8b0a-Hum6sIm7jqosjSYFqS-CUhhKww6xItSIwFvr0HyaeP31ohK1Fsk76fxqHflnXKhGfGmR0sJJifNmiJ59AmI2ydlqvbqg7oh8bLCDrF6SH2qzRTWKPkrArqUGo3n986kJPzdYTSnlA5IAWFmX_Tj_Bv4OeukTIZQSsocFBynf-fc8y88yq1Srjcm-WY6ZURIjG3x8Nkja-EEZA5BS1Iz29SGKgFR19pxdM2FccUapX3BV70thdPFJ310FJ0dubZMnVZWZcbY_pRW7V3TEGNK0Xzq6lQ1_dWTLedPBPC68mUaxG15M1CocqG0IyqQFhwiqNHoqgLQVekmstno53kVOXjns4GtZ4dwbIkJiqocWXv1KPd_EgFKAJa4u0Qb-yNCG648u0mqqohyeVx2APCpcGFq5pNRsv9r80Z4cF6rwuI63o_ZjB8IGiTGSOPV3RH8Sz2fls4ygP667stCAXe1Ly2-16gith94R87ZRVtlpNf_ZAKRLCQDtr4dG3-gtXXmKGXTubrz52vL53DKJ3Z1KsNXKGX4Lsi8XC43j34ckGkYoBBVi0GTC17gGYZFXJUz8esZEWjtxTO48jOyA6pyvB-vgHVgY-SgQLpZS7b0eokFaOciv_4EvzTvU101UDjAkptK9rY9AlSTclryqJzr0YjriULjhE5bIpWNh_RG_C3JsiQ-xRxNnbHgPzJ9WXjsVB-QzmB6FrtjGnfABPfahcFk-a5RO6Qtu34DX1rvLQAxjbJHKohf7OxA1hXL1H_F8O_1sSsp8u_CcgOJNhg2nVO6QQgZHjVQXORNf9fWAaIj_PrPjQE75Ra_jM9Qr_oz8hpozcAzyeS41r9sLpeXCemAC_D5R140y2kfgoMMgJcD1J-wpTUNXR8-YMQxf9HWjcY0YnQNuN-umlCPwtf9ss34_jwCHf3AQDNC5iBHXZMkXHuWWWfs18ExiirhSSwdrbHWmdI1SRDyLc0tJLIs7CwmrgY1XU9uMiQ6KgT4TUtT-Ns9r6FarpfkUNK-ediUHWjtwl4cSWZTOp50kytZel5Yg0tM6kKCgqS4HTymmi9qW-4e0A_Pr6_PI9vSB-H2v7ESpb4mHOlqqEJeG6eOAwQEoesuFZ__7IQihLoF63bxl8a8XClCsPYEfhF-xRlyPXVfMN1B2mVYCpqsZWzr5dpAVIQrz54pxO2r5Db0w4SDxinlyp2TF4hNqhFbnkEh8cUdxIaxAMimjGB6fCP2pAMnSPH4nhqMVc3HrCHZgCrjzPsENpr0DvfNDSeEL2hVDmv6Ro_Gu8amGb-eaP-HV39eRT_-xxDsfpHtmLy18Vr9zINWjspquoWi2NsAL-GbclzgUfTCMSN96d--Ai_aagFSxTmxrVwVHBpTK0szUXBUiEuCDJQFoJ4Of1yZMgjoWXbz9_lM_X6GRXvZmrBid75nJhoVd23Z7B53ZJGEMv4UZzfBzPBiPJK9wYFXYQBb6q4Dni3r3CvX4-U1x6ZzqoB4tatiGEH1hj1s4r5bISZ3aZWFwS2E9pfZH-FO-bcUW4CPHQsEKh3Bq10T0ckmYO5Nx5Ggvfq1Ybd8DynbgJeqJ9QFP1k_2aAlwpqbFhIRAm9K1Jo5UpL2jv9bf31XnvzAaudBR7ujRy9IElsOPR_oqP9z2cVL_9eBsbgYcPS2NQ4AomQ941FX5p3Xwi2sfunAcQfFRNDP1rxK2hsyi_6Z4Q6RyCCwaVOaIhC1egUSHKKamiid7At0z2hw6NN7LqtK6guWNkR0llK8NyljXjAXhMPxe8UAugxATzBQvr-kcoHSLvUs_aRAGKExoBvuiVbgoPQnm14vuqqptajlnyuAq3n_nJyjPMgyveSFZqGoe92xbuNOoOdR1N6KCa5WQg7zRok51YmWC6MOzYC6A9kV76-ReVziZ4ha2parCKGCevh-hOhp8yxqqXkQM-98aOLT10MxbCRNIVYNI_6IErNnFidzl5m-Oqfky2UA9EvUy2tF9qM73YriDqqST_-_BnjJGyjBasYCsIOnp_HY-uwG-Ju5h0Uc3JtBBxdmiayGCie1KpUxMhBBz44fMQg8BYKz_UQU9xRyzH0TBMdjljlhFlRRfqC_tNDWUnEfwzwLDZYQ4xaiiE6liA47LuWSvQl4V7G1SELYD4P0r5-mRmByDLaCRuRb1MbxuBYm9XRfFnwL90Sr0vZ9kkafnhWdjNCXvsqNCDQWtvCPrtubCNH8dc2Uo-1U1Kh8FqP8x-TyNf6EnLA-VM6pEijKYNH-tuECpyggYdidKhrFucMFbvnfh_2rteH6VDYQ-wybYJXQwCpPZLpguLMHnTPcNW9sFMcksoD3kDtK4uRLJvhyKsDYk1vVVetlWn4R3kMdFn0mav2EnDgPWHnTqTua0Dk6607S-WL3Tqksp_Pr5qYfniTQ1i9kxAD2p72WW8V0cG-8VNbV1LGbyaqkJjzomVik78mTw3kZfvBawPFaA45zgiwGRNpY5kG2F6LGzmnd4GApdwZbq_REEtm4Y5KZEuKpjQo5jzLbIS-UxN-7f9rCDFrR2en15WgPikH9ASLav2cWDLF6psE94QOBUoYexybvIGmkxkWYkI31SLU5hIGdkid4xEkKA-cIiAIQUV2UtfnpZoYYiyEfV4Vxo0KB8m-Qb-K4hNE7MGdeN9KNNNOcXiisjOKF8OsIhJsC3csl0Ru7Tt4CCdXL32JcKDmA56z0SDNAZCalFrr1KDwXC1LwwlMn-tTcItjOOW1lL4-Ox2daT0zvqOBdpoZMqF_ptDNNBWYLZddZESg8A_xnahKHrl-w45Jmqw2MdHH8zKEKtL_ufzOdYGh1I5lYbjqycQ9do1rhgb93TgPG0tk9IOHd9wac75gVX7aH-_9vNs4z-81kkmdXy4BngqaJ6633WIGgOY0ZqlzQo349rf02D1hMWMShdQE1TUWVoSOIUEluPy92CauWjctOqxCuw2RoxqRbzrB23OsudxR1DD2SHGz4pmrNoJpB7xDKseh1a3sfMyEZ-uTjQLcdGE_htwvbOmw==
         */

        private String encryptedData;

        public String getEncryptedData() {
            return encryptedData;
        }

        public void setEncryptedData(String encryptedData) {
            this.encryptedData = encryptedData;
        }
    }

    public static class PhrsBeanX {
        /**
         * phrs : [{"phr":{"headword":{"l":{"i":"account of"}},"source":"","trs":[{"tr":{"l":{"i":"在某人帐上重视，\t记帐"}}}]}},{"phr":{"headword":{"l":{"i":"account for"}},"source":"","trs":[{"tr":{"l":{"i":"对\u2026负有责任；对\u2026做出解释；说明\u2026\u2026的原因"}}}]}},{"phr":{"headword":{"l":{"i":"your account"}},"source":"","trs":[{"tr":{"l":{"i":"您的帐号"}}}]}},{"phr":{"headword":{"l":{"i":"take into account"}},"source":"","trs":[{"tr":{"l":{"i":"考虑；重视；体谅"}}}]}},{"phr":{"headword":{"l":{"i":"on account"}},"source":"","trs":[{"tr":{"l":{"i":"记帐，赊帐；分期付款"}}}]}},{"phr":{"headword":{"l":{"i":"on account of"}},"source":"","trs":[{"tr":{"l":{"i":"由于；因为；为了\u2026的缘故"}}}]}},{"phr":{"headword":{"l":{"i":"bank account"}},"source":"","trs":[{"tr":{"l":{"i":"银行存款；银行往来帐户"}}}]}},{"phr":{"headword":{"l":{"i":"be taken into account"}},"source":"","trs":[{"tr":{"l":{"i":"[俚]被考虑"}}}]}},{"phr":{"headword":{"l":{"i":"current account"}},"source":"","trs":[{"tr":{"l":{"i":"经常帐；活期存款帐户"}}}]}},{"phr":{"headword":{"l":{"i":"account number"}},"source":"","trs":[{"tr":{"l":{"i":"帐号"}}}]}},{"phr":{"headword":{"l":{"i":"of account"}},"source":"","trs":[{"tr":{"l":{"i":"重要的；有价值的"}}}]}},{"phr":{"headword":{"l":{"i":"savings account"}},"source":"","trs":[{"tr":{"l":{"i":"储蓄帐户"}}}]}},{"phr":{"headword":{"l":{"i":"no account"}},"source":"","trs":[{"tr":{"l":{"i":"没用的；无交易；未交帐户；无会计科目"}}}]}},{"phr":{"headword":{"l":{"i":"account management"}},"source":"","trs":[{"tr":{"l":{"i":"账户管理"}}}]}},{"phr":{"headword":{"l":{"i":"capital account"}},"source":"","trs":[{"tr":{"l":{"i":"资本性帐户；固定资产帐户"}}}]}},{"phr":{"headword":{"l":{"i":"open an account"}},"source":"","trs":[{"tr":{"l":{"i":"开立帐户"}}}]}},{"phr":{"headword":{"l":{"i":"take account of"}},"source":"","trs":[{"tr":{"l":{"i":"考虑到；顾及；体谅"}}}]}},{"phr":{"headword":{"l":{"i":"deposit account"}},"source":"","trs":[{"tr":{"l":{"i":"存款帐户；储蓄存款"}}}]}},{"phr":{"headword":{"l":{"i":"new account"}},"source":"","trs":[{"tr":{"l":{"i":"新帐户；新开帐户"}}}]}},{"phr":{"headword":{"l":{"i":"checking account"}},"source":"","trs":[{"tr":{"l":{"i":"活期存款；支票户头；活期存款户头"}}}]}}]
         * word : account
         */

        private String word;
        private List<PhrsBean> phrs;

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public List<PhrsBean> getPhrs() {
            return phrs;
        }

        public void setPhrs(List<PhrsBean> phrs) {
            this.phrs = phrs;
        }

        public static class PhrsBean {
            /**
             * phr : {"headword":{"l":{"i":"account of"}},"source":"","trs":[{"tr":{"l":{"i":"在某人帐上重视，\t记帐"}}}]}
             */

            private PhrBean phr;

            public PhrBean getPhr() {
                return phr;
            }

            public void setPhr(PhrBean phr) {
                this.phr = phr;
            }

            public static class PhrBean {
                /**
                 * headword : {"l":{"i":"account of"}}
                 * source :
                 * trs : [{"tr":{"l":{"i":"在某人帐上重视，\t记帐"}}}]
                 */

                private HeadwordBean headword;
                private String source;
                private List<TrsBeanXX> trs;

                public HeadwordBean getHeadword() {
                    return headword;
                }

                public void setHeadword(HeadwordBean headword) {
                    this.headword = headword;
                }

                public String getSource() {
                    return source;
                }

                public void setSource(String source) {
                    this.source = source;
                }

                public List<TrsBeanXX> getTrs() {
                    return trs;
                }

                public void setTrs(List<TrsBeanXX> trs) {
                    this.trs = trs;
                }

                public static class HeadwordBean {
                    /**
                     * l : {"i":"account of"}
                     */

                    private LBeanXXXXX l;

                    public LBeanXXXXX getL() {
                        return l;
                    }

                    public void setL(LBeanXXXXX l) {
                        this.l = l;
                    }

                    public static class LBeanXXXXX {
                        /**
                         * i : account of
                         */

                        private String i;

                        public String getI() {
                            return i;
                        }

                        public void setI(String i) {
                            this.i = i;
                        }
                    }
                }

                public static class TrsBeanXX {
                    /**
                     * tr : {"l":{"i":"在某人帐上重视，\t记帐"}}
                     */

                    private TrBeanXX tr;

                    public TrBeanXX getTr() {
                        return tr;
                    }

                    public void setTr(TrBeanXX tr) {
                        this.tr = tr;
                    }

                    public static class TrBeanXX {
                        /**
                         * l : {"i":"在某人帐上重视，\t记帐"}
                         */

                        private LBeanXXXXXX l;

                        public LBeanXXXXXX getL() {
                            return l;
                        }

                        public void setL(LBeanXXXXXX l) {
                            this.l = l;
                        }

                        public static class LBeanXXXXXX {
                            /**
                             * i : 在某人帐上重视，	记帐
                             */

                            private String i;

                            public String getI() {
                                return i;
                            }

                            public void setI(String i) {
                                this.i = i;
                            }
                        }
                    }
                }
            }
        }
    }

    public static class RelWordBean {
        /**
         * rels : [{"rel":{"pos":"adj.","words":[{"tran":" 有责任的；有解释义务的；可解释的","word":"accountable"}]}},{"rel":{"pos":"n.","words":[{"tran":" 会计，会计学；帐单","word":"accounting"}]}},{"rel":{"pos":"v.","words":[{"tran":" 解释（account的ing形式）；叙述","word":"accounting"}]}}]
         * stem : account
         * word : account
         */

        private String stem;
        private String word;
        private List<RelsBean> rels;

        public String getStem() {
            return stem;
        }

        public void setStem(String stem) {
            this.stem = stem;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public List<RelsBean> getRels() {
            return rels;
        }

        public void setRels(List<RelsBean> rels) {
            this.rels = rels;
        }

        public static class RelsBean {
            /**
             * rel : {"pos":"adj.","words":[{"tran":" 有责任的；有解释义务的；可解释的","word":"accountable"}]}
             */

            private RelBean rel;

            public RelBean getRel() {
                return rel;
            }

            public void setRel(RelBean rel) {
                this.rel = rel;
            }

            public static class RelBean {
                /**
                 * pos : adj.
                 * words : [{"tran":" 有责任的；有解释义务的；可解释的","word":"accountable"}]
                 */

                private String pos;
                private List<WordsBean> words;

                public String getPos() {
                    return pos;
                }

                public void setPos(String pos) {
                    this.pos = pos;
                }

                public List<WordsBean> getWords() {
                    return words;
                }

                public void setWords(List<WordsBean> words) {
                    this.words = words;
                }

                public static class WordsBean {
                    /**
                     * tran :  有责任的；有解释义务的；可解释的
                     * word : accountable
                     */

                    private String tran;
                    private String word;

                    public String getTran() {
                        return tran;
                    }

                    public void setTran(String tran) {
                        this.tran = tran;
                    }

                    public String getWord() {
                        return word;
                    }

                    public void setWord(String word) {
                        this.word = word;
                    }
                }
            }
        }
    }

    public static class SimpleBean extends DataSupport{
        /**
         * query : account
         * word : [{"return-phrase":"account","ukphone":"ə'kaʊnt","ukspeech":"account&type=1","usphone":"ə'kaʊnt","usspeech":"account&type=2"}]
         */

        private String query;
        private List<WordBeanXX> word;

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public List<WordBeanXX> getWord() {
            return word;
        }

        public void setWord(List<WordBeanXX> word) {
            this.word = word;
        }

        public static class WordBeanXX {
            /**
             * return-phrase : account
             * ukphone : ə'kaʊnt
             * ukspeech : account&type=1
             * usphone : ə'kaʊnt
             * usspeech : account&type=2
             */

            @SerializedName("return-phrase")
            private String returnphrase;
            private String ukphone;
            private String ukspeech;
            private String usphone;
            private String usspeech;

            public String getReturnphrase() {
                return returnphrase;
            }

            public void setReturnphrase(String returnphrase) {
                this.returnphrase = returnphrase;
            }

            public String getUkphone() {
                return ukphone;
            }

            public void setUkphone(String ukphone) {
                this.ukphone = ukphone;
            }

            public String getUkspeech() {
                return ukspeech;
            }

            public void setUkspeech(String ukspeech) {
                this.ukspeech = ukspeech;
            }

            public String getUsphone() {
                return usphone;
            }

            public void setUsphone(String usphone) {
                this.usphone = usphone;
            }

            public String getUsspeech() {
                return usspeech;
            }

            public void setUsspeech(String usspeech) {
                this.usspeech = usspeech;
            }
        }
    }

    public static class SpecialBean {
        /**
         * co-add : http://www.inoteexpress.com
         * entries : [{"entry":{"major":"经济学","num":4,"trs":[{"tr":{"chnSent":"2006年,美国经常<b>账户<\/b>的逆差占GDP的6.2%,这是史无前例的。","cite":"688","docTitle":"论美国经常账户逆差的成因及不可持续性 （研究生论文）","engSent":"In 2006, the US current <b>account<\/b> deficit amounts to unprecedented 6.2% of its GDP.","nat":"账户","url":"http://www.591-lw.com/article.php?r_id=148017"}},{"tr":{"chnSent":"近几年来,随着江汉油田快速发展,经济规模不断扩大,<b>应收账款<\/b>逐年增多。","cite":"169","docTitle":"浅议应收账款管理 ","engSent":"in recent years,Jianghan Oilfield has made a rapid headway and constantly expanded its economic scale. Its <b>account<\/b> receivable,however,is growing year after year.","nat":"应收账款","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CJFQ&dbname=CJFDLAST2010&filename=jszd201001025"}},{"tr":{"chnSent":"而目前这些巨大的森林环境服务效益在国民<b>经济核算<\/b>中未予考虑,需要采取适当的措施将这些外部效益内部化。","cite":"19","docTitle":"北京山区森林资源价值评价 ","engSent":"However, the benefit of these environmental services is not considered in the system of national economic <b>account<\/b>. The appropriated measures should be taken to internalize these external benefits.","nat":"经济核算","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CDFD&dbname=CDFD2005&filename=2005085003.nh"}},{"tr":{"cite":"0","nat":"帐户"}}]}},{"entry":{"major":"计算机科学技术","num":6,"trs":[{"tr":{"chnSent":"构建了基于远程访问拨号接入用户服务（RADIUS）的认证、授权和<b>计费<\/b>系统。","cite":"157","docTitle":"期刊学术社区","engSent":"A remote access dial in user service(RADIUS) authentication,authorization and <b>account<\/b> system is constructed.","nat":"计费","url":"http://www.magsci.org/SearchArticle?flag=showaticle&id=6975451"}},{"tr":{"chnSent":"宽带接入过程中容易出现<b>账号<\/b>密码被盗用的现象，因而需要使用接入认证技术。","cite":"39","docTitle":"宽带接入中的认证技术分析\u2014《电脑知识与技术》\u20142007年第18期\u2014龙源期刊网","engSent":"s：It is apt to present the phenomenon that the <b>account<\/b> number password is usurped in the course of broadband access, therefore need to use and inserting authentication technology.","nat":"账号","url":"http://cn.qikan.com/Article/zsjs/zsjs200718/zsjs20071833.html"}},{"tr":{"cite":"0","nat":"帐户"}},{"tr":{"cite":"0","nat":"科目"}},{"tr":{"cite":"0","nat":"会计"}},{"tr":{"cite":"0","nat":"帐款"}}]}},{"entry":{"major":"体育","num":1,"trs":[{"tr":{"cite":"0","nat":"(在比赛中)击败；击出场(for)"}}]}},{"entry":{"major":"数学","num":1,"trs":[{"tr":{"cite":"6","docTitle":"\u201c5+3\u201d工程项目管理模式 ","nat":"计算","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CMFD&dbname=CMFD2009&filename=2008186124.nh"}}]}},{"entry":{"major":"交通运输工程","num":1,"trs":[{"tr":{"cite":"0","nat":"帐目"}}]}}]
         * summary : {"sources":{"source":{"site":"NoteExpress","url":"http://www.inoteexpress.com"}},"text":"以上统计来源于2,447,534篇论文数据，部分数据来源于"}
         * total : 2,447,543
         */

        @SerializedName("co-add")
        private String coadd;
        private SummaryBean summary;
        private String total;
        private List<EntriesBeanX> entries;

        public String getCoadd() {
            return coadd;
        }

        public void setCoadd(String coadd) {
            this.coadd = coadd;
        }

        public SummaryBean getSummary() {
            return summary;
        }

        public void setSummary(SummaryBean summary) {
            this.summary = summary;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public List<EntriesBeanX> getEntries() {
            return entries;
        }

        public void setEntries(List<EntriesBeanX> entries) {
            this.entries = entries;
        }

        public static class SummaryBean {
            /**
             * sources : {"source":{"site":"NoteExpress","url":"http://www.inoteexpress.com"}}
             * text : 以上统计来源于2,447,534篇论文数据，部分数据来源于
             */

            private SourcesBean sources;
            private String text;

            public SourcesBean getSources() {
                return sources;
            }

            public void setSources(SourcesBean sources) {
                this.sources = sources;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public static class SourcesBean {
                /**
                 * source : {"site":"NoteExpress","url":"http://www.inoteexpress.com"}
                 */

                private SourceBeanXX source;

                public SourceBeanXX getSource() {
                    return source;
                }

                public void setSource(SourceBeanXX source) {
                    this.source = source;
                }

                public static class SourceBeanXX {
                    /**
                     * site : NoteExpress
                     * url : http://www.inoteexpress.com
                     */

                    private String site;
                    private String url;

                    public String getSite() {
                        return site;
                    }

                    public void setSite(String site) {
                        this.site = site;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }
            }
        }

        public static class EntriesBeanX {
            /**
             * entry : {"major":"经济学","num":4,"trs":[{"tr":{"chnSent":"2006年,美国经常<b>账户<\/b>的逆差占GDP的6.2%,这是史无前例的。","cite":"688","docTitle":"论美国经常账户逆差的成因及不可持续性 （研究生论文）","engSent":"In 2006, the US current <b>account<\/b> deficit amounts to unprecedented 6.2% of its GDP.","nat":"账户","url":"http://www.591-lw.com/article.php?r_id=148017"}},{"tr":{"chnSent":"近几年来,随着江汉油田快速发展,经济规模不断扩大,<b>应收账款<\/b>逐年增多。","cite":"169","docTitle":"浅议应收账款管理 ","engSent":"in recent years,Jianghan Oilfield has made a rapid headway and constantly expanded its economic scale. Its <b>account<\/b> receivable,however,is growing year after year.","nat":"应收账款","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CJFQ&dbname=CJFDLAST2010&filename=jszd201001025"}},{"tr":{"chnSent":"而目前这些巨大的森林环境服务效益在国民<b>经济核算<\/b>中未予考虑,需要采取适当的措施将这些外部效益内部化。","cite":"19","docTitle":"北京山区森林资源价值评价 ","engSent":"However, the benefit of these environmental services is not considered in the system of national economic <b>account<\/b>. The appropriated measures should be taken to internalize these external benefits.","nat":"经济核算","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CDFD&dbname=CDFD2005&filename=2005085003.nh"}},{"tr":{"cite":"0","nat":"帐户"}}]}
             */

            private EntryBeanXX entry;

            public EntryBeanXX getEntry() {
                return entry;
            }

            public void setEntry(EntryBeanXX entry) {
                this.entry = entry;
            }

            public static class EntryBeanXX {
                /**
                 * major : 经济学
                 * num : 4
                 * trs : [{"tr":{"chnSent":"2006年,美国经常<b>账户<\/b>的逆差占GDP的6.2%,这是史无前例的。","cite":"688","docTitle":"论美国经常账户逆差的成因及不可持续性 （研究生论文）","engSent":"In 2006, the US current <b>account<\/b> deficit amounts to unprecedented 6.2% of its GDP.","nat":"账户","url":"http://www.591-lw.com/article.php?r_id=148017"}},{"tr":{"chnSent":"近几年来,随着江汉油田快速发展,经济规模不断扩大,<b>应收账款<\/b>逐年增多。","cite":"169","docTitle":"浅议应收账款管理 ","engSent":"in recent years,Jianghan Oilfield has made a rapid headway and constantly expanded its economic scale. Its <b>account<\/b> receivable,however,is growing year after year.","nat":"应收账款","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CJFQ&dbname=CJFDLAST2010&filename=jszd201001025"}},{"tr":{"chnSent":"而目前这些巨大的森林环境服务效益在国民<b>经济核算<\/b>中未予考虑,需要采取适当的措施将这些外部效益内部化。","cite":"19","docTitle":"北京山区森林资源价值评价 ","engSent":"However, the benefit of these environmental services is not considered in the system of national economic <b>account<\/b>. The appropriated measures should be taken to internalize these external benefits.","nat":"经济核算","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CDFD&dbname=CDFD2005&filename=2005085003.nh"}},{"tr":{"cite":"0","nat":"帐户"}}]
                 */

                private String major;
                private int num;
                private List<TrsBeanXXX> trs;

                public String getMajor() {
                    return major;
                }

                public void setMajor(String major) {
                    this.major = major;
                }

                public int getNum() {
                    return num;
                }

                public void setNum(int num) {
                    this.num = num;
                }

                public List<TrsBeanXXX> getTrs() {
                    return trs;
                }

                public void setTrs(List<TrsBeanXXX> trs) {
                    this.trs = trs;
                }

                public static class TrsBeanXXX {
                    /**
                     * tr : {"chnSent":"2006年,美国经常<b>账户<\/b>的逆差占GDP的6.2%,这是史无前例的。","cite":"688","docTitle":"论美国经常账户逆差的成因及不可持续性 （研究生论文）","engSent":"In 2006, the US current <b>account<\/b> deficit amounts to unprecedented 6.2% of its GDP.","nat":"账户","url":"http://www.591-lw.com/article.php?r_id=148017"}
                     */

                    private TrBeanXXX tr;

                    public TrBeanXXX getTr() {
                        return tr;
                    }

                    public void setTr(TrBeanXXX tr) {
                        this.tr = tr;
                    }

                    public static class TrBeanXXX {
                        /**
                         * chnSent : 2006年,美国经常<b>账户</b>的逆差占GDP的6.2%,这是史无前例的。
                         * cite : 688
                         * docTitle : 论美国经常账户逆差的成因及不可持续性 （研究生论文）
                         * engSent : In 2006, the US current <b>account</b> deficit amounts to unprecedented 6.2% of its GDP.
                         * nat : 账户
                         * url : http://www.591-lw.com/article.php?r_id=148017
                         */

                        private String chnSent;
                        private String cite;
                        private String docTitle;
                        private String engSent;
                        private String nat;
                        private String url;

                        public String getChnSent() {
                            return chnSent;
                        }

                        public void setChnSent(String chnSent) {
                            this.chnSent = chnSent;
                        }

                        public String getCite() {
                            return cite;
                        }

                        public void setCite(String cite) {
                            this.cite = cite;
                        }

                        public String getDocTitle() {
                            return docTitle;
                        }

                        public void setDocTitle(String docTitle) {
                            this.docTitle = docTitle;
                        }

                        public String getEngSent() {
                            return engSent;
                        }

                        public void setEngSent(String engSent) {
                            this.engSent = engSent;
                        }

                        public String getNat() {
                            return nat;
                        }

                        public void setNat(String nat) {
                            this.nat = nat;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }
                    }
                }
            }
        }
    }

    public static class SplongmanBean {
        /**
         * isGood : true
         * wordList : [{"Entry":{"Head":[{"FREQ":["S1","W1"],"GRAM":["C"],"HOMNUM":["1"],"HWD":["account"],"HYPHENATION":["ac\u2027count"],"POS":["n"],"PronCodes":[{"PRON":["əˈkaʊnt"],"PRONKK":["əˋka u nt"]}],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}],"Sense":[{"DEF":["a written or spoken description that says what happens in an event or process"],"EXAMPLE":["Chomsky\u2019s account of how children learn their first language"],"EXAMPLETRAN":["乔姆斯基关于儿童如何学习第一语言的描述"],"SIGNPOST":["description"],"SIGNTRAN":["描述"],"TRAN":["叙述，描写，报道"]},{"DEF":["an arrangement in which a bank keeps your money safe so that you can pay more in or take money out"],"EXAMPLE":["My salary is paid into my bank account.","I\u2019ve <i>opened an account<\/i> with Barclay\u2019s Bank.","My husband and I have a <i>joint account<\/i> (= <em> one that is shared between two people <\/em> ) ."],"EXAMPLETRAN":["我的工资直接存入我的银行账户。","我在巴克莱银行开了一个账户。","我和丈夫有个联名账户。"],"SIGNPOST":["at a bank"],"SIGNTRAN":["在银行"],"TRAN":["账户"],"Variant":[{"ABBR":["a/c","acct."],"LINKWORD":["written abbreviation <i>书面缩写为<\/i>","or"]}]},{"DEF":["to consider or include particular facts or details when making a decision or judgment about something"],"EXAMPLE":["These figures do not take account of changes in the rate of inflation."],"EXAMPLETRAN":["这些数字没有把通货膨胀率的变化考虑进去。"],"LEXUNIT":["take account of sth"],"TRAN":["考虑到某事，把某事考虑进去"],"Variant":[{"LEXVAR":["take sth into account"],"LINKWORD":["also <i>又作<\/i>"]}]}]}},{"Entry":{"Head":[{"FREQ":["S3","W2"],"HOMNUM":["2"],"HWD":["account"],"HYPHENATION":["account"],"POS":["v"],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}]}}]
         */

        private String isGood;
        private List<WordListBeanX> wordList;

        public String getIsGood() {
            return isGood;
        }

        public void setIsGood(String isGood) {
            this.isGood = isGood;
        }

        public List<WordListBeanX> getWordList() {
            return wordList;
        }

        public void setWordList(List<WordListBeanX> wordList) {
            this.wordList = wordList;
        }

        public static class WordListBeanX {
            /**
             * Entry : {"Head":[{"FREQ":["S1","W1"],"GRAM":["C"],"HOMNUM":["1"],"HWD":["account"],"HYPHENATION":["ac\u2027count"],"POS":["n"],"PronCodes":[{"PRON":["əˈkaʊnt"],"PRONKK":["əˋka u nt"]}],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}],"Sense":[{"DEF":["a written or spoken description that says what happens in an event or process"],"EXAMPLE":["Chomsky\u2019s account of how children learn their first language"],"EXAMPLETRAN":["乔姆斯基关于儿童如何学习第一语言的描述"],"SIGNPOST":["description"],"SIGNTRAN":["描述"],"TRAN":["叙述，描写，报道"],"Variant":[{"ABBR":["a/c","acct."],"LINKWORD":["written abbreviation <i>书面缩写为<\/i>","or"]}],"LEXUNIT":["take account of sth"]},{"DEF":["an arrangement in which a bank keeps your money safe so that you can pay more in or take money out"],"EXAMPLE":["My salary is paid into my bank account.","I\u2019ve <i>opened an account<\/i> with Barclay\u2019s Bank.","My husband and I have a <i>joint account<\/i> (= <em> one that is shared between two people <\/em> ) ."],"EXAMPLETRAN":["我的工资直接存入我的银行账户。","我在巴克莱银行开了一个账户。","我和丈夫有个联名账户。"],"SIGNPOST":["at a bank"],"SIGNTRAN":["在银行"],"TRAN":["账户"],"Variant":[{"ABBR":["a/c","acct."],"LINKWORD":["written abbreviation <i>书面缩写为<\/i>","or"]}]},{"DEF":["to consider or include particular facts or details when making a decision or judgment about something"],"EXAMPLE":["These figures do not take account of changes in the rate of inflation."],"EXAMPLETRAN":["这些数字没有把通货膨胀率的变化考虑进去。"],"LEXUNIT":["take account of sth"],"TRAN":["考虑到某事，把某事考虑进去"],"Variant":[{"LEXVAR":["take sth into account"],"LINKWORD":["also <i>又作<\/i>"]}]}]}
             */

            private EntryBeanXXX Entry;

            public EntryBeanXXX getEntry() {
                return Entry;
            }

            public void setEntry(EntryBeanXXX Entry) {
                this.Entry = Entry;
            }

            public static class EntryBeanXXX {
                private List<HeadBeanX> Head;
                private List<SenseBeanX> Sense;

                public List<HeadBeanX> getHead() {
                    return Head;
                }

                public void setHead(List<HeadBeanX> Head) {
                    this.Head = Head;
                }

                public List<SenseBeanX> getSense() {
                    return Sense;
                }

                public void setSense(List<SenseBeanX> Sense) {
                    this.Sense = Sense;
                }

                public static class HeadBeanX {
                    private List<String> FREQ;
                    private List<String> GRAM;
                    private List<String> HOMNUM;
                    private List<String> HWD;
                    private List<String> HYPHENATION;
                    private List<String> POS;
                    private List<PronCodesBeanX> PronCodes;
                    private List<String> VIDEOCAL;

                    public List<String> getFREQ() {
                        return FREQ;
                    }

                    public void setFREQ(List<String> FREQ) {
                        this.FREQ = FREQ;
                    }

                    public List<String> getGRAM() {
                        return GRAM;
                    }

                    public void setGRAM(List<String> GRAM) {
                        this.GRAM = GRAM;
                    }

                    public List<String> getHOMNUM() {
                        return HOMNUM;
                    }

                    public void setHOMNUM(List<String> HOMNUM) {
                        this.HOMNUM = HOMNUM;
                    }

                    public List<String> getHWD() {
                        return HWD;
                    }

                    public void setHWD(List<String> HWD) {
                        this.HWD = HWD;
                    }

                    public List<String> getHYPHENATION() {
                        return HYPHENATION;
                    }

                    public void setHYPHENATION(List<String> HYPHENATION) {
                        this.HYPHENATION = HYPHENATION;
                    }

                    public List<String> getPOS() {
                        return POS;
                    }

                    public void setPOS(List<String> POS) {
                        this.POS = POS;
                    }

                    public List<PronCodesBeanX> getPronCodes() {
                        return PronCodes;
                    }

                    public void setPronCodes(List<PronCodesBeanX> PronCodes) {
                        this.PronCodes = PronCodes;
                    }

                    public List<String> getVIDEOCAL() {
                        return VIDEOCAL;
                    }

                    public void setVIDEOCAL(List<String> VIDEOCAL) {
                        this.VIDEOCAL = VIDEOCAL;
                    }

                    public static class PronCodesBeanX {
                        private List<String> PRON;
                        private List<String> PRONKK;

                        public List<String> getPRON() {
                            return PRON;
                        }

                        public void setPRON(List<String> PRON) {
                            this.PRON = PRON;
                        }

                        public List<String> getPRONKK() {
                            return PRONKK;
                        }

                        public void setPRONKK(List<String> PRONKK) {
                            this.PRONKK = PRONKK;
                        }
                    }
                }

                public static class SenseBeanX {
                    private List<String> DEF;
                    private List<String> EXAMPLE;
                    private List<String> EXAMPLETRAN;
                    private List<String> SIGNPOST;
                    private List<String> SIGNTRAN;
                    private List<String> TRAN;
                    private List<VariantBeanX> Variant;
                    private List<String> LEXUNIT;

                    public List<String> getDEF() {
                        return DEF;
                    }

                    public void setDEF(List<String> DEF) {
                        this.DEF = DEF;
                    }

                    public List<String> getEXAMPLE() {
                        return EXAMPLE;
                    }

                    public void setEXAMPLE(List<String> EXAMPLE) {
                        this.EXAMPLE = EXAMPLE;
                    }

                    public List<String> getEXAMPLETRAN() {
                        return EXAMPLETRAN;
                    }

                    public void setEXAMPLETRAN(List<String> EXAMPLETRAN) {
                        this.EXAMPLETRAN = EXAMPLETRAN;
                    }

                    public List<String> getSIGNPOST() {
                        return SIGNPOST;
                    }

                    public void setSIGNPOST(List<String> SIGNPOST) {
                        this.SIGNPOST = SIGNPOST;
                    }

                    public List<String> getSIGNTRAN() {
                        return SIGNTRAN;
                    }

                    public void setSIGNTRAN(List<String> SIGNTRAN) {
                        this.SIGNTRAN = SIGNTRAN;
                    }

                    public List<String> getTRAN() {
                        return TRAN;
                    }

                    public void setTRAN(List<String> TRAN) {
                        this.TRAN = TRAN;
                    }

                    public List<VariantBeanX> getVariant() {
                        return Variant;
                    }

                    public void setVariant(List<VariantBeanX> Variant) {
                        this.Variant = Variant;
                    }

                    public List<String> getLEXUNIT() {
                        return LEXUNIT;
                    }

                    public void setLEXUNIT(List<String> LEXUNIT) {
                        this.LEXUNIT = LEXUNIT;
                    }

                    public static class VariantBeanX {
                        private List<String> ABBR;
                        private List<String> LINKWORD;

                        public List<String> getABBR() {
                            return ABBR;
                        }

                        public void setABBR(List<String> ABBR) {
                            this.ABBR = ABBR;
                        }

                        public List<String> getLINKWORD() {
                            return LINKWORD;
                        }

                        public void setLINKWORD(List<String> LINKWORD) {
                            this.LINKWORD = LINKWORD;
                        }
                    }
                }
            }
        }
    }

    public static class SynoBeanX {
        /**
         * synos : [{"syno":{"pos":"n.","tran":"[会计]帐户；解释；帐目，帐单；理由","ws":[{"w":"interpretation"},{"w":"explanation"},{"w":"construction"},{"w":"sake"},{"w":"reason"}]}},{"syno":{"pos":"vi.","tran":"解释；导致；报帐","ws":[{"w":"result in"},{"w":"to interpret"}]}},{"syno":{"pos":"vt.","tran":"认为；把\u2026视为","ws":[{"w":"count"},{"w":"find"},{"w":"guess"},{"w":"feel"},{"w":"rate"}]}}]
         * word : account
         */

        private String word;
        private List<SynosBean> synos;

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public List<SynosBean> getSynos() {
            return synos;
        }

        public void setSynos(List<SynosBean> synos) {
            this.synos = synos;
        }

        public static class SynosBean {
            /**
             * syno : {"pos":"n.","tran":"[会计]帐户；解释；帐目，帐单；理由","ws":[{"w":"interpretation"},{"w":"explanation"},{"w":"construction"},{"w":"sake"},{"w":"reason"}]}
             */

            private SynoBean syno;

            public SynoBean getSyno() {
                return syno;
            }

            public void setSyno(SynoBean syno) {
                this.syno = syno;
            }

            public static class SynoBean {
                /**
                 * pos : n.
                 * tran : [会计]帐户；解释；帐目，帐单；理由
                 * ws : [{"w":"interpretation"},{"w":"explanation"},{"w":"construction"},{"w":"sake"},{"w":"reason"}]
                 */

                private String pos;
                private String tran;
                private List<WsBean> ws;

                public String getPos() {
                    return pos;
                }

                public void setPos(String pos) {
                    this.pos = pos;
                }

                public String getTran() {
                    return tran;
                }

                public void setTran(String tran) {
                    this.tran = tran;
                }

                public List<WsBean> getWs() {
                    return ws;
                }

                public void setWs(List<WsBean> ws) {
                    this.ws = ws;
                }

                public static class WsBean {
                    /**
                     * w : interpretation
                     */

                    private String w;

                    public String getW() {
                        return w;
                    }

                    public void setW(String w) {
                        this.w = w;
                    }
                }
            }
        }
    }

    public static class WebTransBean {
        @SerializedName("web-translation")
        private List<WebtranslationBean> webtranslation;

        public List<WebtranslationBean> getWebtranslation() {
            return webtranslation;
        }

        public void setWebtranslation(List<WebtranslationBean> webtranslation) {
            this.webtranslation = webtranslation;
        }

        public static class WebtranslationBean {
            @SerializedName("@same")
            private String _$Same168; // FIXME check this code
            private String key;
            @SerializedName("key-speech")
            private String keyspeech;
            private List<TransBean> trans;

            public String get_$Same168() {
                return _$Same168;
            }

            public void set_$Same168(String _$Same168) {
                this._$Same168 = _$Same168;
            }

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }

            public String getKeyspeech() {
                return keyspeech;
            }

            public void setKeyspeech(String keyspeech) {
                this.keyspeech = keyspeech;
            }

            public List<TransBean> getTrans() {
                return trans;
            }

            public void setTrans(List<TransBean> trans) {
                this.trans = trans;
            }

            public static class TransBean {
                /**
                 * summary : {"line":["...本次博彩之神争霸(Hegemony)战将分为两个阶段(Stage)：资格赛阶段和决赛阶段。玩家在大发随意四个产物之一具有备案<b>账户<\/b>(<b>Account<\/b>)即有资历参预资格赛(Qualifi.."]}
                 * support : 1037
                 * url :
                 * value : 账户
                 * cls : {"cl":["会计"]}
                 */

                private SummaryBeanX summary;
                private int support;
                private String url;
                private String value;
                private ClsBean cls;

                public SummaryBeanX getSummary() {
                    return summary;
                }

                public void setSummary(SummaryBeanX summary) {
                    this.summary = summary;
                }

                public int getSupport() {
                    return support;
                }

                public void setSupport(int support) {
                    this.support = support;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public ClsBean getCls() {
                    return cls;
                }

                public void setCls(ClsBean cls) {
                    this.cls = cls;
                }

                public static class SummaryBeanX {
                    private List<String> line;

                    public List<String> getLine() {
                        return line;
                    }

                    public void setLine(List<String> line) {
                        this.line = line;
                    }
                }

                public static class ClsBean {
                    private List<String> cl;

                    public List<String> getCl() {
                        return cl;
                    }

                    public void setCl(List<String> cl) {
                        this.cl = cl;
                    }
                }
            }
        }
    }

    public static class WebsterBean {
        /**
         * encryptedData : VcKA3WTZEeIeiUjhssApF-Rw8is5r7T_8GW9fsFlNzo8-bWtmAC_OKhiQed5gVHcngAldduVR-6c4THgZnh5rVwJtM4RHPewiAuvihBSWptG_-Kl-41k6vkiEnukWIq3Le90K4Kq3h_E8p34siY5ZyZvANBIp8myJtmPga7ZOTVR_JnvbNlNmbmFPVvHd2Px_hUE52T0zfAsGXmBRn6ru73Jd6pfzShEPRYsVdGhtxwPlo2aBIc0kG2pS-n0w99Ttyx-yayHjEWJJShrhmAOALiRrVSWCYIwndGwzU3WJy1vSIfsIBHmg5Ey27LolGRFJ4GFtvUZRQFEE0LLs1n0ke_dIYBBAof99RwcTf5anbouhYSOUZoA3x-gFim0JfHjTV7JbtzPYECFAe0ccDBluJdRAKiHM8io65LHCZZrvggycn-re_MWp93bIfMPPZrraYQbnCCMaZQKrqA34u-D2Hh8HwUYsRtTPwooAvOSvYY_Ek3jx19pOAH3Yk8yRRHZjX0D8R5ArPh-TZ1qDeh4aHxqIeAlzslfDMcmIsuw5UqfZya6HzNLT_R5KuwgixCHmucfZ70qd564SmRHtuL3_qiZXCmLSw6rJpBcud_bV2elsO4e8gyjAxH9rL5Y-IL_e_meMvz0SVuZ3hdeM71UgQyNJuvNZ9PuprT0OLeAjbpqMjPhS6se-kJ0hQmjydXErnFBxzX-SqKkKrRSkIivBjX4_au8CjUeY2fib45yGsGhzjcr9R-IvIzXUAY02xrxNbIxbqx8Zkfljz4zu6CHU1Wb7hE9x9rXmNZ0o_llwh2HgA5tC8GqYBym-oB6OKKfT3hPdZ4Uvlnx02R2hD-ALeoPBgxjSK4SQFWUk-2FvgHQ7-1BG7QvUl2x9JIgjsPQXnaq0j7pqIFsJYRGgFcxYEFehUEQri_Cq3zMXAT5nK8UGo3sHq_zWCTlRhtkYaxzCXMeTs4zSYz3HFCNDtNBWUbca0aEwwOQMFpG2dT6tDYOsH4uFbi1feP9jBG8xrccGZ6pGfjgXcFm_pPow4RouYlb64GxxDeu4dzDyNrl4nTXQHd63OQ4VkizzX_iOKwis7DeeBHvXAVJpZSgEJcR2TZaEteA6tE4LJQva-3Rhc3EnT9mMYuVFEvV0anPVeltArxwUDxz0ktBEmpMG_-XU8VoubM4T4xpLGUDJe97JioDzgryvaT9TF7bmLBHCELmTC--JhVTsKhtiSQNpKOtEFEjKSBTZwju2Fk5xiZ9OL6y2bHO2n9BgKxIR-jauJHv7wqJoVOuY5-nOUk2nOvnBjDUqwds4EoBsj5ZRZsPZ8YZcfSbQ_szS6F7ApP5T2nY-vwDClr3LrZbTHJgRca_Kz1iFGHXwJ1hU0ERvZftx206eYkJowvjOmt8ckjuN8HgXEheD3kcuvWb3Aa0tAxPkfu0HAPAOcQDSq6ZQ4oYKFxXbBncKwoKd84lHEtkstLBT5OAfEsWVZCvNzen_BOi7CbDQV3yEojlL8ySwRPjjovyR23paciFvPMFcQsdkWjM0sSBMRthmR_6ozIyKNe8oBYA2YMUHjJdAhakrrWPa1EP7nl1F92ulvLZhe-n7SJpDewginOPu0zuwLqkG2H4b6UGKCfAGIM2lotZ--_cgHL_QCvJg3IuyKfrcwhAplhSvRXvWUhATI4VOiidkPEQdtZ_zlL4LE13skmhx4oO3x8uWC7Xj1eo-h4PJ1AsEtM1-lTq7uU2zWnNmrHjACl3jdoj5-UZcqekBMc3SFjFze2ov3g2oyloJKgBOh-Oeig3Z5ADIVrYOU2LJhvxdR4eo26YfbjsKrEJo7mdXtuSn5u323VSupB-r2tzdFdPVOJHcrtreHArd66054kwn5fLNhk05fSJEXKVB9gsM6iNxg320Cc2A7OV3MtU84fTQI_yH0X3DuSvzcmm_FdXZ3XFyYt0Tomnns3CI_JW3Tk5819u9dcKa81iHo4Alj0c-3nsp7XK14rL0tGBYukBW-muGgIw0QucChhhMjtcorECyTPYKiFkNi0cXtbtXtjqPknFm0PjKDm5G_BNOFBzW0e4muXDstJPTBj85J7wuQyj3o8JshV_1l32vsEeEZ_mESkKuVLZqPhF0H-ljtEKNdbg1NRW0O7tHenUv3zaiILIGt8jgnFJUsHYB1LomqTlb64Ai8ZQIoZP3RMb04D3L4rprTcAanqYi6S7kVn1-kgmPJ2EWuWzVDABBwBkt2nk6JqAAK0uI56ncI8bHblF5u_ZkPigPYVhiTuMpPLaZOYeRQPjREDDkNHUzoemfbeqc-uSJMN-lvC6MAcRkhgbtCRJqNlKqZKE6XJhXtnvKlutjCxK4Wf5zMMdEzh8gEVjZiK_k47ExQSlrh9EF8WcGtYtI-1mZqiHC_gQZkTEzqFK39C5vmuj4B6WvfKXOIsUIVlt1CBlb10SM7pVUHF4wfXJ0IPgT-XiYXZNUAT3akSP7MW5-0x2BTl-YNm9wbihFv4TbuavT7bODrb_5G5J3uR8alYoAel8h9PeYLam8jGA3uTef5MCzpnPKmb21Cm0JHIw5aJkw0SraDEzqhFPkp2HtOpOjSYf9xviE7iRUoEKjs6eHJwPA6HFIWvgmTjxBQG1bZ6uKT0ej6V0l2ZxxSiO4Hw9ZkzcmcpZzTuDGbBRQNyxIL1gF3LvGfr7M8MwZQeqbhXZ8qc-YGxivs0C15auvup2B4eBNVZUrj9YqHX9iNJ08HjuniDnGpCaRK_3hwzffzo5Wv9xkGJs-gjtY_mEIz2GqzqkR7BX7AW9U3KCtWwJzNjJJ00df0D6QOuhjqtBH49Vz5zIP1066RtsUNOVYnnlThoLIV_ChyIy-qIUR5Mh8Y18I05YRegchSIivJQXpmcgjoRK1pS8n8hjz85Hn8Z5GalSrZ9GU5bvjNFAgfz1xAy9W9wbfOPYPiT6GEoz2iKvEWk27XwCzNEiftZ7fytKzofIfmL4CpvKETomls0rYpcLOoY8R3dKXfEag-YjZgCrKfXisBzhObrbBglAE8Ud6vCHdmiqjS4gbtCMfa4B5UfDJo5mRiaja0uPpmUVUPxQyB_3Z195wdGaSxhnQ3zfxbJVb_ER7KcwmLf1hE_GyuZ1cN5sfsgkMUc1ZwjklUSsO1HPpExhedUZ6dEUwcZBKPGqSLID8_DiXLqREUPkLO-eLWOtttGx27cQNzC5B4vk37i-EY-pA8hxv5a72bhN4g4j87GNFCPNY74OpRl2MLO2cAj8MSrfwB6cKffwlX5U4t_Ys-OfQTVv9SsaDgu61pNBA-wwLl2P1fxzGcnl4u6nQgZ6cszpsky24K82xUKRJ0PaWjt-OxtyhbNadDr5NeKcy1yF-K4-TTI8Q5L96_yFtbvljCZSPfqJABpli2xNWRbiEywhJgbfoduMoc5rM8igHJm48YqQCJqGPagjj6L6sdpoJxcH2MQfkMLzYYv0fEpmoIuyQnochf7sLUeg5GlZQVmuqZZykZOnKn1NcTO4C0grsdPgPgnVsHj_Sr1rvTJ_LmLJD_9fBitwe6CE3UVJJS1M0_PMUcjyzmOz-IclayomOifxNAH9X4Ry4ChwoYBHu0sgBXeH0g6v7fZn2MYSRIrAwv_ijN68RNz3bOJLvR3QjHl3FKEwuN8wwFxQAu2IHAOPhFEMy9Ah1BG1FbkyVrJGAPnXnZTfWVYaTFechX1Q15z1KvLPbv1u_439dGFq6ez1M_Zt3FiIIo4X_nxmGnvfUXKUmRcyCW8q6JrI5NAJNknJOeUER38P_X1EsyEgUmMEoxKSmZYQlKkdbzwLatEHtD9VfUzb3SOR4TBMO1k0PXFg4BeRD71YCVy4UbNMTTXJmbrxJVPPZRbW7msgqWCfyru8CMCYKWhg8oRDzgGtAh13HFu08H_-HKi4mbCeykBVQlS3pKL7P5cAbtGTf4WSvoXWYMSeUuDWyiOO5UVJIvW4cU_My3w__aPH3A2r_q1GfFvk7_izbHZMxomDliq-wMXulbfKAHMVibJs1ZNvQx52gq_AKi5adn0vbLlTDswsgLEnhgH2xJdMBgDEporqskhTaw_9ANsxX0CpP9GojYS9H2zyD0IWI2cE_o61pE0pXmQJA8wHxXbabA0_hfoYETOZVXQaN6NFylYRYhfuCMwhOkyb7j7qxjA0EeiDuccfxlDB_YxkTNEcrRs9Wb7JcEeUcVpSZUDo1TcRGV6jngXGnbvxWbg4A9suNAJn_eaUABqXhiLe1rl8HhFUvTHUJ5qYKie4PqP4nRO_rCAaFfEWxf7CpL03gVeeBuIQJNRP8Nbin2TcqZdccmImwRVlJjz3A8N4qLqKW2YUHlCsmmAJ3iBOEM0AiOGRxRl4jCGCU6d4oGN2x31RxYTWc55iyVHpNyLIC53JMnaVMK-Zt-pl4IhS-mudmkgaeqM8D9G5g4FTpeyRl7I7nD2p-XoMa7czoUtfUx3yJOMuJnZNw80xq4Gp0KcuzgqKARB1lqG3Sday-7pSuLeX3jcBjCBQstHGRVUwFyOAOIW-WHd2W-qSeCS5rGOr2dF6ssr8cmT-bjY0MBOkCUpd6390Dou6ZAr4-0NaBFgsw3EvMfqmPSqRlB7Pj5uLFP-toRtMjRO55qNd7TNhOWKlAOWDDFejrCP5-7-XvE2Fqne6yv155KPBfdjXmrFsxU2MHKkL8AbHr4QB2Lxfwn0KYLaxOkIVZn8ua0xFQUPuKQZ1DkuYv6ChncnNg4QJzR2jck5ESYlO9KUGB4EBCFVAfSB22jJbhXkx96xw1vTk-QU3uYvgihXDc6NM8ovv0GetMbBc3_yYOHO-Z13whmWTt4oN__dtr9jDOpHfiCsgz8IbXgC1Kb87-fA0RSlORLbrQXTBW1uOXYOKL9fA7hd6JtrTRwTvAwts4aO-cA7XYhVI28USTihBh5FLtqhuUvm4ogMV4lWECqIP6SBbJx9avOZGntGQHFXS4Ueg7PBjPsZaNRb5wAN_y4kpLjAL4T6fSn7glinTH3z-9YGgwCYiyRiOqPCdIdkwPZZRxmeSfWWSA3LoN5UesS852j58mQDBhMDJ3YVM-pqN-JLpB6WNlkMSvd9N0DGdExLAovPMVv52a9XhHc6_Qn8LjgfayyuQJYhN9Bcm31JbDiNqR78lVIB1KMe0-p9SG51W87RuGSPNDAHonqtTjRE0UN2OCCM4TdNzC3fA-opHDoLxMw==
         */

        private String encryptedData;

        public String getEncryptedData() {
            return encryptedData;
        }

        public void setEncryptedData(String encryptedData) {
            this.encryptedData = encryptedData;
        }
    }

    public static class WikipediaDigestBean {
        /**
         * source : {"name":"维基百科","url":"http://en.wikipedia.org/wiki/Account"}
         * summarys : [{"key":"Account","summary":"Account may refer to:Accounts is a British term for financial statements."}]
         */

        private SourceBeanXXX source;
        private List<SummarysBean> summarys;

        public SourceBeanXXX getSource() {
            return source;
        }

        public void setSource(SourceBeanXXX source) {
            this.source = source;
        }

        public List<SummarysBean> getSummarys() {
            return summarys;
        }

        public void setSummarys(List<SummarysBean> summarys) {
            this.summarys = summarys;
        }

        public static class SourceBeanXXX {
            /**
             * name : 维基百科
             * url : http://en.wikipedia.org/wiki/Account
             */

            private String name;
            private String url;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class SummarysBean {
            /**
             * key : Account
             * summary : Account may refer to:Accounts is a British term for financial statements.
             */

            private String key;
            private String summary;

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }
        }
    }
}
