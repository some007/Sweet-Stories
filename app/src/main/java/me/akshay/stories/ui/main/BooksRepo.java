package me.akshay.stories.ui.main;

import java.util.ArrayList;

import me.akshay.stories.common.model.BookModel;

public class BooksRepo {
    private final ArrayList<BookModel> books;
    public ArrayList<BookModel> LoadBooks(){
        return books;
    }

    public BooksRepo(){
        books = new ArrayList<>();
        books.add(getModel1());
        books.add(getModel2());
        books.add(getModel3());
        books.add(getModel4());
        books.add(getModel5());
        books.add(getModel6());
        books.add(getModel7());
    }

    private BookModel getModel7() {
        BookModel model = new BookModel();
        model.setCover("https://firebasestorage.googleapis.com/v0/b/meakshay-716cf.appspot.com/o/ss%2F255271.jpg?alt=media&token=29e06938-3abc-4574-966e-cce56087b71e");
        model.setId("book_07");
        model.setRating(4.5);
        model.setTitle("Bambi Story");
        model.setStory("");
        return model;
    }

    private BookModel getModel6() {
        BookModel model = new BookModel();
        model.setCover("https://firebasestorage.googleapis.com/v0/b/meakshay-716cf.appspot.com/o/ss%2F255265.jpg?alt=media&token=29c5edea-933e-4d61-ace2-0393e792efd0");
        model.setId("book_06");
        model.setRating(4.5);
        model.setTitle("Tinker bell");
        model.setStory("");
        return model;
    }

