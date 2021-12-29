<template lang="html">
  <v-container style="position:relative">
    <v-layout row wrap class="floor-map" v-if="getUsers.length > 0">
      <v-flex xs12>
        <v-layout row wrap>
          <v-flex xs2 pl-3> <strong>TED</strong><small>7</small> </v-flex>
          <v-flex xs2> <strong>IST</strong><small>12</small> </v-flex>
          <v-flex xs2> <strong>YPO</strong><small>90</small> </v-flex>
          <v-flex xs2> <strong>YPO</strong><small>BNP</small> </v-flex>
          <v-flex xs2> <strong>TOTAL</strong><small>336</small> </v-flex>
        </v-layout>
        <v-layout row wrap>
          <v-flex xs2 pl-3>
            <strong>Innovation</strong><small>12</small>
          </v-flex>
          <v-flex xs2>
            <strong>Pre Sales</strong>
          </v-flex>
        </v-layout>
      </v-flex>
      <div class="px-1" style="position:relative">
        <v-card class="searchbar">
          <v-text-field
            v-model="search"
            append-icon="mdi-magnify"
            label="Search"
            single-line
            hide-details
            @focus="showSearch = true"
            @blur="showSearch = false"
          >
          </v-text-field>
          <div v-if="showSearch" style="position:absolute;z-index:100">
            <v-data-table
              :headers="headers"
              :hide-default-footer="true"
              :items="appUsers"
              :search="search"
            >
            </v-data-table>
          </div>
        </v-card>
      </div>
      <div class="px-4">
        <router-link to="/adduser">Add User</router-link>
      </div>
      <v-flex xs12>
        <v-layout row wrap>
          <v-flex pl-3>
            <v-flex class="floor-map--rooms board-room">
              <span>Board Room</span>
            </v-flex>
          </v-flex>
          <v-flex>
            <v-flex class="floor-map--rooms board-room">
              <span>Sanjay</span>
            </v-flex>
          </v-flex>
          <v-flex>
            <v-flex class="floor-map--rooms board-room">
              <span>Prasanna</span>
            </v-flex>
          </v-flex>
          <v-flex>
            <v-flex class="floor-map--rooms board-room">
              <span>Lounge</span>
            </v-flex>
            <v-flex class="floor-map--rooms board-room">
              <span>Rashi</span>
            </v-flex>
          </v-flex>
          <v-flex class="floor-map__ahu-room">
            <v-flex class="floor-map--rooms board-room">
              <span>AHU</span>
            </v-flex>
          </v-flex>
          <v-flex>
            <v-flex class="floor-map--rooms small-room">
              <span>EC1</span>
            </v-flex>
          </v-flex>
          <v-flex>
            <v-flex class="floor-map--rooms small-room">
              <span>EC2</span>
            </v-flex>
          </v-flex>
          <v-flex>
            <v-flex class="floor-map--rooms small-room">
              <span>EC3</span>
            </v-flex>
          </v-flex>
          <v-flex>
            <v-flex class="floor-map--rooms small-room">
              <span>VP5</span>
            </v-flex>
          </v-flex>
          <v-flex>
            <v-flex class="floor-map--rooms small-room">
              <span>VP6</span>
            </v-flex>
          </v-flex>
        </v-layout>
      </v-flex>
      <v-flex xs2 class="floor-map__lab-room">
        <v-flex class="floor-map--rooms board-room">
          <span class="icons"
            ><i title="Lab" class="fas fa-vials"></i> <small>LAB</small></span
          >
        </v-flex>
        <v-layout wrap>
          <v-flex class="floor-map--rooms board-room">
            <span class="icons"
              ><i class="fas fa-table-tennis"></i>
              <small>Table Tennis</small></span
            >
          </v-flex>
          <v-flex class="floor-map--rooms lab-room">Training Room</v-flex>
        </v-layout>
        <v-flex class="floor-map--rooms board-room">
          <span>Board Room</span>
        </v-flex>
        <!-- here the code starts -->
        <!-- <v-flex mt-10 class="floor-map__team">
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(1)" deskNumber="1" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(2)" deskNumber="2" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(3)" deskNumber="3" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(4)" deskNumber="4" />
          </v-flex>
        </v-flex>-->
      </v-flex>
      <v-flex ml-5>
        <v-flex class="floor-map__team">
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(335)" deskNumber="335" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(336)" deskNumber="336" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(337)" deskNumber="337" />
          </v-flex>
        </v-flex>
        <v-flex mt-4 class="floor-map__team">
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(334)" deskNumber="334" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(333)" deskNumber="333" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(332)" deskNumber="332" />
          </v-flex>
        </v-flex>
        <v-flex class="floor-map__team">
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(329)" deskNumber="329" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(330)" deskNumber="330" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(331)" deskNumber="331" />
          </v-flex>
        </v-flex>
        <v-flex mt-4 class="floor-map__team">
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(328)" deskNumber="328" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(327)" deskNumber="327" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(326)" deskNumber="326" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(325)" deskNumber="325" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(324)" deskNumber="324" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(323)" deskNumber="323" />
          </v-flex>
        </v-flex>
        <v-flex mt-4 class="floor-map__team">
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(317)" deskNumber="317" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(318)" deskNumber="318" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(319)" deskNumber="319" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(320)" deskNumber="320" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(321)" deskNumber="321" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(322)" deskNumber="322" />
          </v-flex>
        </v-flex>
        <v-flex class="floor-map__team">
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(316)" deskNumber="316" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(315)" deskNumber="315" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(314)" deskNumber="314" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(313)" deskNumber="313" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(312)" deskNumber="312" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(311)" deskNumber="311" />
          </v-flex>
        </v-flex>
        <v-flex mt-4 class="floor-map__team">
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(307)" deskNumber="307" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(308)" deskNumber="308" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(309)" deskNumber="309" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(310)" deskNumber="310" />
          </v-flex>
        </v-flex>
        <v-flex mt-10 class="floor-map__team">
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(306)" deskNumber="306" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(295)" deskNumber="295" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(294)" deskNumber="294" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(285)" deskNumber="285" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(284)" deskNumber="284" />
          </v-flex>
        </v-flex>
        <v-flex class="floor-map__team">
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(305)" deskNumber="305" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(296)" deskNumber="296" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(293)" deskNumber="293" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(286)" deskNumber="286" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(283)" deskNumber="283" />
          </v-flex>
        </v-flex>
        <v-flex class="floor-map__team">
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(304)" deskNumber="304" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(297)" deskNumber="297" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(292)" deskNumber="292" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(287)" deskNumber="287" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(282)" deskNumber="282" />
          </v-flex>
        </v-flex>
        <v-flex class="floor-map__team">
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(303)" deskNumber="303" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(298)" deskNumber="298" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(291)" deskNumber="291" />
          </v-flex>
        </v-flex>
        <v-flex class="floor-map__team">
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(302)" deskNumber="302" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(299)" deskNumber="299" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(290)" deskNumber="290" />
          </v-flex>
        </v-flex>
        <v-flex class="floor-map__team">
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(301)" deskNumber="301" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(300)" deskNumber="300" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(289)" deskNumber="289" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(288)" deskNumber="288" />
          </v-flex>
          <v-flex class="floor-map__team--seat">
            <desk :users="getuser(281)" deskNumber="281" />
          </v-flex>
        </v-flex>
      </v-flex>
      <v-flex xs3 class="floor-map__center-sitting">
        <v-layout row wrap>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(202)" deskNumber="202" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(193)" deskNumber="193" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(192)" deskNumber="192" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(183)" deskNumber="183" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(182)" deskNumber="182" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(173)" deskNumber="173" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout row wrap>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(201)" deskNumber="201" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(194)" deskNumber="194" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(191)" deskNumber="191" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(184)" deskNumber="184" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(181)" deskNumber="181" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(174)" deskNumber="174" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout row wrap>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(200)" deskNumber="200" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(195)" deskNumber="195" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(190)" deskNumber="190" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(185)" deskNumber="185" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(180)" deskNumber="180" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(175)" deskNumber="175" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout row wrap>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(199)" deskNumber="199" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(196)" deskNumber="196" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(189)" deskNumber="189" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(186)" deskNumber="186" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(179)" deskNumber="179" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(176)" deskNumber="176" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout row wrap>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(198)" deskNumber="198" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(197)" deskNumber="197" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(188)" deskNumber="188" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(187)" deskNumber="187" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(178)" deskNumber="178" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(177)" deskNumber="177" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <!--<v-layout row wrap>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>-->
        <v-layout mt-4 row wrap>
          <v-flex xs4> </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(222)" deskNumber="222" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(213)" deskNumber="213" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(212)" deskNumber="212" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(203)" deskNumber="203" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout row wrap>
          <v-flex xs4> </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(221)" deskNumber="221" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(214)" deskNumber="214" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(211)" deskNumber="211" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(204)" deskNumber="204" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout row wrap>
          <v-flex xs4> </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(220)" deskNumber="220" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(215)" deskNumber="215" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(210)" deskNumber="210" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(205)" deskNumber="205" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout row wrap>
          <v-flex xs4> </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(219)" deskNumber="219" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(216)" deskNumber="216" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(209)" deskNumber="209" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(206)" deskNumber="206" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout row wrap>
          <v-flex xs4> </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(218)" deskNumber="218" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(217)" deskNumber="217" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs4>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(208)" deskNumber="208" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(207)" deskNumber="207" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <!-- <v-layout mt-4 row wrap>
          <v-flex xs4> </v-flex>
          <v-flex xs8>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>-->
      </v-flex>
      <v-flex xs4 class="floor-map__last-sitting">
        <v-layout justify-space-between row wrap>
          <v-flex xs2> </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(32)" deskNumber="32" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(25)" deskNumber="25" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(24)" deskNumber="24" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(17)" deskNumber="17" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(16)" deskNumber="16" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(9)" deskNumber="9" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(8)" deskNumber="8" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(1)" deskNumber="1" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout justify-space-between row wrap>
          <v-flex xs2> </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(31)" deskNumber="31" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(26)" deskNumber="26" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(23)" deskNumber="23" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(18)" deskNumber="18" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(15)" deskNumber="15" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(10)" deskNumber="10" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(7)" deskNumber="7" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(2)" deskNumber="2" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout justify-space-between row wrap>
          <v-flex xs2> </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(30)" deskNumber="30" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(27)" deskNumber="27" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(22)" deskNumber="22" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(19)" deskNumber="19" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(14)" deskNumber="14" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(11)" deskNumber="11" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(6)" deskNumber="6" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(3)" deskNumber="3" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout justify-space-between row wrap>
          <v-flex xs2> </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(29)" deskNumber="29" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(28)" deskNumber="28" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(21)" deskNumber="21" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(20)" deskNumber="20" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(13)" deskNumber="13" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(12)" deskNumber="12" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(5)" deskNumber="5" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(4)" deskNumber="4" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout justify-space-between mt-4 row wrap>
          <v-flex xs2 text-right>
            <!-- <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(17)" deskNumber="17"/>
              </v-flex>
            </v-flex>-->
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(41)" deskNumber="41" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(42)" deskNumber="42" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2 text-right>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(51)" deskNumber="51" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(60)" deskNumber="60" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(61)" deskNumber="61" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(70)" deskNumber="70" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout justify-space-between row wrap>
          <v-flex xs2 text-right>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(33)" deskNumber="33" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(40)" deskNumber="40" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(43)" deskNumber="43" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(50)" deskNumber="50" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(52)" deskNumber="52" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(59)" deskNumber="59" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(62)" deskNumber="62" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(69)" deskNumber="69" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(71)" deskNumber="71" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout justify-space-between row wrap>
          <v-flex xs2 text-right>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(34)" deskNumber="34" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(39)" deskNumber="39" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(44)" deskNumber="44" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(49)" deskNumber="49" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(53)" deskNumber="53" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(58)" deskNumber="58" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(63)" deskNumber="63" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(68)" deskNumber="68" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(72)" deskNumber="72" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout justify-space-between row wrap>
          <v-flex xs2 text-right>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(35)" deskNumber="35" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(38)" deskNumber="38" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(45)" deskNumber="45" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(48)" deskNumber="48" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(54)" deskNumber="54" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(57)" deskNumber="57" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(64)" deskNumber="64" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(67)" deskNumber="67" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(73)" deskNumber="73" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout justify-space-between row wrap>
          <v-flex xs2 text-right>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(36)" deskNumber="36" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(37)" deskNumber="37" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(46)" deskNumber="46" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(47)" deskNumber="47" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(55)" deskNumber="55" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(56)" deskNumber="56" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(65)" deskNumber="65" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(66)" deskNumber="66" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(74)" deskNumber="74" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <!--  <v-layout justify-space-between row wrap>
          <v-flex xs2> </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>-->
        <v-layout justify-space-between mt-4 row wrap>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(110)" deskNumber="110" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(109)" deskNumber="109" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(100)" deskNumber="100" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(99)" deskNumber="99" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(92)" deskNumber="92" />
              </v-flex>
              <!--<v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>-->
            </v-flex>
          </v-flex>
          <v-flex xs2 text-right>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(83)" deskNumber="83" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(82)" deskNumber="82" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(75)" deskNumber="75" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout justify-space-between row wrap>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(111)" deskNumber="111" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(108)" deskNumber="108" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(101)" deskNumber="101" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(98)" deskNumber="98" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(93)" deskNumber="93" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(91)" deskNumber="91" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2 text-right>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(84)" deskNumber="84" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(81)" deskNumber="81" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(76)" deskNumber="76" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout justify-space-between row wrap>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(112)" deskNumber="112" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(107)" deskNumber="107" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(102)" deskNumber="102" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(97)" deskNumber="97" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(94)" deskNumber="94" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(90)" deskNumber="90" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2 text-right>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(85)" deskNumber="85" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(80)" deskNumber="80" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(77)" deskNumber="77" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout justify-space-between row wrap>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(113)" deskNumber="113" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(106)" deskNumber="106" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(103)" deskNumber="103" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(96)" deskNumber="96" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2 text-right>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(89)" deskNumber="89" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2 text-right>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(86)" deskNumber="86" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(79)" deskNumber="79" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout justify-space-between row wrap>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(114)" deskNumber="114" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(105)" deskNumber="105" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(102)" deskNumber="102" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(95)" deskNumber="95" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2 text-right>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(88)" deskNumber="88" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2 text-right>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(85)" deskNumber="85" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(78)" deskNumber="78" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout justify-space-between mt-4 row wrap>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(115)" deskNumber="115" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(126)" deskNumber="126" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(127)" deskNumber="127" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(138)" deskNumber="138" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(139)" deskNumber="139" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(150)" deskNumber="150" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(151)" deskNumber="151" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(162)" deskNumber="162" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(163)" deskNumber="163" />
              </v-flex>
              <!--<v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>-->
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout justify-space-between row wrap>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(116)" deskNumber="116" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(125)" deskNumber="125" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(128)" deskNumber="128" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(137)" deskNumber="137" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(140)" deskNumber="140" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(149)" deskNumber="149" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(152)" deskNumber="152" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(161)" deskNumber="161" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(164)" deskNumber="164" />
              </v-flex>
              <!-- <v-flex class="floor-map__team--seat">
                <desk />
              </v-flex>-->
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout justify-space-between row wrap>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(117)" deskNumber="117" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(124)" deskNumber="124" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(129)" deskNumber="129" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(136)" deskNumber="136" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(141)" deskNumber="141" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(148)" deskNumber="148" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(153)" deskNumber="153" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(160)" deskNumber="160" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(165)" deskNumber="165" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(172)" deskNumber="172" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout justify-space-between row wrap>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(118)" deskNumber="118" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(123)" deskNumber="123" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(130)" deskNumber="130" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(135)" deskNumber="135" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(142)" deskNumber="142" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(147)" deskNumber="147" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(154)" deskNumber="154" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(159)" deskNumber="159" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(166)" deskNumber="166" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(171)" deskNumber="171" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout justify-space-between row wrap>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(119)" deskNumber="119" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(122)" deskNumber="122" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(131)" deskNumber="131" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(134)" deskNumber="134" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(143)" deskNumber="143" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(146)" deskNumber="146" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(155)" deskNumber="155" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(158)" deskNumber="158" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(167)" deskNumber="167" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(170)" deskNumber="170" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
        <v-layout justify-space-between row wrap>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(120)" deskNumber="120" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(121)" deskNumber="121" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(132)" deskNumber="132" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(133)" deskNumber="133" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(144)" deskNumber="144" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(145)" deskNumber="145" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(156)" deskNumber="156" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(157)" deskNumber="157" />
              </v-flex>
            </v-flex>
          </v-flex>
          <v-flex xs2>
            <v-flex class="floor-map__team">
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(168)" deskNumber="168" />
              </v-flex>
              <v-flex class="floor-map__team--seat">
                <desk :users="getuser(169)" deskNumber="169" />
              </v-flex>
            </v-flex>
          </v-flex>
        </v-layout>
      </v-flex>
    </v-layout>
  </v-container>
