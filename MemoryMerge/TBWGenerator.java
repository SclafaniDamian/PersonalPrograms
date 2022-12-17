// Made By Damian Sclafani
package MemoryMerge;
import java.util.ArrayList;

public class TBWGenerator {
    private ArrayList<String> characters = new ArrayList<>();

    public TBWGenerator() {
        createArray();
    }
    
    public String generateAny() {
        int rand = (int)(Math.random()*characters.size());
        return characters.get(rand);
    }

    public String generateEquipment() {
        int rand = (int)(Math.random()*183);
        return characters.get(rand);
    }

    private void createArray() {
        characters.add("E1. Trampoline");
        characters.add("E2. Sleeping Song");
        characters.add("E3. Zap");
        characters.add("E4. Bolt");
        characters.add("E5. Lightning Bolt");
        characters.add("E6. Booster");
        characters.add("E7. Mana Pump");
        characters.add("E8. Baseball");
        characters.add("E9. Darkness");
        characters.add("E10. Mimic Magic");
        characters.add("E11. Bull Rush");
        characters.add("E12. The Summoning");
        characters.add("E13. Magic Hand");
        characters.add("E14. Rat Poison");
        characters.add("E15. Pills");
        characters.add("E16. Medkit");
        characters.add("E17. Bandage");
        characters.add("E18. Doc Kit");
        characters.add("E19. The Return");
        characters.add("E20. Vacuum Cleaner");
        characters.add("E21. Gamble");
        characters.add("E22. Mega Fertilizer");
        characters.add("E23. Photosynthesis");
        characters.add("E24. Sticky Bomb");
        characters.add("E25. Iron Armor");
        characters.add("E26. Steel Armor");
        characters.add("E27. Magic Shield");
        characters.add("E28. Root Shield");
        characters.add("E29. Magnet");
        characters.add("E30. Eruption");
        characters.add("E31. Coffee Machine");
        characters.add("E32. Green Lightning");
        characters.add("E33. EMP Grenade");
        characters.add("E34. Negative Energy");
        characters.add("E35. Rocket Jets");
        characters.add("E36. Teleporter");
        characters.add("E37. Creation Spell");
        characters.add("E38. Triple Lightning");
        characters.add("E39. Big Bomb");
        characters.add("E40. Energy Drink");
        characters.add("E41. Birdification");
        characters.add("E42. Sky Laser");
        characters.add("E43. Armory");
        characters.add("E44. Sky Light; Storm");
        characters.add("E45. Sky Light; Slash");
        characters.add("E46. Frost Breath");
        characters.add("E47. Training");
        characters.add("E48. Atom Bomb");
        characters.add("E49. Dance Battle");
        characters.add("E50. Sky Light; Ganym");
        characters.add("E51. Rescue");
        characters.add("E52. Flashlight");
        characters.add("E53. Gas Grenade");
        characters.add("E54. Magic Malfunction");
        characters.add("E55. Furious Winds");
        characters.add("E56. Earth Shatter");
        characters.add("E57. Ratify");
        characters.add("E58. Bag of Rats");
        characters.add("E59. Boomerang");
        characters.add("E60. Stage");
        characters.add("E61. Christmas Gifts");
        characters.add("E62. Rocket Fist");
        characters.add("E63. Thunder Bolt");
        characters.add("E64. Geometry");
        characters.add("E65. Trigonometry");
        characters.add("E66. Calculus");
        characters.add("E67. Algebra");
        characters.add("E68. Earthquake");
        characters.add("E69. Halloween Candy");
        characters.add("E70. Smoke Machine");
        characters.add("E71. Shock Caller");
        characters.add("E72. Shock's Package");
        characters.add("E73. Cloning Machine");
        characters.add("E74. Ammo Box");
        characters.add("E75. Smoke Bomb");
        characters.add("E76. Mind Control");
        characters.add("E77. Fooled");
        characters.add("E78. Rock, Paper, Scissors");
        characters.add("E79. Pepper Spray");
        characters.add("E80. Fresh Meat");
        characters.add("E81. Cable");
        characters.add("E82. Vine Wrap");
        characters.add("E83. Reflector Shield");
        characters.add("E84. Medical Grenades");
        characters.add("E85. Electrolight");
        characters.add("E86. Disease");
        characters.add("E87. Time to Shine");
        characters.add("E88. Chisel");
        characters.add("E89. Beaker");
        characters.add("E90. Sprout");
        characters.add("E91. Padlock");
        characters.add("E92. Battlecry");
        characters.add("E93. Spiked Hook");
        characters.add("E94. Freeze");
        characters.add("E95. Mana Shield");
        characters.add("E96. Flameroast");
        characters.add("E97. Duelist");
        characters.add("E98. Snake Cage");
        characters.add("E99. Witch Potion");
        characters.add("E100. Crazy Chemicals");
        characters.add("E101. Duel");
        characters.add("E102. Tournament");
        characters.add("E103. Aggressive Current");
        characters.add("E104. Zombify");
        characters.add("E105. Snake! Eagle! Person!");
        characters.add("E106. Brawl");
        characters.add("E107. Double Dice");
        characters.add("E108. Necromius, The Legendary Blade");
        characters.add("E109. Rattle");
        characters.add("E110. Battleheart");
        characters.add("E111. Leech Life");
        characters.add("E112. Fireball");
        characters.add("E113. Blazing Arrow");
        characters.add("E114. Geyser");
        characters.add("E115. Twig of Gifting");
        characters.add("E116. Sky Light; Snowball");
        characters.add("E117. Throwing Knife");
        characters.add("E118. Sky Light; Mecha-Hawk");
        characters.add("E119. Battlerage");
        characters.add("E120. Lunge");
        characters.add("E121. Syringe");
        characters.add("E122. Bag of Bones");
        characters.add("E123. Blessings");
        characters.add("E124. Minions!");
        characters.add("E125. Refreshment");
        characters.add("E126. Necro Arrow");
        characters.add("E127. Unprepared Medkit");
        characters.add("E128. Cupid's Arrow");
        characters.add("E129. Hammer Toss");
        characters.add("E130. Life Drain");
        characters.add("E131. Vampiric");
        characters.add("E132. Care Package");
        characters.add("E133. Wish");
        characters.add("E134. Inner Beast");
        characters.add("E135. Stake");
        characters.add("E136. Horn");
        characters.add("E137. Sacred Spell");
        characters.add("E138. Goop Spray");
        characters.add("E139. Secret Relic");
        characters.add("E140. Forgotten Relic");
        characters.add("E141. Ancient Relic");
        characters.add("E142. Overgrowth");
        characters.add("E143. Neutral Energy");
        characters.add("E144. Pocket Sand");
        characters.add("E145. Leap");
        characters.add("E146. Sprint");
        characters.add("E147. Bet");
        characters.add("E148. Recreate");
        characters.add("E149. Crushing Blow");
        characters.add("E150. Air Strike");
        characters.add("E151. Storm Cloud");
        characters.add("E152. Wave");
        characters.add("E153. Positive Energy");
        characters.add("E154. Arcane Bomb");
        characters.add("E155. Inferno");
        characters.add("E156. Earthen Might");
        characters.add("E157. Regrow");
        characters.add("E158. Blood Burst");
        characters.add("E159. Yellow Potion");
        characters.add("E160. Gray Potion");
        characters.add("E161. Red Potion");
        characters.add("E162. Purple Potion");
        characters.add("E163. Orange Potion");
        characters.add("E164. Green Potion");
        characters.add("E165. Blue Potion");
        characters.add("E166. White Potion");
        characters.add("E167. Black Potion");
        characters.add("E168. Pink Potion");
        characters.add("E169. Rainbow Potion");
        characters.add("E170. Gust");
        characters.add("E171. Sunshine");
        characters.add("E172. Dark Pact");
        characters.add("E173. Icicles");
        characters.add("E174. Goop Shield");
        characters.add("E175. Slam");
        characters.add("E176. Force Field");
        characters.add("E177. River");
        characters.add("E178. Elemental Burst");
        characters.add("E179. Telekinesis");
        characters.add("E180. Sap");
        characters.add("E181. Laser Pointer");
        characters.add("E182. Molten Armor");
        characters.add("E183. Scope");
        characters.add("S1. Knight");
        characters.add("S2. Valkyrie");
        characters.add("S3. Heavy");
        characters.add("S4. Archer");
        characters.add("S5. Mage");
        characters.add("S6. Spy");
        characters.add("S7. Shieldman");
        characters.add("S8. Shifter");
        characters.add("S9. Bomber");
        characters.add("S10. Basic Giant");
        characters.add("S11. Hatchetman");
        characters.add("S12. Sparrow");
        characters.add("1. Psycho");
        characters.add("2. Queen");
        characters.add("3. Meghoul");
        characters.add("4. Rat");
        characters.add("5. Dicey");
        characters.add("6. Basic Zombie");
        characters.add("7. Backup Dancer");
        characters.add("8. Piper");
        characters.add("9. Spitter");
        characters.add("10. Nuclear Waste");
        characters.add("11. Zombie Giant");
        characters.add("12. Zombie Dancer");
        characters.add("13. Zombie Singer");
        characters.add("14. Zombie SLayer");
        characters.add("15. Mana Station");
        characters.add("16. Archer Tower");
        characters.add("17. Sniper");
        characters.add("18. Skeleton");
        characters.add("19. Vampire");
        characters.add("20. Zombie Cyborg");
        characters.add("21. Vampire Slayer");
        characters.add("22. Singer");
        characters.add("23. Clown");
        characters.add("24. Dancer");
        characters.add("25. Jukebox");
        characters.add("26. Double Trouble");
        characters.add("27. Finale");
        characters.add("28. Disco Ball");
        characters.add("29. Undead Dancer");
        characters.add("30. Cloner");
        characters.add("31. Experiment");
        characters.add("32. Chemist");
        characters.add("33. Sniper Tower");
        characters.add("34. King's Cannon");
        characters.add("35. Jouster");
        characters.add("36. Coach");
        characters.add("37. Jester");
        characters.add("38. King");
        characters.add("39. Card Dealer");
        characters.add("40. Spirit");
        characters.add("41. Mimic");
        characters.add("42. Crypt");
        characters.add("43. Mana Soldier");
        characters.add("44. Corrupted Soldier");
        characters.add("45. Model");
        characters.add("46. Crystal");
        characters.add("47. Xyle");
        characters.add("48. Necromancer");
        characters.add("49. Witch");
        characters.add("50. Giant Skeleton");
        characters.add("51. Sylo");
        characters.add("52. Mountain Pack");
        characters.add("53. Werewolf");
        characters.add("54. Basic Human");
        characters.add("55. Sensei");
        characters.add("56. Ninja");
        characters.add("57. Training Sparrow");
        characters.add("58. Saboteur");
        characters.add("59. Medic");
        characters.add("60. General");
        characters.add("61. Rock");
        characters.add("62. Scissors");
        characters.add("63. Paper");
        characters.add("64. Mascot");
        characters.add("65. Mutant Fish");
        characters.add("66. Nightmare");
        characters.add("67. Cheerleader");
        characters.add("68. Disruption");
        characters.add("69. Police Magic");
        characters.add("70. Curse");
        characters.add("71. Pain Seeker");
        characters.add("72. Boxer Bot");
        characters.add("73. Angry Giant");
        characters.add("74. Mechanic");
        characters.add("75. Builder");
        characters.add("76. Mutant Frog");
        characters.add("77. Shaman");
        characters.add("78. Elder Indian");
        characters.add("79. Indian Brute");
        characters.add("80. Basher");
        characters.add("81. Indian Spearman");
        characters.add("82. Immortal");
        characters.add("83. Indian Ruler");
        characters.add("84. Bruiser");
        characters.add("85. Boxer");
        characters.add("86. Cactus");
        characters.add("87. Thorn Bush");
        characters.add("88. Firefighter");
        characters.add("89. Chess Pawn");
        characters.add("90. Chess Rook");
        characters.add("91. Chess Knight");
        characters.add("92. Chess Bishop");
        characters.add("93. Chess Queen");
        characters.add("94. Chess King");
        characters.add("95. Ice Giant");
        characters.add("96. Ice Creature");
        characters.add("97. Fire Spirit");
        characters.add("98. Fire Minion");
        characters.add("99. Sevens");
        characters.add("100. Ten of Giants");
        characters.add("101. Assassin");
        characters.add("102. Sugar Rush");
        characters.add("103. Cuatro");
        characters.add("104. Uno");
        characters.add("105. Ghost");
        characters.add("106. Mime");
        characters.add("107. Magic Mime");
        characters.add("108. Grave Robber");
        characters.add("109. Shotgunner");
        characters.add("110. Torchman");
        characters.add("111. Buzzsaw");
        characters.add("112. Morph");
        characters.add("113. Elven Archer");
        characters.add("114. Four-Armed Monster");
        characters.add("115. Vigilante");
        characters.add("116. Police Officer");
        characters.add("117. Janitor");
        characters.add("118. Nuke");
        characters.add("119. Gardener");
        characters.add("120. Vortex");
        characters.add("121. Red Coat");
        characters.add("122. Blue Coat");
        characters.add("123. Undying");
        characters.add("124. Coffee Guy");
        characters.add("125. Root");
        characters.add("126. Seed");
        characters.add("127. Arm Wrestler");
        characters.add("128. Tree");
        characters.add("129. Ivy");
        characters.add("130. Elementalist");
        characters.add("131. Sneaky");
        characters.add("132. Vine");
        characters.add("133. Life Spirit");
        characters.add("134. Sand Spirit");
        characters.add("135. Aqua Spirit");
        characters.add("136. Golem");
        characters.add("137. Ultrapowerful Spirit");
        characters.add("138. Storm");
        characters.add("139. Rock Thrower");
        characters.add("140. Robot Destroyer");
        characters.add("141. Hammer Man");
        characters.add("142. Human Shield");
        characters.add("143. Slash");
        characters.add("144. Knife Juggler");
        characters.add("145. Decay");
        characters.add("146. Nuclear Plant");
        characters.add("147. Dynamite");
        characters.add("148. Sheriff");
        characters.add("149. Samurai");
        characters.add("150. Doubler");
        characters.add("151. Tripler");
        characters.add("152. Engineer");
        characters.add("153. Elementalist");
        characters.add("154. Vender");
        characters.add("155. Paparazzi");
        characters.add("156. Camera Crew");
        characters.add("157. Sloth");
        characters.add("158. Turtle");
        characters.add("159. DJ");
        characters.add("160. Chameleon");
        characters.add("161. Zookeeper");
        characters.add("162. Snake");
        characters.add("163. Time Bomb");
        characters.add("164. Laser Cannon");
        characters.add("165. Electro Bot");
        characters.add("166. Rat Hoarder");
        characters.add("167. Blueberry Beast");
        characters.add("168. Thief");
        characters.add("169. Fusion");
        characters.add("170. Strong Gambler");
        characters.add("171. Shadow");
        characters.add("172. Ganym");
        characters.add("173. Basic Bot");
        characters.add("174. Medusa");
        characters.add("175. Builder Bot");
        characters.add("176. Commander");
        characters.add("177. Medical Bot");
        characters.add("178. Bot Commander");
        characters.add("179. Gladiator Bot");
        characters.add("180. Gadgeteer");
        characters.add("181. Blueberry");
        characters.add("182. Blueberry Bush");
        characters.add("183. Panda");
        characters.add("184. Infectious Zombie");
        characters.add("185. Shadowmancer");
        characters.add("186. Goo Monster");
        characters.add("187. Volcano");
        characters.add("188. Teacher");
        characters.add("189. Modifier");
        characters.add("190. Rockstar");
        characters.add("191. Pico The Panda");
        characters.add("192. Pirate");
        characters.add("193. Picolo the Pandalo");
        characters.add("194. Fatty");
        characters.add("195. Shurikiwi");
        characters.add("196. Ice Ninja");
        characters.add("197. Finger Gunner");
        characters.add("198. Grown Ghoul");
        characters.add("199. Summoner");
        characters.add("200. Haunter");
        characters.add("201. Stalker");
        characters.add("202. Creeper");
        characters.add("203. Skeleton King");
        characters.add("204. Puppet Master");
        characters.add("205. Peasant");
        characters.add("206. Journalist");
        characters.add("207. Triangle");
        characters.add("208. Square");
        characters.add("209. Town Square");
        characters.add("210. Rat Farmer");
        characters.add("211. Rat Hunter");
        characters.add("212. Halloween Ghost");
        characters.add("213. Pop Star");
        characters.add("214. Shock");
        characters.add("215. Jeti");
        characters.add("216. Anti-Jeti");
        characters.add("217. Dog With Fireworks");
        characters.add("218. Gas Giant");
        characters.add("219. Caveman");
        characters.add("220. Ice Cube");
        characters.add("221. Zombie Bomber");
        characters.add("222. Rabbit");
        characters.add("223. Disinfector");
        characters.add("224. Medium");
        characters.add("225. Amnesiac");
        characters.add("226. Executioner");
        characters.add("227. Grim Reaper");
        characters.add("228. Neverdead");
        characters.add("229. Baseball Bomber");
        characters.add("230. Swat");
        characters.add("231. Batter Gang");
        characters.add("232. Conversion");
        characters.add("233. Liopleurodon");
        characters.add("234. Alien");
        characters.add("235. Alien Commander");
        characters.add("236. Tesla");
        characters.add("237. Electric Spirit");
        characters.add("238. Beetle Dragon");
        characters.add("239. Indian Spy");
        characters.add("240. Mortar");
        characters.add("241. Tank Commander");
        characters.add("242. Captain Bluebeard");
        characters.add("243. Prince");
        characters.add("244. Zombie Minion");
        characters.add("245. Bait");
        characters.add("246. Futuristic Archer");
        characters.add("247. Futuristic Grenader");
        characters.add("248. Futuristic Ninja");
        characters.add("249. Transporter");
        characters.add("250. Psychic");
        characters.add("251. Judge");
        characters.add("252. Revenge");
        characters.add("253. Citizen");
        characters.add("254. Bounty Hunter");
        characters.add("255. Sentry Gun");
        characters.add("256. Bowler");
        characters.add("257. Shielder");
        characters.add("258. Mech");
        characters.add("259. Driver Bot");
        characters.add("260. Blood Harvester");
        characters.add("261. Boss");
        characters.add("262. Town Drunk");
        characters.add("263. Security Bot");
        characters.add("264. The Overview");
        characters.add("265. Hacker");
        characters.add("266. Barbarian");
        characters.add("267. Lazy King");
        characters.add("268. Chef");
        characters.add("269. Hero");
        characters.add("270. Portal Scientist");
        characters.add("271. Portal Master");
        characters.add("272. Starter Killer");
        characters.add("273. Magician");
        characters.add("274. Cannonier");
        characters.add("275. Zombie Cannonier");
        characters.add("276. Titanranium");
        characters.add("277. Titan");
        characters.add("278. Doctor Doofderburger");
        characters.add("279. Runner");
        characters.add("280. Health Bomber");
        characters.add("281. Flytrap");
        characters.add("282. Mutant Flytrap");
        characters.add("283. Mercenary");
        characters.add("284. Swordsman");
        characters.add("285. Soul Stealer");
        characters.add("286. Rush");
        characters.add("287. Night Storm");
        characters.add("288. Cienna");
        characters.add("289. Agrippa");
        characters.add("290. Lena");
        characters.add("291. Sleeping Giant");
        characters.add("292. Honey");
        characters.add("293. Gladiator");
        characters.add("294. Maniac");
        characters.add("295. Traitor");
        characters.add("296. Mobster");
        characters.add("297. Flower");
        characters.add("298. Agent");
        characters.add("299. Bear");
        characters.add("300. Starfruit");
        characters.add("301. Guardian Statue");
        characters.add("302. Abomination");
        characters.add("303. Worshipper");
        characters.add("304. Fake Worshipper");
        characters.add("305. Hooded Archer");
        characters.add("306. Crazed Worshipper");
        characters.add("307. Secret Bearer");
        characters.add("308. Lelo");
        characters.add("309. Ghost Hunter");
        characters.add("310. Eleven Archers");
        characters.add("311. Black Mushroom");
        characters.add("312. Black Mushroom");
        characters.add("313. Knucklehead");
        characters.add("314. Monstrosity");
        characters.add("315. Champion");
        characters.add("316. Infested");
        characters.add("317. Rat Thrower");
        characters.add("318. Rock Polisher");
        characters.add("319. Football Star");
        characters.add("320. Soccer Star");
        characters.add("321. Bird");
        characters.add("322. Nest");
        characters.add("323. Zombiemancer");
        characters.add("324. Corpse Muncher");
        characters.add("325. Butler");
        characters.add("326. Rat King");
        characters.add("327. Dancing Queen");
        characters.add("328. Luck Spirit");
        characters.add("329. Toy Maker");
        characters.add("330. Pharaoh");
        characters.add("331. Party Bot");
        characters.add("332. Powerbuster");
        characters.add("333. Announcer");
        characters.add("334. Warlord");
        characters.add("335. Voodoo");
        characters.add("336. Warlock");
        characters.add("337. Elemental");
        characters.add("338. Creature");
        characters.add("339. Dealmaker");
        characters.add("340. Skeletal Spy");
        characters.add("341. Skeletal Warrior");
        characters.add("342. Cheater");
        characters.add("343. Drunken Knight");
        characters.add("344. Indian Axeman");
        characters.add("345. Rangatang");
        characters.add("346. Gentle Giant");
        characters.add("347. Sylus");
        characters.add("348. Tidal Wave");
        characters.add("349. Blob");
        characters.add("350. Hover Bot");
        characters.add("351. Funbot");
        characters.add("352. Molten Giant");
        characters.add("353. Flame Thrower");
        characters.add("354. Pyromaniac");
        characters.add("355. Catapult");
        characters.add("356. Twigius, The Absolute Twig");
        characters.add("357. Wodden Warrior");
        characters.add("358. Inferno Spirit");
        characters.add("359. Jumping Bean");
        characters.add("360. Mutant Rabbit");
        characters.add("361. Inflamed Archer");
        characters.add("362. Dwarf");
        characters.add("363. Angel");
        characters.add("364. Artist");
        characters.add("365. Leech");
        characters.add("366. Wizard");
        characters.add("367. Rat Rider");
        characters.add("368. Mutant Rat");
        characters.add("369. Humongous");
        characters.add("370. Backstabber");
        characters.add("371. Dark Spirit");
        characters.add("372. Light Spirit");
        characters.add("373. Gatekeeper");
        characters.add("374. Portal");
        characters.add("375. Corrupted Gatekeeper");
        characters.add("376. Rattlesnake");
        characters.add("377. Frost Spirit");
        // Continue with the rest of the unlockable units
        characters.add("FF1. Lionheart Knight");
        characters.add("FF2. Enslaved Giant");
        // Continue with the rest of the full force characters
    }
}