    private BookModel getModel5() {
        BookModel model = new BookModel();
        model.setCover("https://firebasestorage.googleapis.com/v0/b/meakshay-716cf.appspot.com/o/ss%2F1742729.jpg?alt=media&token=cf2e12ca-2f91-42c6-9c0f-14865b3264bd");
        model.setId("book_05");
        model.setRating(4.5);
        model.setTitle("Pinocchio Story");
        model.setStory("Long ago in Italy there lived on old clock-maker named Geppetto. Tick-tick-TOCK!" +
                " Tick-tick-TOCK! went all the clocks in his shop. When he worked, Geppetto felt happy. " +
                "But when he rested, a sad feeling came over him. “Ah!” he would think. “All my life " +
                "and no child to call my own!”  So, one day Geppetto carved a puppet from wood in the shape of a boy." +
                "He made the arms and legs of the puppet so they could move. He cut and sewed a nice outfit for it, as if it were a real boy. \"I will call you Pinocchio,\" said Geppetto.  That night, Geppetto lay the wooden puppet down onto the bed.\n" +
                "\n" +
                "From out of the window, a big star twinkled bright.  Geppetto looked out the window to the twinkling star.  \n" +
                "\n" +
                "“Bright star,” said Geppetto. “If I could make one wish, it would be for a real boy of my own.” But of course, he knew that was not possible.\n" +
                "\n" +
                "That night, the same big star swooshed right into Geppetto’s room. It changed into a Blue Fairy!  The Blue Fairy flew over to the bed.\n" +
                "\n" +
                "“Little wooden puppet,” said the Blue Fairy. “In the morning, you will be able to walk and talk like a real boy.” She tapped the puppet one time with her wand. “And if someday you can prove that you are brave and true, you may become a real boy.”\n" +
                "\n" +
                "Pinocchio’s eyes opened." +
                "“One more thing,” said the Blue Fairy. Suddenly. a cricket appeared. He was dressed mighty fine -and could talk! “Meet the Cricket\", said the Blue Fairy. He will stay with you to help you make wise choices.”" +
                "And with that, the Blue Fairy went swoosh and was gone! Out of the window and up into the night sky.\n" +
                "\n" +
                "When Geppetto woke up the next morning, he said, “I will go take my puppet out of bed.” But the bed was empty!\n" +
                "\n" +
                "“Here I am, Father!” said Pinocchio from the other side of the room.\n" +
                "\n" +
                "Geppetto swung around. “What? You can talk?”\n" +
                "\n" +
                "“Yep! I am Pinocchio, your boy!”\n" +
                "\n" +
                "“How can this be?” said Geppetto in shock. Then he said, “But who cares?” He rushed over and swept the wooden puppet into his arms. “Pinocchio, my son!” he said in great happiness." +
                "One day Pinocchio said, “I want to go to school, like other boys.”\n" +
                "\n" +
                "“Of course,” said Geppetto. But he did not have the money to buy schoolbooks.\n" +
                "\n" +
                "Later that day, Geppetto came back home with schoolbooks. “Now you can go to school,” he said.\n" +
                "\n" +
                "“But Father, where is your warm coat?”\n" +
                "\n" +
                "With a wave of his hand Geppetto said, “No need to worry about that. What matters is that you will go to school tomorrow!” He did not want Pinocchio to know he had traded his warm coat to buy the schoolbooks.\n" +
                "\n" +
                "The next morning, Pinocchio said good-bye to Geppetto." +
                "He skipped along the path to school, humming as he went. The Cricket rode on his shoulder, happy, too.\n" +
                "\n" +
                "Coming up to them on the path was a Fox and a Cat.\n" +
                "\n" +
                "“And where are you going on this fine day?” said the Fox.\n" +
                "\n" +
                "“I am going to school!” said Pinocchio.\n" +
                "\n" +
                "“On such a fine day as this?” said the Fox. “It is too nice to be stuck inside school! You should come with us, to the fair.”\n" +
                "\n" +
                "“Listen to me,” said the Fox. He put his arm around Pinocchio’s shoulder. “Anything you need to know, you can learn at the fair.”" +
                "What a fair it was! By the gate was a man dressed in white. He called out, “Come in, come in! Right this way! Get your tickets here!”\n" +
                "\n" +
                "With a sad look Pinocchio said to the Fox and Cat, “I do not have any tickets.”\n" +
                "\n" +
                "A man was selling old things at a table near the gate. He called, “Hey, you! Sell me those new schoolbooks of yours! That is how you can get money for tickets.”\n" +
                "\n" +
                "The fair was so bright and colorful and exciting, that the next thing Pinocchio knew he had sold his schoolbooks for tickets.\n" +
                "\n" +
                "“No, Pinocchio, stop!” called the Cricket, who finally got out from under the Fox’s hat. But Pinocchio, the Fox and the Cat did not hear him. They were already inside the fair." +
                "On stage was a puppet show! “I am a puppet, too!\" said Pinocchio.  \"I can dance like that!” He jumped right onto the stage and started to dance with the other puppets.\n" +
                "\n" +
                "“Look at that new puppet!” someone called. “It has no strings!”" +
                "“No strings?” said another. “Amazing!”\n" +
                "\n" +
                "Everyone laughed and laughed. They threw coins on the stage.\n" +
                "\n" +
                "The man who ran the fair saw coins fly onto the stage. “Well, now!” he said, rubbing his chin. “This puppet with no strings will make me rich!”\n" +
                "\n" +
                "The next thing Pinocchio knew, he was picked up and thrown in a birdcage. In the next moment, the door was locked shut." +
                "“Hey, get me out!” called Pinocchio. But the person who had thrown him in just left the room. Only the Cricket heard Pinocchio's calls. The Cricket ran back and forth, in and out of the birdcage, trying to find a way to free the lock.  But he could not unlock it.\n" +
                "\n" +
                "“I am stuck!” cried Pinocchio. \"How did this happen to me?\"\n" +
                "\n" +
                "“Let’s go there!” said Pinocchio. “I’m going to Pleasure Island!”\n" +
                "\n" +
                "“Augh!” said the Cricket, waving his arms in the air.");
        return model;
    }