</template>

<script lang="js">

import Desk from "../components/floor-map/desk.vue";
import axios from "axios";
import { mapActions } from 'vuex'
import {mapGetters} from 'vuex'
export default {
    name: 'floor-map',
    props: [],

      computed: {
  ...mapGetters(['getUsers']),
  filterList() {
    console.log('appUsers',JSON.stringify(this.appUsers))
      return this.appUsers.filter(user => {
        return user.emailId.match(this.search);
      });
    }
    },
     created(){
          axios.get("http://localhost:8089/employee/getEmployees").then(res=>{
       this.appUsers=res.data;
          })
          this.gettingUsers();

           console.log("checking",JSON.stringify(this.appUsers))
        },
    data() {
        return { search: "",
        showSearch:false,
          appUsers:[],
          headers: [
        {
          text: 'DeskNo',
          align: 'start',
          sortable: true,
          value: 'deskNo'
        },
        { text: 'EmailId', value: 'emailId' },
         { text: 'Locker Number', value: 'lockerNo'},
         { text: 'Responsibilities', value: 'responsibilities'}
      ]
        }
    },
    components:{
      Desk
        },

    methods: {
       ...mapActions(['gettingUsers']),
      getAllUsers(){
        /* axios.get('../pacts/users.json').then(
          res =>{
            this.appUsers =res;
          }
        ) */
      /*  this.appUsers = [
              {
                "deskNo": 1,
                "lockerNo": 201,
                "assets": [{ "assetType": "Laptop", "assetNo": "HW 0240" }],
                "accessCardNo": 343243,
                "emailId": "sunil@gmail.com",
                "profilePicId": 12,
                "designations": [{ "title": "SE", "effectiveFrom": "2020-01-02" }],
                "departments": [
                  { "departmentId": 1, "startDate": "2010-02-12", "endDate": "2020-01-02" },
                  { "departmentId": 2, "startDate": "2010-02-12", "endDate": "2020-01-02" }
                ],
                "skills": [
                  { "name": "java", "certification": 1, "teach": 1, "likeToWork": 1 }
                ],
                "shift": { "name": "day" },
                "salary": {
                  "currentSalary": 1000,
                  "increments": [
                    { "percentage": 10, "effectiveFrom": "2019-02-02" },
                    { "percentage": 30, "effectiveFrom": "2020-04-02" }
                  ]
                },
                "awards": [1, 2],
                "experience": 6,
                "lnd": ["java", "spring"],
                "responsibilities": ["AC remote operator", "water supplier"],
                "bandwidth": 1
              },
              {
                "deskNo": 1,
                "lockerNo": 201,
                "assets": [{ "assetType": "Laptop", "assetNo": "HW 0240" }],
                "accessCardNo": 343243,
                "emailId": "sunil@gmail.com",
                "profilePicId": 12,
                "designations": [{ "title": "SE", "effectiveFrom": "2020-01-02" }],
                "departments": [
                  { "departmentId": 1, "startDate": "2010-02-12", "endDate": "2020-01-02" },
                  { "departmentId": 2, "startDate": "2010-02-12", "endDate": "2020-01-02" }
                ],
                "skills": [
                  { "name": "java", "certification": 1, "teach": 1, "likeToWork": 1 }
                ],
                "shift": { "name": "day" },
                "salary": {
                  "currentSalary": 1000,
                  "increments": [
                    { "percentage": 10, "effectiveFrom": "2019-02-02" },
                    { "percentage": 30, "effectiveFrom": "2020-04-02" }
                  ]
                },
                "awards": [1, 2],
                "experience": 6,
                "lnd": ["java", "spring"],
                "responsibilities": ["AC remote operator", "water supplier"],
                "bandwidth": 1
              },
              {
                "deskNo": 1,
                "lockerNo": 201,
                "assets": [{ "assetType": "Laptop", "assetNo": "HW 0240" }],
                "accessCardNo": 343243,
                "emailId": "sunil@gmail.com",
                "profilePicId": 12,
                "designations": [{ "title": "SE", "effectiveFrom": "2020-01-02" }],
                "departments": [
                  { "departmentId": 1, "startDate": "2010-02-12", "endDate": "2020-01-02" },
                  { "departmentId": 2, "startDate": "2010-02-12", "endDate": "2020-01-02" }
                ],
                "skills": [
                  { "name": "java", "certification": 1, "teach": 1, "likeToWork": 1 }
                ],
                "shift": { "name": "day" },
                "salary": {
                  "currentSalary": 1000,
                  "increments": [
                    { "percentage": 10, "effectiveFrom": "2019-02-02" },
                    { "percentage": 30, "effectiveFrom": "2020-04-02" }
                  ]
                },
                "awards": [1, 2],
                "experience": 6,
                "lnd": ["java", "spring"],
                "responsibilities": ["AC remote operator", "water supplier"],
                "bandwidth": 1
              },
              {
                "deskNo": 1,
                "lockerNo": 201,
                "assets": [{ "assetType": "Laptop", "assetNo": "HW 0240" }],
                "accessCardNo": 343243,
                "emailId": "sunil@gmail.com",
                "profilePicId": 12,
                "designations": [{ "title": "SE", "effectiveFrom": "2020-01-02" }],
                "departments": [
                  { "departmentId": 1, "startDate": "2010-02-12", "endDate": "2020-01-02" },
                  { "departmentId": 2, "startDate": "2010-02-12", "endDate": "2020-01-02" }
                ],
                "skills": [
                  { "name": "java", "certification": 1, "teach": 1, "likeToWork": 1 }
                ],
                "shift": { "name": "day" },
                "salary": {
                  "currentSalary": 1000,
                  "increments": [
                    { "percentage": 10, "effectiveFrom": "2019-02-02" },
                    { "percentage": 30, "effectiveFrom": "2020-04-02" }
                  ]
                },
                "awards": [1, 2],
                "experience": 6,
                "lnd": ["java", "spring"],
                "responsibilities": ["AC remote operator", "water supplier"],
                "bandwidth": 1
              },
              {
                "deskNo": 1,
                "lockerNo": 201,
                "assets": [{ "assetType": "Laptop", "assetNo": "HW 0240" }],
                "accessCardNo": 343243,
                "emailId": "sunil@gmail.com",
                "profilePicId": 12,
                "designations": [{ "title": "SE", "effectiveFrom": "2020-01-02" }],
                "departments": [
                  { "departmentId": 1, "startDate": "2010-02-12", "endDate": "2020-01-02" },
                  { "departmentId": 2, "startDate": "2010-02-12", "endDate": "2020-01-02" }
                ],
                "skills": [
                  { "name": "java", "certification": 1, "teach": 1, "likeToWork": 1 }
                ],
                "shift": { "name": "day" },
                "salary": {
                  "currentSalary": 1000,
                  "increments": [
                    { "percentage": 10, "effectiveFrom": "2019-02-02" },
                    { "percentage": 30, "effectiveFrom": "2020-04-02" }
                  ]
                },
                "awards": [1, 2],
                "experience": 6,
                "lnd": ["java", "spring"],
                "responsibilities": ["AC remote operator", "water supplier"],
                "bandwidth": 1
              },
              {
                "deskNo": 1,
                "lockerNo": 201,
                "assets": [{ "assetType": "Laptop", "assetNo": "HW 0240" }],
                "accessCardNo": 343243,
                "emailId": "sunil@gmail.com",
                "profilePicId": 12,
                "designations": [{ "title": "SE", "effectiveFrom": "2020-01-02" }],
                "departments": [
                  { "departmentId": 1, "startDate": "2010-02-12", "endDate": "2020-01-02" },
                  { "departmentId": 2, "startDate": "2010-02-12", "endDate": "2020-01-02" }
                ],
                "skills": [
                  { "name": "java", "certification": 1, "teach": 1, "likeToWork": 1 }
                ],
                "shift": { "name": "day" },
                "salary": {
                  "currentSalary": 1000,
                  "increments": [
                    { "percentage": 10, "effectiveFrom": "2019-02-02" },
                    { "percentage": 30, "effectiveFrom": "2020-04-02" }
                  ]
                },
                "awards": [1, 2],
                "experience": 6,
                "lnd": ["java", "spring"],
                "responsibilities": ["AC remote operator", "water supplier"],
                "bandwidth": 1
              },
              {
                "deskNo": 1,
                "lockerNo": 201,
                "assets": [{ "assetType": "Laptop", "assetNo": "HW 0240" }],
                "accessCardNo": 343243,
                "emailId": "sunil@gmail.com",
                "profilePicId": 12,
                "designations": [{ "title": "SE", "effectiveFrom": "2020-01-02" }],
                "departments": [
                  { "departmentId": 1, "startDate": "2010-02-12", "endDate": "2020-01-02" },
                  { "departmentId": 2, "startDate": "2010-02-12", "endDate": "2020-01-02" }
                ],
                "skills": [
                  { "name": "java", "certification": 1, "teach": 1, "likeToWork": 1 }
                ],
                "shift": { "name": "day" },
                "salary": {
                  "currentSalary": 1000,
                  "increments": [
                    { "percentage": 10, "effectiveFrom": "2019-02-02" },
                    { "percentage": 30, "effectiveFrom": "2020-04-02" }
                  ]
                },
                "awards": [1, 2],
                "experience": 6,
                "lnd": ["java", "spring"],
                "responsibilities": ["AC remote operator", "water supplier"],
                "bandwidth": 1
              },
              {
                "deskNo": 1,
                "lockerNo": 201,
                "assets": [{ "assetType": "Laptop", "assetNo": "HW 0240" }],
                "accessCardNo": 343243,
                "emailId": "sunil@gmail.com",
                "profilePicId": 12,
                "designations": [{ "title": "SE", "effectiveFrom": "2020-01-02" }],
                "departments": [
                  { "departmentId": 1, "startDate": "2010-02-12", "endDate": "2020-01-02" },
                  { "departmentId": 2, "startDate": "2010-02-12", "endDate": "2020-01-02" }
                ],
                "skills": [
                  { "name": "java", "certification": 1, "teach": 1, "likeToWork": 1 }
                ],
                "shift": { "name": "day" },
                "salary": {
                  "currentSalary": 1000,
                  "increments": [
                    { "percentage": 10, "effectiveFrom": "2019-02-02" },
                    { "percentage": 30, "effectiveFrom": "2020-04-02" }
                  ]
                },
                "awards": [1, 2],
                "experience": 6,
                "lnd": ["java", "spring"],
                "responsibilities": ["AC remote operator", "water supplier"],
                "bandwidth": 1
              },
              {
                "deskNo": 1,
                "lockerNo": 201,
                "assets": [{ "assetType": "Laptop", "assetNo": "HW 0240" }],
                "accessCardNo": 343243,
                "emailId": "sunil@gmail.com",
                "profilePicId": 12,
                "designations": [{ "title": "SE", "effectiveFrom": "2020-01-02" }],
                "departments": [
                  { "departmentId": 1, "startDate": "2010-02-12", "endDate": "2020-01-02" },
                  { "departmentId": 2, "startDate": "2010-02-12", "endDate": "2020-01-02" }
                ],
                "skills": [
                  { "name": "java", "certification": 1, "teach": 1, "likeToWork": 1 }
                ],
                "shift": { "name": "day" },
                "salary": {
                  "currentSalary": 1000,
                  "increments": [
                    { "percentage": 10, "effectiveFrom": "2019-02-02" },
                    { "percentage": 30, "effectiveFrom": "2020-04-02" }
                  ]
                },
                "awards": [1, 2],
                "experience": 6,
                "lnd": ["java", "spring"],
                "responsibilities": ["AC remote operator", "water supplier"],
                "bandwidth": 1
              },
              {
                "deskNo": 1,
                "lockerNo": 201,
                "assets": [{ "assetType": "Laptop", "assetNo": "HW 0240" }],
                "accessCardNo": 343243,
                "emailId": "sunil@gmail.com",
                "profilePicId": 12,
                "designations": [{ "title": "SE", "effectiveFrom": "2020-01-02" }],
                "departments": [
                  { "departmentId": 1, "startDate": "2010-02-12", "endDate": "2020-01-02" },
                  { "departmentId": 2, "startDate": "2010-02-12", "endDate": "2020-01-02" }
                ],
                "skills": [
                  { "name": "java", "certification": 1, "teach": 1, "likeToWork": 1 }
                ],
                "shift": { "name": "day" },
                "salary": {
                  "currentSalary": 1000,
                  "increments": [
                    { "percentage": 10, "effectiveFrom": "2019-02-02" },
                    { "percentage": 30, "effectiveFrom": "2020-04-02" }
                  ]
                },
                "awards": [1, 2],
                "experience": 6,
                "lnd": ["java", "spring"],
                "responsibilities": ["AC remote operator", "water supplier"],
                "bandwidth": 1
              }
]*/

      },
        getuser(desk) {
         return this.getUsers.filter(
           (user)=>{
             return user.deskNo == desk;
           }
         )

        }
    },

}
</script>