    private BookModel getModel4() {
        BookModel model = new BookModel();
        model.setCover("https://firebasestorage.googleapis.com/v0/b/meakshay-716cf.appspot.com/o/ss%2F3846565.jpg?alt=media&token=4e3bd8c9-cc79-4737-9303-207439047909");
        model.setId("book_04");
        model.setRating(4.5);
        model.setTitle("Sleeping Beauty Fairy Tale Story");
        model.setStory("Long ago in France there lived a King and Queen.  More than anything, they longed for a child.  At last, to their great happiness, the Queen gave birth to a little girl.  All the bells in the land were rung with joy. \n" +
                "\nThe King and Queen invited all the fairies in the kingdom to the Naming Party for the baby.  And what a party it was!  Plates and silverware of pure gold were set with care before each guest. But one fairy, Maleficent, who had left 50 years before and had not been seen in all that time, showed up at the door.  Quickly the King and Queen found a place setting for the new guest.  But alas, the plate and the silverware were not of pure gold.  This made the old fairy very angry.\n" +
                "\n" +
                "Soon it was time for each Fairy to give her blessing to the baby.  When it came to Maleficent’s turn, she stood up and pointed her long finger at the sleeping baby girl in the cradle.\n" +
                "\n" +
                "“I declare, before all of you,” Maleficent called out, “that this child, on her 16th birthday, shall prick her finger on the spindle of a spinning wheel, and die!”" +
                "With a whoosh of smoke, the evil fairy vanished.  Everyone cried out with alarm, as you can imagine.  But one fairy had not yet given her blessing.  The King and Queen asked this fairy, whose name was Merryweather, to reverse the curse.  Merryweather shook her head sadly –  that was not possible.  But she could soften the curse. \n" +
                "\n" +
                "“On her 16th birthday,” she said, “when the princess pricks her finger on the spinning wheel, instead of dying she will fall asleep for 100 years.”" +
                "“One hundred years!” said the Queen.  “After our daughter turns 16, we will not know her anymore!”\n" +
                "\n" +
                "The King ordered every spinning wheel in the kingdom to be brought to the palace and burned.  To be extra sure the princess would not be anywhere near a spinning wheel, he also ordered the fairy Merryweather, along with two other fairies, Flora and Fauna, to take the baby far away.  The fairies would raise the child in a cottage, deep in the woods.  There, they would keep her safe until after her 16th birthday.  After that day it would be safe to bring back the princess, who had been named Aurora, to the castle.\n" +
                "\n" +
                "Aurora grew up knowing no others than the three fairies, whom she knew as her aunts.  The animals of the forest were her friends. \n" +
                "\nThe birds and the deer, the chipmunks and the rabbits, followed her around as she fed them treats and cooed to them.  From the time she was little, Aurora was told she must stay inside the hills that surrounded them.  She did not mind that in the least.  The woods were wide and deep inside the hills, and there was plenty of room for her to play.\n" +
                "\n" +
                "One day, Aurora came home to the cottage to find her three aunts preparing for a party.  “What’s going on?” she said.\n" +
                "\n" +
                "“Tonight we will celebrate your 16th birthday!” said Flora. “It is?” said Aurora.  “That means tomorrow I go back to the castle!”\n" +
                "\n" +
                "“Yes!” said Merryweather.  “We have kept you safe from that spinning wheel for 16 years. Soon it will be time for you to take up your royal life as a princess.”\n" +
                "\n" +
                " “And the first thing for you will be to get married,” said Fauna.\n" +
                "\n" +
                "“Married, already?” said Aurora.  “Do you know who I’m supposed to marry?”\n" +
                "\n" +
                "“We do,” said Fauna with a wave of her hand, “but there’s no need to worry about that.  Even if he’s a bit strange, some might say a bit horrid,  you won’t have to spend much time with him,after all.”\n" +
                "\n" +
                "“And he does come from a fine family,” Flora added with a quick smile.\n" +
                "\n" +
               "“For the rest of your life, of course,” said Fauna.\n" +
                "\n" +
                "“No, no, this is all wrong!” cried Aurora.  She turned away, then said in a firm voice,  “I would rather prick my finger on a spinning wheel and fall asleep for 100 years than have to marry someone I don't want to marry! Maybe by the time I wake up, people won’t have to get married if they don’t want to!”  And she ran out the door.\n" +
                "\n" +
                "“Dear me,” said Merryweather to the other two fairies.  “I don’t believe that went over very well.”\n" +
                "“What’s that?” said the stranger, hopping out of the carriage.  Very nicely dressed was he, and well mannered, too." +
                "“A spinning wheel,” said Aurora.\n" +
                "\n" +
                "“A spinning wheel!” said the stranger.  “But there are none left in the land – everyone knows that.”");
        return model;
    }