<style lang="scss" scoped>
.floor-map {
  background-color: #f5f5f5;
  padding: 10px;
  &__team {
    &--seat {
      width: 30px;
      height: 30px;
      //   border: 1px solid #d6d6d6;
      text-align: center;
      border-radius: 4px;
      position: relative;
      display: inline-block;

      &:hover {
        .details {
          display: block;
        }
      }

      a {
        display: flex;
        justify-content: center;
        font-size: 11px;
        color: #9c9c9c;
        line-height: 30px;
        font-weight: 600;
        text-decoration: none;
      }

      .details {
        position: absolute;
        display: none;
        background-color: #f3f3f3;
        min-width: 200px;
        z-index: 2;
        font-size: 13px;
        text-align: justify;
        padding: 10px;

        span,
        a {
          display: block;
          line-height: normal;
          font-weight: normal;
        }

        a {
          font-size: 13px;
        }

        span {
          padding-top: 10px;
        }
      }
    }
  }
  &__center-sitting {
    padding-right: 60px;
  }
  &__last-sitting {
    margin-top: -120px;
  }
  &__ahu-room {
    padding-left: 200px;
  }
  &__lab-room {
    margin-top: -100px;
  }
  &--rooms {
    min-height: 100px;
    align-items: center;
    display: flex;
    margin: 2px;
    justify-content: center;
    background-color: #ffffff;
    &.small-room {
      min-height: 50px;
    }
    .icons {
      text-align: center;
      i {
        font-size: 30px;
        &.fa-vials {
          color: #ff7600;
        }
        &.fa-table-tennis {
          color: #3570dc;
        }
      }
      small {
        font-size: 16px;
        font-weight: 600;
        display: block;
      }
    }
  }
}
</style>