    private BookModel getModel3() {
        BookModel model = new BookModel();
        model.setCover("https://firebasestorage.googleapis.com/v0/b/meakshay-716cf.appspot.com/o/ss%2F448118.jpg?alt=media&token=fd79bdd7-0c2c-4a06-8807-c0d4a5224665");
        model.setId("book_03");
        model.setRating(4.5);
        model.setTitle("Maui from Moana: Tales of the Demi-God");
        model.setStory("One day Maui said to his four brothers, “Come fishing with me today!  Let’s go far out to sea. The fish are much bigger and better there, than they are close to land.”  \n" +
                "\n" +
                "“Okay!” said his brothers.  They were good fishermen and wanted those big fish.  The four brothers and Maui jumped into their canoe and started to row.  When they got far out to sea and could no longer see land, Maui jumped onto the end of the canoe.  He drew out his magical fishing hook. When his brothers were looking ahead, he cast the hook over the side of the canoe.  The hook sunk down deep into the blue water.  " +
                "Soon, the magical hook stuck fast to the bottom of the sea. Maui pulled the fishing line tight. He called out, “See that tug? I must have hooked a giant fish!”\n" +
                "\n" +
                "“Wow, I see that!” said one brother. \n" +
                "\n" +
                "\"That is some fish you caught!\" said another.\n" +
                "\n" +
                "“My brothers!” Maui called out.  “Paddle hard so we can bring up this great fish!”\n" +
                "\n" +
                "The brothers paddled with all their might.  They paddled so hard they did not see that the hook was pulling up the land from the bottom of the sea.  Behind them, one island after another rose from the sea!\n" +
                "\n" +
                "Legend says that is how Maui made the islands, where the people now live.\n" +
                "\n" +
                "Maui Catches the Sun\n" +
                "\n" +
                "One day, Maui wanted to see how life was for the people who lived on the islands.  But what he saw there made his heart skip a beat. Life was very hard for them. And he could see why - the days were just too short!  There was not time in a day for people to do what they needed to do, like making and cooking food. If they laid out a wet blanket on the sand, the blanket would still be wet the next day.  There was not even time for the fruit in the trees to get ripe.\n" +
                "\n" +
                "“It is that Sun!” said Maui.  “He is racing too fast across the sky!  He is not thinking about the people who live down below, on the islands.”  " +
                "Maui knew it was up to him, a demi-god, to slow down the Sun. But how?  He asked his brothers. He asked his sister Hina. He asked still others that he knew.  \n" +
                "\n" +
                "“Who do you think you are, Maui?” said one.  “No one can catch the Sun!”\n" +
                "\n" +
                "“Even if you are a demi-god,” said another, “you know very well the Sun is too big and bright for anyone to stop.”\n" +
                "\n" +
                "But Maui’s sister Hina did not say these sorts of things.  She cut off her long hair.  She tied the hair into ropes and gave the ropes to Maui.  From those ropes, Maui made a giant lasso.  \n" +
                "\n" +
                "That night, Maui took his lasso up to the very tallest mountain on the islands of Hawaii.  The mountain had once been an active volcano. Years ago it had sent out waves of hot lava.  When the volcano was over, a big crater was left at the top of the mountain.  And that crater is where Maui planned to catch the Sun.\n" +
                "\n" +
                "By the crater Maui waited, very still.  He hid the lasso behind him, out of view. When the Sun rose at dawn, it started to race across the sky very fast.  Soon that Sun was flying over the mountaintop. Brave Maui flung the lasso over his head. The ropes caught!  The Sun tried and tried to move, but was trapped!" +
                "The Sun tried to move again, but could not.  “Oh, very well!” the Sun said, at last. You can be sure Maui was very glad to hear that!  “I suppose I could slow down a little,\" said the Sun. \"But only for part of the year.”\n" +
                "\n" +
                "So Maui and the Sun worked out a deal.  For half the year, the Sun would move at a slow pace.  Those days would be long, and that would be the summer. For the other half of the year, the sun could run as fast as it wanted to do.  Those days would be short, and that would be the winter.\n" +
                "\n" +
                "This is how Maui made the days longer for the people of the islands.  At last, they could do the tasks they needed. They could have a full dinner and rest after.  And the fruits on the trees grew big and sweet. \n" +
                "\n");
        return model;
    }

    private BookModel getModel2() {
        BookModel model = new BookModel();
        model.setCover("https://firebasestorage.googleapis.com/v0/b/meakshay-716cf.appspot.com/o/ss%2F448103.jpg?alt=media&token=ae56b9fa-39d8-40ee-9ef8-d36bf6b68023");
        model.setId("book_02");
        model.setRating(4.5);
        model.setTitle("Aladdin and the magic lamp");
        model.setStory("Once upon a time, a young man’s father died.  Aladdin, as that was the young man’s name, took his father’s place in running the family store with his mother.  One day, a stranger walked into the store.\n" +
                "\n" +
                "“I am your uncle,” said the stranger to Aladdin.  “I have come to see you.”\n" +
                "\n" +
                "“But my father never spoke of a brother,” said Aladdin.\n" +
                "\n" +
                "Aladdin’s mother turned around. “My husband had no brother,” said she to the stranger, narrowing her eyes.\n" +
                "\n" +
                "“I assure you it is true,” said the stranger. “Years ago your husband and I agreed that if something should happen to him, since I have been very fortunate in my life, I would help to bring the same good fortune to your family.”\n" +
                "\n" +
                "The mother was interested.  “What do you have in mind?” she said.\n" +
                "\n" +
                "“I know of a secret place that holds many riches,” said the stranger.  “I will take your son. With the wealth he will find there, you and he will be set for life.”" +
                "And so the mother agreed.  The old man and the boy traveled for days throughout the desert.  At last they came to a cave. “You must know that I learned a bit of magic in my life,” said the old man to Aladdin.  “Don’t be surprised by anything you might see.”\n" +
                "\n" +
                "They stepped inside the cave.  Pitch-black it was. The old man shook open his fist and a ball of light suddenly appeared, brightening the cave.  Under the light with one long finger, he drew the shape of a circle over the ground. He pulled from his pocket some red dust and threw it over the circle, and at the same time said some magic words.  The earth trembled a little before them. The floor of the cave cracked open, and the cracks grew wider and deeper. Then up from below the ground rose a giant white quartz crystal and it filled the circle. \n" +
                "\n" +
                "“Do not be alarmed,” said the magician.  “Under this giant white crystal lies a treasure that is to be yours.”    \n" +
                "\n" +
                "He chanted a few magic words and the giant crystal rose up several feet in the air, moved to the side and landed.  Aladdin peered into the hole. He saw steps that led down to a dark hole.\n" +
                "\n" +
                " “Fear nothing,” said the magician to Aladdin. “But obey me. Go down, and at the foot of the steps, follow a long hall.  You will walk through a garden of fruit trees. You must touch nothing of them. Walk on till you come to a large flat stone and on the stone will be a lighted lamp.  Pour out the oil in the lamp and bring it to me. Now go!”\n" +
                "\n" +
                " Aladdin slowly stepped down the stairs.  Through the garden of fruit trees and marvelous to behold, the trees held fruits that sparkled and shone. He could not help but reach out and touch one. \n" +
                "\n" +
                "Then – too late – he remembered what his uncle had said. But nothing terrible happened. So he figured he might as well put the fine jewel-fruit in his vest pocket.  Then he plucked another and another jewel-fruit, till all his pockets were filled.\n" +
                "\n" +
                "Aladdin came to the large flat stone, and on it was a lighted lamp, just as his uncle had said.  He poured out the oil and took it back to the opening of the cave." +
                "Aladdin called out, “Here I am, Uncle!”\n" +
                "\n" +
                "The magician called out in a great hurry, “Give me the lamp!”\n" +
                "\n" +
                "“Just as soon as I’m up,” said Aladdin, wondering why the magician seemed in such a hurry.  \n" +
                "\n" +
                "“No, give me the lamp NOW!” cried the old man, reaching down his hand.  For you see, the only way the lamp could come out of the cave was as a gift, from one person to another. \n" +
                "\n" +
                "The magician knew this, and he wanted to get the lamp from the boy as soon as he could, and then kill him.  Aladdin felt a chill in the air. Something was wrong. Somehow he knew he must not give up that lamp.  \n" +
                "\n" +
                "“Let me up first,\" said Aladdin.  \"Then will I give you the lamp.”\n" +
                "You can imagine the mother’s surprise!  The Genie rose up out of the lamp, and a feast fit for a king weighed down her kitchen table, on plates of glimmering gold.   \n");
        return model;
    }

    private BookModel getModel1() {
        BookModel model1 = new BookModel();
        model1.setCover("https://firebasestorage.googleapis.com/v0/b/meakshay-716cf.appspot.com/o/ss%2F448066.jpg?alt=media&token=d89dbdc6-8def-4bdb-ad8e-95061669cd9b");
        model1.setId("book_01");
        model1.setRating(4.6);
        model1.setTitle("Cinderella Fairytale");
        model1.setStory("ONCE UPON A TIME a girl named Cinderella lived with her stepmother and two" +
                " stepsisters.  Poor Cinderella had to work hard all day long so the others could rest." +
                " It was she who had to wake up each morning when it was still dark and cold to start the fire. " +
                " It was she who cooked the meals. It was she who kept the fire going. The poor girl " +
                "could not stay clean, from all the ashes and cinders by the fire.“What a mess!” " +
                "her two stepsisters laughed.  And that is why they called her “Cinderella.”\n"+
                "One day, big news came to town.  The King and Queen were going to have a ball!" +
                "  It was time for the Prince to find a bride. All of the young ladies in the land " +
                "were invited to come.  They were wild with joy! They would wear their most beautiful " +
                "gown and fix their hair extra nice. Maybe the prince would like them!\n" +
                "At Cinderella’s house, she now had extra work to do.  She had to make two brand-new gowns for her step-sisters."+
                "“Faster!” shouted one step-sister.\n" +
                "\n" +
                "“You call that a dress?” screamed the other.  \n" +
                "\n" +
                "“Oh, dear!” said Cinderella.  “When can I–“\n" +
                "\n" +
                "The stepmother marched into the room.  “When can you WHAT?”\n" +
                "\n" +
                "“Well,” said the girl, “when will I have time to make my own dress for the ball?”\n" +
                "\n" +
                "“You?” yelled the stepmother.  “Who said YOU were going to the ball?”\n" +
                "\n" +
                "“What a laugh!” said one step-sister.\n" +
                "\n" +
                "“Such a mess!” They pointed at Cinderella.  All of them laughed.\n" +
                "\n" +
                "Cinderella said to herself, “When they look at me, maybe they see a mess.  But I am not that way.  And if I could, I WOULD go to the ball.”\n" +
                "\n" +
                "Soon the time came for the stepmother and step-sisters to leave for the big party.\n" +
                "\n" +
                "Their fine carriage came to the door. The stepmother and step-sisters hopped inside.  And they were off.\n" +
                "\n" +
                "“Good-bye!” called Cinderella.  “Have a good time!” But her stepmother and step-sisters did not turn around to see her.\n" +
                "\n" +
                "“Ah, me!” said Cinderella sadly.  The carriage rode down the street.  She said aloud, “I wish I could go to the ball, too!”\n" +

                "“Am I dreaming?” said Cinderella, looking around her.\n" +
                "\n" +
                "“It is as real, as real can be,” said the Fairy Godmother.  “But there is one thing you must know.”\n" +
                "\n" +
                "“What is that?”\n" +
                "\n" +
                "“All of this lasts only to midnight.  Tonight, at the stroke of midnight, it will all be over.  Everything will go back to how it was before.”\n" +
                "\n" +
                "“Then I must be sure to leave the ball before midnight!” said Cinderella.\n" +
                "\n" +
                "“Good idea,” said the Fairy Godmother.  She stepped back. “My work is done.” And with that, the Fairy Godmother was gone.\n" +
                "\n" +
                "Cinderella looked around her.  \"Did that even happen?\"  But there she stood in a fine gown, and with a golden band in her hair.  And there were her driver and four horses before her, waiting.\n" +
                "“This cannot BE!” yelled the stepmother.  \n" +
                "\n" +
                "But it was too late.  The prince knew that Cinderella was the one.  He looked into her eyes. He did not see the cinders in her hair or the ashes on her face.\n" +
                "\n" +
                "“I have found you!” he said.\n" +
                "\n" +
                "“And I have found you,” said Cinderella.\n" +
                "\n" +
                "And so Cinderella and the Prince were married, and they lived happily ever after.");
        return model1;
    }


}
